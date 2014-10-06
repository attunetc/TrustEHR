//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.12 at 12:19:07 PM EDT 
//


package org.w3._1999.xhtml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				"Flow" mixes block and inline and is used for list items etc.
 * 			
 * 
 * <p>Java class for Flow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Flow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;choice>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}p"/>
 *             &lt;choice>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}h1"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}h2"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}h3"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}h4"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}h5"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}h6"/>
 *             &lt;/choice>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}div"/>
 *             &lt;choice>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}ul"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}ol"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}dl"/>
 *             &lt;/choice>
 *             &lt;choice>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}pre"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}hr"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}blockquote"/>
 *             &lt;/choice>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}table"/>
 *           &lt;/choice>
 *           &lt;choice>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}a"/>
 *             &lt;choice>
 *               &lt;choice>
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}br"/>
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}span"/>
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}bdo"/>
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}map"/>
 *               &lt;/choice>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}img"/>
 *             &lt;/choice>
 *             &lt;choice>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}tt"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}i"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}b"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}big"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}small"/>
 *             &lt;/choice>
 *             &lt;choice>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}em"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}strong"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}dfn"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}code"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}q"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}samp"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}kbd"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}var"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}cite"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}abbr"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}acronym"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}sub"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}sup"/>
 *             &lt;/choice>
 *           &lt;/choice>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Flow", propOrder = {
    "content"
})
@XmlSeeAlso({
    Td.class,
    Th.class,
    Dd.class,
    Li.class,
    Div.class
})
public class Flow {

    @XmlElementRefs({
        @XmlElementRef(name = "strong", namespace = "http://www.w3.org/1999/xhtml", type = Strong.class),
        @XmlElementRef(name = "i", namespace = "http://www.w3.org/1999/xhtml", type = I.class),
        @XmlElementRef(name = "var", namespace = "http://www.w3.org/1999/xhtml", type = Var.class),
        @XmlElementRef(name = "blockquote", namespace = "http://www.w3.org/1999/xhtml", type = Blockquote.class),
        @XmlElementRef(name = "small", namespace = "http://www.w3.org/1999/xhtml", type = Small.class),
        @XmlElementRef(name = "dl", namespace = "http://www.w3.org/1999/xhtml", type = Dl.class),
        @XmlElementRef(name = "samp", namespace = "http://www.w3.org/1999/xhtml", type = Samp.class),
        @XmlElementRef(name = "big", namespace = "http://www.w3.org/1999/xhtml", type = Big.class),
        @XmlElementRef(name = "p", namespace = "http://www.w3.org/1999/xhtml", type = P.class),
        @XmlElementRef(name = "code", namespace = "http://www.w3.org/1999/xhtml", type = Code.class),
        @XmlElementRef(name = "b", namespace = "http://www.w3.org/1999/xhtml", type = B.class),
        @XmlElementRef(name = "table", namespace = "http://www.w3.org/1999/xhtml", type = Table.class),
        @XmlElementRef(name = "abbr", namespace = "http://www.w3.org/1999/xhtml", type = Abbr.class),
        @XmlElementRef(name = "h3", namespace = "http://www.w3.org/1999/xhtml", type = H3 .class),
        @XmlElementRef(name = "br", namespace = "http://www.w3.org/1999/xhtml", type = Br.class),
        @XmlElementRef(name = "sup", namespace = "http://www.w3.org/1999/xhtml", type = Sup.class),
        @XmlElementRef(name = "span", namespace = "http://www.w3.org/1999/xhtml", type = Span.class),
        @XmlElementRef(name = "h2", namespace = "http://www.w3.org/1999/xhtml", type = H2 .class),
        @XmlElementRef(name = "h1", namespace = "http://www.w3.org/1999/xhtml", type = H1 .class),
        @XmlElementRef(name = "tt", namespace = "http://www.w3.org/1999/xhtml", type = Tt.class),
        @XmlElementRef(name = "dfn", namespace = "http://www.w3.org/1999/xhtml", type = Dfn.class),
        @XmlElementRef(name = "img", namespace = "http://www.w3.org/1999/xhtml", type = Img.class),
        @XmlElementRef(name = "h6", namespace = "http://www.w3.org/1999/xhtml", type = H6 .class),
        @XmlElementRef(name = "h4", namespace = "http://www.w3.org/1999/xhtml", type = H4 .class),
        @XmlElementRef(name = "em", namespace = "http://www.w3.org/1999/xhtml", type = Em.class),
        @XmlElementRef(name = "h5", namespace = "http://www.w3.org/1999/xhtml", type = H5 .class),
        @XmlElementRef(name = "acronym", namespace = "http://www.w3.org/1999/xhtml", type = Acronym.class),
        @XmlElementRef(name = "div", namespace = "http://www.w3.org/1999/xhtml", type = Div.class),
        @XmlElementRef(name = "sub", namespace = "http://www.w3.org/1999/xhtml", type = Sub.class),
        @XmlElementRef(name = "map", namespace = "http://www.w3.org/1999/xhtml", type = Map.class),
        @XmlElementRef(name = "bdo", namespace = "http://www.w3.org/1999/xhtml", type = Bdo.class),
        @XmlElementRef(name = "pre", namespace = "http://www.w3.org/1999/xhtml", type = Pre.class),
        @XmlElementRef(name = "hr", namespace = "http://www.w3.org/1999/xhtml", type = Hr.class),
        @XmlElementRef(name = "kbd", namespace = "http://www.w3.org/1999/xhtml", type = Kbd.class),
        @XmlElementRef(name = "q", namespace = "http://www.w3.org/1999/xhtml", type = Q.class),
        @XmlElementRef(name = "cite", namespace = "http://www.w3.org/1999/xhtml", type = Cite.class),
        @XmlElementRef(name = "a", namespace = "http://www.w3.org/1999/xhtml", type = A.class),
        @XmlElementRef(name = "ol", namespace = "http://www.w3.org/1999/xhtml", type = Ol.class),
        @XmlElementRef(name = "ul", namespace = "http://www.w3.org/1999/xhtml", type = Ul.class)
    })
    @XmlMixed
    protected List<Object> content;

    /**
     * 
     * 				"Flow" mixes block and inline and is used for list items etc.
     * 			Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Strong }
     * {@link I }
     * {@link Var }
     * {@link Blockquote }
     * {@link P }
     * {@link Big }
     * {@link Samp }
     * {@link Dl }
     * {@link Small }
     * {@link Code }
     * {@link B }
     * {@link Table }
     * {@link Abbr }
     * {@link H3 }
     * {@link Br }
     * {@link Sup }
     * {@link Span }
     * {@link Tt }
     * {@link H1 }
     * {@link H2 }
     * {@link Dfn }
     * {@link Img }
     * {@link H6 }
     * {@link H4 }
     * {@link Em }
     * {@link Acronym }
     * {@link H5 }
     * {@link Sub }
     * {@link Div }
     * {@link String }
     * {@link Bdo }
     * {@link Map }
     * {@link Pre }
     * {@link Hr }
     * {@link Kbd }
     * {@link Q }
     * {@link Cite }
     * {@link A }
     * {@link Ul }
     * {@link Ol }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

}
