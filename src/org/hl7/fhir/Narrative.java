//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.12 at 12:19:07 PM EDT 
//


package org.hl7.fhir;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3._1999.xhtml.Div;


/**
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * 
 * <p>Java class for Narrative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Narrative">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Element">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://hl7.org/fhir}NarrativeStatus"/>
 *         &lt;element ref="{http://www.w3.org/1999/xhtml}div"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Narrative", propOrder = {
    "status",
    "div"
})
public class Narrative
    extends Element
{

    @XmlElement(required = true)
    protected NarrativeStatus status;
    @XmlElement(namespace = "http://www.w3.org/1999/xhtml", required = true)
    protected Div div;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link NarrativeStatus }
     *     
     */
    public NarrativeStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link NarrativeStatus }
     *     
     */
    public void setStatus(NarrativeStatus value) {
        this.status = value;
    }

    /**
     * The actual narrative content, a stripped down version of XHTML.
     * 
     * @return
     *     possible object is
     *     {@link Div }
     *     
     */
    public Div getDiv() {
        return div;
    }

    /**
     * Sets the value of the div property.
     * 
     * @param value
     *     allowed object is
     *     {@link Div }
     *     
     */
    public void setDiv(Div value) {
        this.div = value;
    }

}
