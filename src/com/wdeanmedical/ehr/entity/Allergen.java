/*
 * WDean Medical is distributed under the
 * GNU Lesser General Public License (GNU LGPL).
 * For details see: http://www.wdeanmedical.com
 * copyright 2013-2014 WDean Medical
 */
 
package com.wdeanmedical.ehr.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "allergen")
public class Allergen extends BaseEntity implements Serializable {
  private static final long serialVersionUID = 8117552004340724207L;

  private String name;

  public Allergen() {
  }

  @Column(name = "name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) { return true; }
    if (!super.equals(obj)) { return false; }
    if (getClass() != obj.getClass()) { return false; }
    Allergen other = (Allergen) obj;
    if (name == null) {
      if (other.name != null) { return false; }
    } 
    else if (!name.equals(other.name)) { return false; }
    return true;
  }

  @Override
  public String toString() {
    return "Allergen [name=" + name + "]";
  }

}
