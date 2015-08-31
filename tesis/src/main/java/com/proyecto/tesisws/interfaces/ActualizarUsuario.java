
package com.proyecto.tesisws.interfaces;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para actualizarUsuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="actualizarUsuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usuario" type="{http://interfaces.tesisws.proyecto.com/}usuarios" minOccurs="0"/>
 *         &lt;element name="listaTelefonos" type="{http://interfaces.tesisws.proyecto.com/}telefonos" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actualizarUsuario", propOrder = {
    "usuario",
    "listaTelefonos"
})
public class ActualizarUsuario {

    protected Usuarios usuario;
    protected List<Telefonos> listaTelefonos;

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link Usuarios }
     *     
     */
    public Usuarios getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuarios }
     *     
     */
    public void setUsuario(Usuarios value) {
        this.usuario = value;
    }

    /**
     * Gets the value of the listaTelefonos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaTelefonos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaTelefonos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Telefonos }
     * 
     * 
     */
    public List<Telefonos> getListaTelefonos() {
        if (listaTelefonos == null) {
            listaTelefonos = new ArrayList<Telefonos>();
        }
        return this.listaTelefonos;
    }

}
