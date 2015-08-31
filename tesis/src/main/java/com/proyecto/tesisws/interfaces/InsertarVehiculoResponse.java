
package com.proyecto.tesisws.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para insertarVehiculoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insertarVehiculoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idVehiculo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertarVehiculoResponse", propOrder = {
    "idVehiculo"
})
public class InsertarVehiculoResponse {

    protected int idVehiculo;

    /**
     * Obtiene el valor de la propiedad idVehiculo.
     * 
     */
    public int getIdVehiculo() {
        return idVehiculo;
    }

    /**
     * Define el valor de la propiedad idVehiculo.
     * 
     */
    public void setIdVehiculo(int value) {
        this.idVehiculo = value;
    }

}
