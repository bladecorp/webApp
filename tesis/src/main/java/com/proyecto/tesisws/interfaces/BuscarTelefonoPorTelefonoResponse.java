
package com.proyecto.tesisws.interfaces;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para buscarTelefonoPorTelefonoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="buscarTelefonoPorTelefonoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaTelefono" type="{http://interfaces.tesisws.proyecto.com/}telefonos" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscarTelefonoPorTelefonoResponse", propOrder = {
    "listaTelefono"
})
public class BuscarTelefonoPorTelefonoResponse {

    protected List<Telefonos> listaTelefono;

    /**
     * Gets the value of the listaTelefono property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaTelefono property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaTelefono().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Telefonos }
     * 
     * 
     */
    public List<Telefonos> getListaTelefono() {
        if (listaTelefono == null) {
            listaTelefono = new ArrayList<Telefonos>();
        }
        return this.listaTelefono;
    }

}
