
package com.proyecto.tesisws.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para actualizarVehiculo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="actualizarVehiculo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vehiculoDTO" type="{http://interfaces.tesisws.proyecto.com/}VehiculoDTO" minOccurs="0"/>
 *         &lt;element name="idUsuario" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actualizarVehiculo", propOrder = {
    "vehiculoDTO",
    "idUsuario"
})
public class ActualizarVehiculo {

    protected VehiculoDTO vehiculoDTO;
    protected Integer idUsuario;

    /**
     * Obtiene el valor de la propiedad vehiculoDTO.
     * 
     * @return
     *     possible object is
     *     {@link VehiculoDTO }
     *     
     */
    public VehiculoDTO getVehiculoDTO() {
        return vehiculoDTO;
    }

    /**
     * Define el valor de la propiedad vehiculoDTO.
     * 
     * @param value
     *     allowed object is
     *     {@link VehiculoDTO }
     *     
     */
    public void setVehiculoDTO(VehiculoDTO value) {
        this.vehiculoDTO = value;
    }

    /**
     * Obtiene el valor de la propiedad idUsuario.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdUsuario() {
        return idUsuario;
    }

    /**
     * Define el valor de la propiedad idUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdUsuario(Integer value) {
        this.idUsuario = value;
    }

}
