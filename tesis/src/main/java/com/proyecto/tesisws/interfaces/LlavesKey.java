
package com.proyecto.tesisws.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para llavesKey complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="llavesKey">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idTipoLlave" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idVehiculo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "llavesKey", propOrder = {
    "idTipoLlave",
    "idVehiculo"
})
@XmlSeeAlso({
    Llaves.class
})
public class LlavesKey {

    protected Integer idTipoLlave;
    protected Integer idVehiculo;

    /**
     * Obtiene el valor de la propiedad idTipoLlave.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdTipoLlave() {
        return idTipoLlave;
    }

    /**
     * Define el valor de la propiedad idTipoLlave.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdTipoLlave(Integer value) {
        this.idTipoLlave = value;
    }

    /**
     * Obtiene el valor de la propiedad idVehiculo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdVehiculo() {
        return idVehiculo;
    }

    /**
     * Define el valor de la propiedad idVehiculo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdVehiculo(Integer value) {
        this.idVehiculo = value;
    }

}
