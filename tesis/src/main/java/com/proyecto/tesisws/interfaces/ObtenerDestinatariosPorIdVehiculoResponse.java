
package com.proyecto.tesisws.interfaces;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerDestinatariosPorIdVehiculoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerDestinatariosPorIdVehiculoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaDestinatarios" type="{http://interfaces.tesisws.proyecto.com/}destinatarios" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerDestinatariosPorIdVehiculoResponse", propOrder = {
    "listaDestinatarios"
})
public class ObtenerDestinatariosPorIdVehiculoResponse {

    protected List<Destinatarios> listaDestinatarios;

    /**
     * Gets the value of the listaDestinatarios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaDestinatarios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaDestinatarios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Destinatarios }
     * 
     * 
     */
    public List<Destinatarios> getListaDestinatarios() {
        if (listaDestinatarios == null) {
            listaDestinatarios = new ArrayList<Destinatarios>();
        }
        return this.listaDestinatarios;
    }

}
