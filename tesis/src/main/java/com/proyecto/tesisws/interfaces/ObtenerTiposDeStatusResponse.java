
package com.proyecto.tesisws.interfaces;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerTiposDeStatusResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerTiposDeStatusResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaTipoStatus" type="{http://interfaces.tesisws.proyecto.com/}tipostatus" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerTiposDeStatusResponse", propOrder = {
    "listaTipoStatus"
})
public class ObtenerTiposDeStatusResponse {

    protected List<Tipostatus> listaTipoStatus;

    /**
     * Gets the value of the listaTipoStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaTipoStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaTipoStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tipostatus }
     * 
     * 
     */
    public List<Tipostatus> getListaTipoStatus() {
        if (listaTipoStatus == null) {
            listaTipoStatus = new ArrayList<Tipostatus>();
        }
        return this.listaTipoStatus;
    }

}
