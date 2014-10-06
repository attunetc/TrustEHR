//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.12 at 12:19:07 PM EDT 
//


package org.hl7.fhir;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarePlanActivityCategory-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CarePlanActivityCategory-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="diet"/>
 *     &lt;enumeration value="drug"/>
 *     &lt;enumeration value="encounter"/>
 *     &lt;enumeration value="observation"/>
 *     &lt;enumeration value="procedure"/>
 *     &lt;enumeration value="supply"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CarePlanActivityCategory-list")
@XmlEnum
public enum CarePlanActivityCategoryList {


    /**
     * Plan for the patient to consume food of a specified nature.
     * 
     */
    @XmlEnumValue("diet")
    DIET("diet"),

    /**
     * Plan for the patient to consume/receive a drug, vaccine or other product.
     * 
     */
    @XmlEnumValue("drug")
    DRUG("drug"),

    /**
     * Plan to meet or communicate with the patient (in-patient, out-patient, phone call, etc.).
     * 
     */
    @XmlEnumValue("encounter")
    ENCOUNTER("encounter"),

    /**
     * Plan to capture information about a patient (vitals, labs, diagnostic images, etc.).
     * 
     */
    @XmlEnumValue("observation")
    OBSERVATION("observation"),

    /**
     * Plan to modify the patient in some way (surgery, physiotherapy, education, counseling, etc.).
     * 
     */
    @XmlEnumValue("procedure")
    PROCEDURE("procedure"),

    /**
     * Plan to provide something to the patient (medication, medical supply, etc.).
     * 
     */
    @XmlEnumValue("supply")
    SUPPLY("supply"),

    /**
     * Some other form of action.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final java.lang.String value;

    CarePlanActivityCategoryList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static CarePlanActivityCategoryList fromValue(java.lang.String v) {
        for (CarePlanActivityCategoryList c: CarePlanActivityCategoryList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
