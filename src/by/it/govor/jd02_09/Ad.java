//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 11:49:43 AM MSK 
//


package by.it.govor.jd02_09;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ad complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ad">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="processor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="video_card" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="motherboard" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ram" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="power_supply" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HDD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ad", propOrder = {

})
public class Ad {

    @XmlElement(required = true)
    protected String processor;
    @XmlElement(name = "video_card", required = true)
    protected String videoCard;
    @XmlElement(required = true)
    protected String motherboard;
    @XmlElement(required = true)
    protected String ram;
    @XmlElement(name = "power_supply", required = true)
    protected String powerSupply;
    @XmlElement(name = "HDD", required = true)
    protected String hdd;

    /**
     * Gets the value of the processor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessor() {
        return processor;
    }

    /**
     * Sets the value of the processor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessor(String value) {
        this.processor = value;
    }

    /**
     * Gets the value of the videoCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoCard() {
        return videoCard;
    }

    /**
     * Sets the value of the videoCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoCard(String value) {
        this.videoCard = value;
    }

    /**
     * Gets the value of the motherboard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherboard() {
        return motherboard;
    }

    /**
     * Sets the value of the motherboard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherboard(String value) {
        this.motherboard = value;
    }

    /**
     * Gets the value of the ram property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRam() {
        return ram;
    }

    /**
     * Sets the value of the ram property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRam(String value) {
        this.ram = value;
    }

    /**
     * Gets the value of the powerSupply property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowerSupply() {
        return powerSupply;
    }

    /**
     * Sets the value of the powerSupply property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowerSupply(String value) {
        this.powerSupply = value;
    }

    /**
     * Gets the value of the hdd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHDD() {
        return hdd;
    }

    /**
     * Sets the value of the hdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHDD(String value) {
        this.hdd = value;
    }

}
