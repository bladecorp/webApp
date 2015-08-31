
package com.proyecto.tesisws.interfaces;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerTiposDeVehiculoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerTiposDeVehiculoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaTipoVehiculo" type="{http://interfaces.tesisws.proyecto.com/}tipovehiculo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerTiposDeVehiculoResponse", propOrder = {
    "listaTipoVehiculo"
})
public class ObtenerTiposDeVehiculoResponse {

    protected List<Tipovehiculo> listaTipoVehiculo;

    /**
     * Gets the value of the listaTipoVehiculo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaTipoVehiculo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaTipoVehiculo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tipovehiculo }
     * 
     * 
     */
    public List<Tipovehiculo> getListaTipoVehiculo() {
        if (listaTipoVehiculo == null) {
            listaTipoVehiculo = new ArrayList<Tipovehiculo>();
        }
        return this.listaTipoVehiculo;
    }

}
