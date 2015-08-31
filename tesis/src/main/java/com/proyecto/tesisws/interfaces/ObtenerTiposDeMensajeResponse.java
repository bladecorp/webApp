
package com.proyecto.tesisws.interfaces;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerTiposDeMensajeResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerTiposDeMensajeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaTipoMensaje" type="{http://interfaces.tesisws.proyecto.com/}tipomensaje" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerTiposDeMensajeResponse", propOrder = {
    "listaTipoMensaje"
})
public class ObtenerTiposDeMensajeResponse {

    protected List<Tipomensaje> listaTipoMensaje;

    /**
     * Gets the value of the listaTipoMensaje property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaTipoMensaje property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaTipoMensaje().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tipomensaje }
     * 
     * 
     */
    public List<Tipomensaje> getListaTipoMensaje() {
        if (listaTipoMensaje == null) {
            listaTipoMensaje = new ArrayList<Tipomensaje>();
        }
        return this.listaTipoMensaje;
    }

}
