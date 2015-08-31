
package com.proyecto.tesisws.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para enviarInvitacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="enviarInvitacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idVehiculo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idDestinatario" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enviarInvitacion", propOrder = {
    "idVehiculo",
    "idDestinatario"
})
public class EnviarInvitacion {

    protected Integer idVehiculo;
    protected Integer idDestinatario;

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

    /**
     * Obtiene el valor de la propiedad idDestinatario.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdDestinatario() {
        return idDestinatario;
    }

    /**
     * Define el valor de la propiedad idDestinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdDestinatario(Integer value) {
        this.idDestinatario = value;
    }

}
