
package com.proyecto.tesisws.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para actualizarStatusInvitacionPorIdDestinatario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="actualizarStatusInvitacionPorIdDestinatario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idDestinatario" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="statusInvitacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actualizarStatusInvitacionPorIdDestinatario", propOrder = {
    "idDestinatario",
    "statusInvitacion"
})
public class ActualizarStatusInvitacionPorIdDestinatario {

    protected Integer idDestinatario;
    protected Integer statusInvitacion;

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

    /**
     * Obtiene el valor de la propiedad statusInvitacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatusInvitacion() {
        return statusInvitacion;
    }

    /**
     * Define el valor de la propiedad statusInvitacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatusInvitacion(Integer value) {
        this.statusInvitacion = value;
    }

}
