
package com.proyecto.tesisws.interfaces;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.proyecto.tesisws.interfaces package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ObtenerUsuarioPorId_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "obtenerUsuarioPorId");
    private final static QName _ObtenerDestinatariosPorIdVehiculo_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "obtenerDestinatariosPorIdVehiculo");
    private final static QName _AceptarOrechazarInvitacion_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "aceptarOrechazarInvitacion");
    private final static QName _ObtenerMarcaPorId_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "obtenerMarcaPorId");
    private final static QName _ActualizarStatusVehiculo_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "actualizarStatusVehiculo");
    private final static QName _ObtenerLlaverPorIdVehiculoResponse_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "obtenerLlaverPorIdVehiculoResponse");
    private final static QName _ObtenerUsuarioPorIdResponse_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "obtenerUsuarioPorIdResponse");
    private final static QName _ActualizarStatusVehiculoResponse_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "actualizarStatusVehiculoResponse");
    private final static QName _ObtenerModeloPorId_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "obtenerModeloPorId");
    private final static QName _ObtenerDestinatariosPorIdVehiculoResponse_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "obtenerDestinatariosPorIdVehiculoResponse");
    private final static QName _ObtenerModelosPorIdMarcaResponse_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "obtenerModelosPorIdMarcaResponse");
    private final static QName _ObtenerUsuario_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "obtenerUsuario");
    private final static QName _ObtenerTiposDeStatus_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "obtenerTiposDeStatus");
    private final static QName _RegistrarUsuarioResponse_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "registrarUsuarioResponse");
    private final static QName _ObtenerTelefonosPorIdUsuarioResponse_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "obtenerTelefonosPorIdUsuarioResponse");
    private final static QName _AceptarOrechazarInvitacionResponse_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "aceptarOrechazarInvitacionResponse");
    private final static QName _EliminarDestinatarioResponse_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "eliminarDestinatarioResponse");
    private final static QName _EliminarDestinatariosPorIdVehiculoResponse_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "eliminarDestinatariosPorIdVehiculoResponse");
    private final static QName _InsertarVehiculoResponse_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "insertarVehiculoResponse");
    private final static QName _ActualizarUsuario_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "actualizarUsuario");
    private final static QName _EnviarMensajeSuspensionServicioResponse_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "enviarMensajeSuspensionServicioResponse");
    private final static QName _EnviarMensajeRevisionSensoresResponse_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "enviarMensajeRevisionSensoresResponse");
    private final static QName _EliminarVehiculoPorIdResponse_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "eliminarVehiculoPorIdResponse");
    private final static QName _ObtenerUsuarioResponse_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "obtenerUsuarioResponse");
    private final static QName _EnviarMensajeRevisionSensores_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "enviarMensajeRevisionSensores");
    private final static QName _ObtenerHistoricoPorFecha_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "obtenerHistoricoPorFecha");
    private final static QName _ObtenerMarcaPorIdResponse_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "obtenerMarcaPorIdResponse");
    private final static QName _ObtenerTiposDeMensaje_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "obtenerTiposDeMensaje");
    private final static QName _ObtenerTiposDeLLaves_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "obtenerTiposDeLLaves");
    private final static QName _ObtenerTelefonosPorIdUsuario_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "obtenerTelefonosPorIdUsuario");
    private final static QName _ActualizarStatusInvitacionPorIdDestinatario_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "actualizarStatusInvitacionPorIdDestinatario");
    private final static QName _EnviarInvitacionResponse_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "enviarInvitacionResponse");
    private final static QName _ObtenerTiposDeVehiculo_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "obtenerTiposDeVehiculo");
    private final static QName _ObtenerLlaverPorIdVehiculo_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "obtenerLlaverPorIdVehiculo");
    private final static QName _ObtenerTiposDeMensajeResponse_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "obtenerTiposDeMensajeResponse");
    private final static QName _ActualizarDestinatarioResponse_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "actualizarDestinatarioResponse");
    private final static QName _ActualizarUsuarioResponse_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "actualizarUsuarioResponse");
    private final static QName _EnviarInvitacion_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "enviarInvitacion");
    private final static QName _ActualizarDestinatario_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "actualizarDestinatario");
    private final static QName _ObtenerTiposDeLLavesResponse_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "obtenerTiposDeLLavesResponse");
    private final static QName _EliminarVehiculoPorId_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "eliminarVehiculoPorId");
    private final static QName _ObtenerTelefonoPorId_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "obtenerTelefonoPorId");
    private final static QName _ObtenerModelosPorIdMarca_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "obtenerModelosPorIdMarca");
    private final static QName _ObtenerVehiculosPorIdUsuario_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "obtenerVehiculosPorIdUsuario");
    private final static QName _ObtenerMarcasResponse_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "obtenerMarcasResponse");
    private final static QName _ObtenerTiposDeVehiculoResponse_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "obtenerTiposDeVehiculoResponse");
    private final static QName _InsertarDestinatarioResponse_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "insertarDestinatarioResponse");
    private final static QName _ObtenerTelefonoPorIdResponse_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "obtenerTelefonoPorIdResponse");
    private final static QName _ActualizarVehiculo_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "actualizarVehiculo");
    private final static QName _ObtenerModeloPorIdResponse_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "obtenerModeloPorIdResponse");
    private final static QName _ActualizarStatusInvitacionPorIdDestinatarioResponse_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "actualizarStatusInvitacionPorIdDestinatarioResponse");
    private final static QName _ObtenerHistoricoPorFechaResponse_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "obtenerHistoricoPorFechaResponse");
    private final static QName _InsertarVehiculo_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "insertarVehiculo");
    private final static QName _BuscarTelefonoPorTelefono_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "buscarTelefonoPorTelefono");
    private final static QName _EliminarDestinatariosPorIdVehiculo_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "eliminarDestinatariosPorIdVehiculo");
    private final static QName _RegistrarUsuario_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "registrarUsuario");
    private final static QName _ObtenerTiposDeStatusResponse_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "obtenerTiposDeStatusResponse");
    private final static QName _ActualizarVehiculoResponse_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "actualizarVehiculoResponse");
    private final static QName _ObtenerVehiculosPorIdUsuarioResponse_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "obtenerVehiculosPorIdUsuarioResponse");
    private final static QName _InsertarDestinatario_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "insertarDestinatario");
    private final static QName _ObtenerMarcas_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "obtenerMarcas");
    private final static QName _BuscarTelefonoPorTelefonoResponse_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "buscarTelefonoPorTelefonoResponse");
    private final static QName _EliminarDestinatario_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "eliminarDestinatario");
    private final static QName _EnviarMensajeSuspensionServicio_QNAME = new QName("http://interfaces.tesisws.proyecto.com/", "enviarMensajeSuspensionServicio");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.proyecto.tesisws.interfaces
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EnviarMensajeRevisionSensores }
     * 
     */
    public EnviarMensajeRevisionSensores createEnviarMensajeRevisionSensores() {
        return new EnviarMensajeRevisionSensores();
    }

    /**
     * Create an instance of {@link ObtenerHistoricoPorFecha }
     * 
     */
    public ObtenerHistoricoPorFecha createObtenerHistoricoPorFecha() {
        return new ObtenerHistoricoPorFecha();
    }

    /**
     * Create an instance of {@link ObtenerMarcaPorIdResponse }
     * 
     */
    public ObtenerMarcaPorIdResponse createObtenerMarcaPorIdResponse() {
        return new ObtenerMarcaPorIdResponse();
    }

    /**
     * Create an instance of {@link ObtenerUsuarioResponse }
     * 
     */
    public ObtenerUsuarioResponse createObtenerUsuarioResponse() {
        return new ObtenerUsuarioResponse();
    }

    /**
     * Create an instance of {@link ObtenerTiposDeMensaje }
     * 
     */
    public ObtenerTiposDeMensaje createObtenerTiposDeMensaje() {
        return new ObtenerTiposDeMensaje();
    }

    /**
     * Create an instance of {@link ObtenerTiposDeLLaves }
     * 
     */
    public ObtenerTiposDeLLaves createObtenerTiposDeLLaves() {
        return new ObtenerTiposDeLLaves();
    }

    /**
     * Create an instance of {@link ObtenerTelefonosPorIdUsuario }
     * 
     */
    public ObtenerTelefonosPorIdUsuario createObtenerTelefonosPorIdUsuario() {
        return new ObtenerTelefonosPorIdUsuario();
    }

    /**
     * Create an instance of {@link EnviarMensajeRevisionSensoresResponse }
     * 
     */
    public EnviarMensajeRevisionSensoresResponse createEnviarMensajeRevisionSensoresResponse() {
        return new EnviarMensajeRevisionSensoresResponse();
    }

    /**
     * Create an instance of {@link EliminarVehiculoPorIdResponse }
     * 
     */
    public EliminarVehiculoPorIdResponse createEliminarVehiculoPorIdResponse() {
        return new EliminarVehiculoPorIdResponse();
    }

    /**
     * Create an instance of {@link ActualizarUsuario }
     * 
     */
    public ActualizarUsuario createActualizarUsuario() {
        return new ActualizarUsuario();
    }

    /**
     * Create an instance of {@link EnviarMensajeSuspensionServicioResponse }
     * 
     */
    public EnviarMensajeSuspensionServicioResponse createEnviarMensajeSuspensionServicioResponse() {
        return new EnviarMensajeSuspensionServicioResponse();
    }

    /**
     * Create an instance of {@link AceptarOrechazarInvitacionResponse }
     * 
     */
    public AceptarOrechazarInvitacionResponse createAceptarOrechazarInvitacionResponse() {
        return new AceptarOrechazarInvitacionResponse();
    }

    /**
     * Create an instance of {@link ObtenerTelefonosPorIdUsuarioResponse }
     * 
     */
    public ObtenerTelefonosPorIdUsuarioResponse createObtenerTelefonosPorIdUsuarioResponse() {
        return new ObtenerTelefonosPorIdUsuarioResponse();
    }

    /**
     * Create an instance of {@link InsertarVehiculoResponse }
     * 
     */
    public InsertarVehiculoResponse createInsertarVehiculoResponse() {
        return new InsertarVehiculoResponse();
    }

    /**
     * Create an instance of {@link EliminarDestinatariosPorIdVehiculoResponse }
     * 
     */
    public EliminarDestinatariosPorIdVehiculoResponse createEliminarDestinatariosPorIdVehiculoResponse() {
        return new EliminarDestinatariosPorIdVehiculoResponse();
    }

    /**
     * Create an instance of {@link EliminarDestinatarioResponse }
     * 
     */
    public EliminarDestinatarioResponse createEliminarDestinatarioResponse() {
        return new EliminarDestinatarioResponse();
    }

    /**
     * Create an instance of {@link RegistrarUsuarioResponse }
     * 
     */
    public RegistrarUsuarioResponse createRegistrarUsuarioResponse() {
        return new RegistrarUsuarioResponse();
    }

    /**
     * Create an instance of {@link ObtenerTiposDeStatus }
     * 
     */
    public ObtenerTiposDeStatus createObtenerTiposDeStatus() {
        return new ObtenerTiposDeStatus();
    }

    /**
     * Create an instance of {@link ObtenerUsuario }
     * 
     */
    public ObtenerUsuario createObtenerUsuario() {
        return new ObtenerUsuario();
    }

    /**
     * Create an instance of {@link ObtenerModelosPorIdMarcaResponse }
     * 
     */
    public ObtenerModelosPorIdMarcaResponse createObtenerModelosPorIdMarcaResponse() {
        return new ObtenerModelosPorIdMarcaResponse();
    }

    /**
     * Create an instance of {@link ActualizarStatusVehiculoResponse }
     * 
     */
    public ActualizarStatusVehiculoResponse createActualizarStatusVehiculoResponse() {
        return new ActualizarStatusVehiculoResponse();
    }

    /**
     * Create an instance of {@link ObtenerDestinatariosPorIdVehiculoResponse }
     * 
     */
    public ObtenerDestinatariosPorIdVehiculoResponse createObtenerDestinatariosPorIdVehiculoResponse() {
        return new ObtenerDestinatariosPorIdVehiculoResponse();
    }

    /**
     * Create an instance of {@link ObtenerModeloPorId }
     * 
     */
    public ObtenerModeloPorId createObtenerModeloPorId() {
        return new ObtenerModeloPorId();
    }

    /**
     * Create an instance of {@link ActualizarStatusVehiculo }
     * 
     */
    public ActualizarStatusVehiculo createActualizarStatusVehiculo() {
        return new ActualizarStatusVehiculo();
    }

    /**
     * Create an instance of {@link AceptarOrechazarInvitacion }
     * 
     */
    public AceptarOrechazarInvitacion createAceptarOrechazarInvitacion() {
        return new AceptarOrechazarInvitacion();
    }

    /**
     * Create an instance of {@link ObtenerMarcaPorId }
     * 
     */
    public ObtenerMarcaPorId createObtenerMarcaPorId() {
        return new ObtenerMarcaPorId();
    }

    /**
     * Create an instance of {@link ObtenerUsuarioPorId }
     * 
     */
    public ObtenerUsuarioPorId createObtenerUsuarioPorId() {
        return new ObtenerUsuarioPorId();
    }

    /**
     * Create an instance of {@link ObtenerDestinatariosPorIdVehiculo }
     * 
     */
    public ObtenerDestinatariosPorIdVehiculo createObtenerDestinatariosPorIdVehiculo() {
        return new ObtenerDestinatariosPorIdVehiculo();
    }

    /**
     * Create an instance of {@link ObtenerUsuarioPorIdResponse }
     * 
     */
    public ObtenerUsuarioPorIdResponse createObtenerUsuarioPorIdResponse() {
        return new ObtenerUsuarioPorIdResponse();
    }

    /**
     * Create an instance of {@link ObtenerLlaverPorIdVehiculoResponse }
     * 
     */
    public ObtenerLlaverPorIdVehiculoResponse createObtenerLlaverPorIdVehiculoResponse() {
        return new ObtenerLlaverPorIdVehiculoResponse();
    }

    /**
     * Create an instance of {@link BuscarTelefonoPorTelefonoResponse }
     * 
     */
    public BuscarTelefonoPorTelefonoResponse createBuscarTelefonoPorTelefonoResponse() {
        return new BuscarTelefonoPorTelefonoResponse();
    }

    /**
     * Create an instance of {@link EnviarMensajeSuspensionServicio }
     * 
     */
    public EnviarMensajeSuspensionServicio createEnviarMensajeSuspensionServicio() {
        return new EnviarMensajeSuspensionServicio();
    }

    /**
     * Create an instance of {@link EliminarDestinatario }
     * 
     */
    public EliminarDestinatario createEliminarDestinatario() {
        return new EliminarDestinatario();
    }

    /**
     * Create an instance of {@link RegistrarUsuario }
     * 
     */
    public RegistrarUsuario createRegistrarUsuario() {
        return new RegistrarUsuario();
    }

    /**
     * Create an instance of {@link ObtenerTiposDeStatusResponse }
     * 
     */
    public ObtenerTiposDeStatusResponse createObtenerTiposDeStatusResponse() {
        return new ObtenerTiposDeStatusResponse();
    }

    /**
     * Create an instance of {@link ActualizarVehiculoResponse }
     * 
     */
    public ActualizarVehiculoResponse createActualizarVehiculoResponse() {
        return new ActualizarVehiculoResponse();
    }

    /**
     * Create an instance of {@link ObtenerMarcas }
     * 
     */
    public ObtenerMarcas createObtenerMarcas() {
        return new ObtenerMarcas();
    }

    /**
     * Create an instance of {@link ObtenerVehiculosPorIdUsuarioResponse }
     * 
     */
    public ObtenerVehiculosPorIdUsuarioResponse createObtenerVehiculosPorIdUsuarioResponse() {
        return new ObtenerVehiculosPorIdUsuarioResponse();
    }

    /**
     * Create an instance of {@link InsertarDestinatario }
     * 
     */
    public InsertarDestinatario createInsertarDestinatario() {
        return new InsertarDestinatario();
    }

    /**
     * Create an instance of {@link BuscarTelefonoPorTelefono }
     * 
     */
    public BuscarTelefonoPorTelefono createBuscarTelefonoPorTelefono() {
        return new BuscarTelefonoPorTelefono();
    }

    /**
     * Create an instance of {@link InsertarVehiculo }
     * 
     */
    public InsertarVehiculo createInsertarVehiculo() {
        return new InsertarVehiculo();
    }

    /**
     * Create an instance of {@link ActualizarStatusInvitacionPorIdDestinatarioResponse }
     * 
     */
    public ActualizarStatusInvitacionPorIdDestinatarioResponse createActualizarStatusInvitacionPorIdDestinatarioResponse() {
        return new ActualizarStatusInvitacionPorIdDestinatarioResponse();
    }

    /**
     * Create an instance of {@link ObtenerHistoricoPorFechaResponse }
     * 
     */
    public ObtenerHistoricoPorFechaResponse createObtenerHistoricoPorFechaResponse() {
        return new ObtenerHistoricoPorFechaResponse();
    }

    /**
     * Create an instance of {@link EliminarDestinatariosPorIdVehiculo }
     * 
     */
    public EliminarDestinatariosPorIdVehiculo createEliminarDestinatariosPorIdVehiculo() {
        return new EliminarDestinatariosPorIdVehiculo();
    }

    /**
     * Create an instance of {@link ObtenerTiposDeVehiculoResponse }
     * 
     */
    public ObtenerTiposDeVehiculoResponse createObtenerTiposDeVehiculoResponse() {
        return new ObtenerTiposDeVehiculoResponse();
    }

    /**
     * Create an instance of {@link ObtenerMarcasResponse }
     * 
     */
    public ObtenerMarcasResponse createObtenerMarcasResponse() {
        return new ObtenerMarcasResponse();
    }

    /**
     * Create an instance of {@link ActualizarVehiculo }
     * 
     */
    public ActualizarVehiculo createActualizarVehiculo() {
        return new ActualizarVehiculo();
    }

    /**
     * Create an instance of {@link ObtenerModeloPorIdResponse }
     * 
     */
    public ObtenerModeloPorIdResponse createObtenerModeloPorIdResponse() {
        return new ObtenerModeloPorIdResponse();
    }

    /**
     * Create an instance of {@link ObtenerTelefonoPorIdResponse }
     * 
     */
    public ObtenerTelefonoPorIdResponse createObtenerTelefonoPorIdResponse() {
        return new ObtenerTelefonoPorIdResponse();
    }

    /**
     * Create an instance of {@link InsertarDestinatarioResponse }
     * 
     */
    public InsertarDestinatarioResponse createInsertarDestinatarioResponse() {
        return new InsertarDestinatarioResponse();
    }

    /**
     * Create an instance of {@link EliminarVehiculoPorId }
     * 
     */
    public EliminarVehiculoPorId createEliminarVehiculoPorId() {
        return new EliminarVehiculoPorId();
    }

    /**
     * Create an instance of {@link ObtenerTiposDeLLavesResponse }
     * 
     */
    public ObtenerTiposDeLLavesResponse createObtenerTiposDeLLavesResponse() {
        return new ObtenerTiposDeLLavesResponse();
    }

    /**
     * Create an instance of {@link ObtenerVehiculosPorIdUsuario }
     * 
     */
    public ObtenerVehiculosPorIdUsuario createObtenerVehiculosPorIdUsuario() {
        return new ObtenerVehiculosPorIdUsuario();
    }

    /**
     * Create an instance of {@link ObtenerModelosPorIdMarca }
     * 
     */
    public ObtenerModelosPorIdMarca createObtenerModelosPorIdMarca() {
        return new ObtenerModelosPorIdMarca();
    }

    /**
     * Create an instance of {@link ObtenerTelefonoPorId }
     * 
     */
    public ObtenerTelefonoPorId createObtenerTelefonoPorId() {
        return new ObtenerTelefonoPorId();
    }

    /**
     * Create an instance of {@link ActualizarDestinatario }
     * 
     */
    public ActualizarDestinatario createActualizarDestinatario() {
        return new ActualizarDestinatario();
    }

    /**
     * Create an instance of {@link EnviarInvitacion }
     * 
     */
    public EnviarInvitacion createEnviarInvitacion() {
        return new EnviarInvitacion();
    }

    /**
     * Create an instance of {@link ActualizarUsuarioResponse }
     * 
     */
    public ActualizarUsuarioResponse createActualizarUsuarioResponse() {
        return new ActualizarUsuarioResponse();
    }

    /**
     * Create an instance of {@link ActualizarDestinatarioResponse }
     * 
     */
    public ActualizarDestinatarioResponse createActualizarDestinatarioResponse() {
        return new ActualizarDestinatarioResponse();
    }

    /**
     * Create an instance of {@link ObtenerTiposDeMensajeResponse }
     * 
     */
    public ObtenerTiposDeMensajeResponse createObtenerTiposDeMensajeResponse() {
        return new ObtenerTiposDeMensajeResponse();
    }

    /**
     * Create an instance of {@link ObtenerLlaverPorIdVehiculo }
     * 
     */
    public ObtenerLlaverPorIdVehiculo createObtenerLlaverPorIdVehiculo() {
        return new ObtenerLlaverPorIdVehiculo();
    }

    /**
     * Create an instance of {@link ObtenerTiposDeVehiculo }
     * 
     */
    public ObtenerTiposDeVehiculo createObtenerTiposDeVehiculo() {
        return new ObtenerTiposDeVehiculo();
    }

    /**
     * Create an instance of {@link EnviarInvitacionResponse }
     * 
     */
    public EnviarInvitacionResponse createEnviarInvitacionResponse() {
        return new EnviarInvitacionResponse();
    }

    /**
     * Create an instance of {@link ActualizarStatusInvitacionPorIdDestinatario }
     * 
     */
    public ActualizarStatusInvitacionPorIdDestinatario createActualizarStatusInvitacionPorIdDestinatario() {
        return new ActualizarStatusInvitacionPorIdDestinatario();
    }

    /**
     * Create an instance of {@link Vehiculos }
     * 
     */
    public Vehiculos createVehiculos() {
        return new Vehiculos();
    }

    /**
     * Create an instance of {@link Tipostatus }
     * 
     */
    public Tipostatus createTipostatus() {
        return new Tipostatus();
    }

    /**
     * Create an instance of {@link Historicomensajes }
     * 
     */
    public Historicomensajes createHistoricomensajes() {
        return new Historicomensajes();
    }

    /**
     * Create an instance of {@link Destinatarios }
     * 
     */
    public Destinatarios createDestinatarios() {
        return new Destinatarios();
    }

    /**
     * Create an instance of {@link VehiculoDTO }
     * 
     */
    public VehiculoDTO createVehiculoDTO() {
        return new VehiculoDTO();
    }

    /**
     * Create an instance of {@link Tipomensaje }
     * 
     */
    public Tipomensaje createTipomensaje() {
        return new Tipomensaje();
    }

    /**
     * Create an instance of {@link Tipollave }
     * 
     */
    public Tipollave createTipollave() {
        return new Tipollave();
    }

    /**
     * Create an instance of {@link Tipovehiculo }
     * 
     */
    public Tipovehiculo createTipovehiculo() {
        return new Tipovehiculo();
    }

    /**
     * Create an instance of {@link Usuarios }
     * 
     */
    public Usuarios createUsuarios() {
        return new Usuarios();
    }

    /**
     * Create an instance of {@link Telefonos }
     * 
     */
    public Telefonos createTelefonos() {
        return new Telefonos();
    }

    /**
     * Create an instance of {@link LlavesKey }
     * 
     */
    public LlavesKey createLlavesKey() {
        return new LlavesKey();
    }

    /**
     * Create an instance of {@link Modelos }
     * 
     */
    public Modelos createModelos() {
        return new Modelos();
    }

    /**
     * Create an instance of {@link Marcas }
     * 
     */
    public Marcas createMarcas() {
        return new Marcas();
    }

    /**
     * Create an instance of {@link Llaves }
     * 
     */
    public Llaves createLlaves() {
        return new Llaves();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerUsuarioPorId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "obtenerUsuarioPorId")
    public JAXBElement<ObtenerUsuarioPorId> createObtenerUsuarioPorId(ObtenerUsuarioPorId value) {
        return new JAXBElement<ObtenerUsuarioPorId>(_ObtenerUsuarioPorId_QNAME, ObtenerUsuarioPorId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerDestinatariosPorIdVehiculo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "obtenerDestinatariosPorIdVehiculo")
    public JAXBElement<ObtenerDestinatariosPorIdVehiculo> createObtenerDestinatariosPorIdVehiculo(ObtenerDestinatariosPorIdVehiculo value) {
        return new JAXBElement<ObtenerDestinatariosPorIdVehiculo>(_ObtenerDestinatariosPorIdVehiculo_QNAME, ObtenerDestinatariosPorIdVehiculo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AceptarOrechazarInvitacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "aceptarOrechazarInvitacion")
    public JAXBElement<AceptarOrechazarInvitacion> createAceptarOrechazarInvitacion(AceptarOrechazarInvitacion value) {
        return new JAXBElement<AceptarOrechazarInvitacion>(_AceptarOrechazarInvitacion_QNAME, AceptarOrechazarInvitacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerMarcaPorId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "obtenerMarcaPorId")
    public JAXBElement<ObtenerMarcaPorId> createObtenerMarcaPorId(ObtenerMarcaPorId value) {
        return new JAXBElement<ObtenerMarcaPorId>(_ObtenerMarcaPorId_QNAME, ObtenerMarcaPorId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarStatusVehiculo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "actualizarStatusVehiculo")
    public JAXBElement<ActualizarStatusVehiculo> createActualizarStatusVehiculo(ActualizarStatusVehiculo value) {
        return new JAXBElement<ActualizarStatusVehiculo>(_ActualizarStatusVehiculo_QNAME, ActualizarStatusVehiculo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerLlaverPorIdVehiculoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "obtenerLlaverPorIdVehiculoResponse")
    public JAXBElement<ObtenerLlaverPorIdVehiculoResponse> createObtenerLlaverPorIdVehiculoResponse(ObtenerLlaverPorIdVehiculoResponse value) {
        return new JAXBElement<ObtenerLlaverPorIdVehiculoResponse>(_ObtenerLlaverPorIdVehiculoResponse_QNAME, ObtenerLlaverPorIdVehiculoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerUsuarioPorIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "obtenerUsuarioPorIdResponse")
    public JAXBElement<ObtenerUsuarioPorIdResponse> createObtenerUsuarioPorIdResponse(ObtenerUsuarioPorIdResponse value) {
        return new JAXBElement<ObtenerUsuarioPorIdResponse>(_ObtenerUsuarioPorIdResponse_QNAME, ObtenerUsuarioPorIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarStatusVehiculoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "actualizarStatusVehiculoResponse")
    public JAXBElement<ActualizarStatusVehiculoResponse> createActualizarStatusVehiculoResponse(ActualizarStatusVehiculoResponse value) {
        return new JAXBElement<ActualizarStatusVehiculoResponse>(_ActualizarStatusVehiculoResponse_QNAME, ActualizarStatusVehiculoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerModeloPorId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "obtenerModeloPorId")
    public JAXBElement<ObtenerModeloPorId> createObtenerModeloPorId(ObtenerModeloPorId value) {
        return new JAXBElement<ObtenerModeloPorId>(_ObtenerModeloPorId_QNAME, ObtenerModeloPorId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerDestinatariosPorIdVehiculoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "obtenerDestinatariosPorIdVehiculoResponse")
    public JAXBElement<ObtenerDestinatariosPorIdVehiculoResponse> createObtenerDestinatariosPorIdVehiculoResponse(ObtenerDestinatariosPorIdVehiculoResponse value) {
        return new JAXBElement<ObtenerDestinatariosPorIdVehiculoResponse>(_ObtenerDestinatariosPorIdVehiculoResponse_QNAME, ObtenerDestinatariosPorIdVehiculoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerModelosPorIdMarcaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "obtenerModelosPorIdMarcaResponse")
    public JAXBElement<ObtenerModelosPorIdMarcaResponse> createObtenerModelosPorIdMarcaResponse(ObtenerModelosPorIdMarcaResponse value) {
        return new JAXBElement<ObtenerModelosPorIdMarcaResponse>(_ObtenerModelosPorIdMarcaResponse_QNAME, ObtenerModelosPorIdMarcaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "obtenerUsuario")
    public JAXBElement<ObtenerUsuario> createObtenerUsuario(ObtenerUsuario value) {
        return new JAXBElement<ObtenerUsuario>(_ObtenerUsuario_QNAME, ObtenerUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTiposDeStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "obtenerTiposDeStatus")
    public JAXBElement<ObtenerTiposDeStatus> createObtenerTiposDeStatus(ObtenerTiposDeStatus value) {
        return new JAXBElement<ObtenerTiposDeStatus>(_ObtenerTiposDeStatus_QNAME, ObtenerTiposDeStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "registrarUsuarioResponse")
    public JAXBElement<RegistrarUsuarioResponse> createRegistrarUsuarioResponse(RegistrarUsuarioResponse value) {
        return new JAXBElement<RegistrarUsuarioResponse>(_RegistrarUsuarioResponse_QNAME, RegistrarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTelefonosPorIdUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "obtenerTelefonosPorIdUsuarioResponse")
    public JAXBElement<ObtenerTelefonosPorIdUsuarioResponse> createObtenerTelefonosPorIdUsuarioResponse(ObtenerTelefonosPorIdUsuarioResponse value) {
        return new JAXBElement<ObtenerTelefonosPorIdUsuarioResponse>(_ObtenerTelefonosPorIdUsuarioResponse_QNAME, ObtenerTelefonosPorIdUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AceptarOrechazarInvitacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "aceptarOrechazarInvitacionResponse")
    public JAXBElement<AceptarOrechazarInvitacionResponse> createAceptarOrechazarInvitacionResponse(AceptarOrechazarInvitacionResponse value) {
        return new JAXBElement<AceptarOrechazarInvitacionResponse>(_AceptarOrechazarInvitacionResponse_QNAME, AceptarOrechazarInvitacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarDestinatarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "eliminarDestinatarioResponse")
    public JAXBElement<EliminarDestinatarioResponse> createEliminarDestinatarioResponse(EliminarDestinatarioResponse value) {
        return new JAXBElement<EliminarDestinatarioResponse>(_EliminarDestinatarioResponse_QNAME, EliminarDestinatarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarDestinatariosPorIdVehiculoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "eliminarDestinatariosPorIdVehiculoResponse")
    public JAXBElement<EliminarDestinatariosPorIdVehiculoResponse> createEliminarDestinatariosPorIdVehiculoResponse(EliminarDestinatariosPorIdVehiculoResponse value) {
        return new JAXBElement<EliminarDestinatariosPorIdVehiculoResponse>(_EliminarDestinatariosPorIdVehiculoResponse_QNAME, EliminarDestinatariosPorIdVehiculoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarVehiculoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "insertarVehiculoResponse")
    public JAXBElement<InsertarVehiculoResponse> createInsertarVehiculoResponse(InsertarVehiculoResponse value) {
        return new JAXBElement<InsertarVehiculoResponse>(_InsertarVehiculoResponse_QNAME, InsertarVehiculoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "actualizarUsuario")
    public JAXBElement<ActualizarUsuario> createActualizarUsuario(ActualizarUsuario value) {
        return new JAXBElement<ActualizarUsuario>(_ActualizarUsuario_QNAME, ActualizarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarMensajeSuspensionServicioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "enviarMensajeSuspensionServicioResponse")
    public JAXBElement<EnviarMensajeSuspensionServicioResponse> createEnviarMensajeSuspensionServicioResponse(EnviarMensajeSuspensionServicioResponse value) {
        return new JAXBElement<EnviarMensajeSuspensionServicioResponse>(_EnviarMensajeSuspensionServicioResponse_QNAME, EnviarMensajeSuspensionServicioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarMensajeRevisionSensoresResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "enviarMensajeRevisionSensoresResponse")
    public JAXBElement<EnviarMensajeRevisionSensoresResponse> createEnviarMensajeRevisionSensoresResponse(EnviarMensajeRevisionSensoresResponse value) {
        return new JAXBElement<EnviarMensajeRevisionSensoresResponse>(_EnviarMensajeRevisionSensoresResponse_QNAME, EnviarMensajeRevisionSensoresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarVehiculoPorIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "eliminarVehiculoPorIdResponse")
    public JAXBElement<EliminarVehiculoPorIdResponse> createEliminarVehiculoPorIdResponse(EliminarVehiculoPorIdResponse value) {
        return new JAXBElement<EliminarVehiculoPorIdResponse>(_EliminarVehiculoPorIdResponse_QNAME, EliminarVehiculoPorIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "obtenerUsuarioResponse")
    public JAXBElement<ObtenerUsuarioResponse> createObtenerUsuarioResponse(ObtenerUsuarioResponse value) {
        return new JAXBElement<ObtenerUsuarioResponse>(_ObtenerUsuarioResponse_QNAME, ObtenerUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarMensajeRevisionSensores }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "enviarMensajeRevisionSensores")
    public JAXBElement<EnviarMensajeRevisionSensores> createEnviarMensajeRevisionSensores(EnviarMensajeRevisionSensores value) {
        return new JAXBElement<EnviarMensajeRevisionSensores>(_EnviarMensajeRevisionSensores_QNAME, EnviarMensajeRevisionSensores.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerHistoricoPorFecha }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "obtenerHistoricoPorFecha")
    public JAXBElement<ObtenerHistoricoPorFecha> createObtenerHistoricoPorFecha(ObtenerHistoricoPorFecha value) {
        return new JAXBElement<ObtenerHistoricoPorFecha>(_ObtenerHistoricoPorFecha_QNAME, ObtenerHistoricoPorFecha.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerMarcaPorIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "obtenerMarcaPorIdResponse")
    public JAXBElement<ObtenerMarcaPorIdResponse> createObtenerMarcaPorIdResponse(ObtenerMarcaPorIdResponse value) {
        return new JAXBElement<ObtenerMarcaPorIdResponse>(_ObtenerMarcaPorIdResponse_QNAME, ObtenerMarcaPorIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTiposDeMensaje }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "obtenerTiposDeMensaje")
    public JAXBElement<ObtenerTiposDeMensaje> createObtenerTiposDeMensaje(ObtenerTiposDeMensaje value) {
        return new JAXBElement<ObtenerTiposDeMensaje>(_ObtenerTiposDeMensaje_QNAME, ObtenerTiposDeMensaje.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTiposDeLLaves }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "obtenerTiposDeLLaves")
    public JAXBElement<ObtenerTiposDeLLaves> createObtenerTiposDeLLaves(ObtenerTiposDeLLaves value) {
        return new JAXBElement<ObtenerTiposDeLLaves>(_ObtenerTiposDeLLaves_QNAME, ObtenerTiposDeLLaves.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTelefonosPorIdUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "obtenerTelefonosPorIdUsuario")
    public JAXBElement<ObtenerTelefonosPorIdUsuario> createObtenerTelefonosPorIdUsuario(ObtenerTelefonosPorIdUsuario value) {
        return new JAXBElement<ObtenerTelefonosPorIdUsuario>(_ObtenerTelefonosPorIdUsuario_QNAME, ObtenerTelefonosPorIdUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarStatusInvitacionPorIdDestinatario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "actualizarStatusInvitacionPorIdDestinatario")
    public JAXBElement<ActualizarStatusInvitacionPorIdDestinatario> createActualizarStatusInvitacionPorIdDestinatario(ActualizarStatusInvitacionPorIdDestinatario value) {
        return new JAXBElement<ActualizarStatusInvitacionPorIdDestinatario>(_ActualizarStatusInvitacionPorIdDestinatario_QNAME, ActualizarStatusInvitacionPorIdDestinatario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarInvitacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "enviarInvitacionResponse")
    public JAXBElement<EnviarInvitacionResponse> createEnviarInvitacionResponse(EnviarInvitacionResponse value) {
        return new JAXBElement<EnviarInvitacionResponse>(_EnviarInvitacionResponse_QNAME, EnviarInvitacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTiposDeVehiculo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "obtenerTiposDeVehiculo")
    public JAXBElement<ObtenerTiposDeVehiculo> createObtenerTiposDeVehiculo(ObtenerTiposDeVehiculo value) {
        return new JAXBElement<ObtenerTiposDeVehiculo>(_ObtenerTiposDeVehiculo_QNAME, ObtenerTiposDeVehiculo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerLlaverPorIdVehiculo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "obtenerLlaverPorIdVehiculo")
    public JAXBElement<ObtenerLlaverPorIdVehiculo> createObtenerLlaverPorIdVehiculo(ObtenerLlaverPorIdVehiculo value) {
        return new JAXBElement<ObtenerLlaverPorIdVehiculo>(_ObtenerLlaverPorIdVehiculo_QNAME, ObtenerLlaverPorIdVehiculo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTiposDeMensajeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "obtenerTiposDeMensajeResponse")
    public JAXBElement<ObtenerTiposDeMensajeResponse> createObtenerTiposDeMensajeResponse(ObtenerTiposDeMensajeResponse value) {
        return new JAXBElement<ObtenerTiposDeMensajeResponse>(_ObtenerTiposDeMensajeResponse_QNAME, ObtenerTiposDeMensajeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarDestinatarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "actualizarDestinatarioResponse")
    public JAXBElement<ActualizarDestinatarioResponse> createActualizarDestinatarioResponse(ActualizarDestinatarioResponse value) {
        return new JAXBElement<ActualizarDestinatarioResponse>(_ActualizarDestinatarioResponse_QNAME, ActualizarDestinatarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "actualizarUsuarioResponse")
    public JAXBElement<ActualizarUsuarioResponse> createActualizarUsuarioResponse(ActualizarUsuarioResponse value) {
        return new JAXBElement<ActualizarUsuarioResponse>(_ActualizarUsuarioResponse_QNAME, ActualizarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarInvitacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "enviarInvitacion")
    public JAXBElement<EnviarInvitacion> createEnviarInvitacion(EnviarInvitacion value) {
        return new JAXBElement<EnviarInvitacion>(_EnviarInvitacion_QNAME, EnviarInvitacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarDestinatario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "actualizarDestinatario")
    public JAXBElement<ActualizarDestinatario> createActualizarDestinatario(ActualizarDestinatario value) {
        return new JAXBElement<ActualizarDestinatario>(_ActualizarDestinatario_QNAME, ActualizarDestinatario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTiposDeLLavesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "obtenerTiposDeLLavesResponse")
    public JAXBElement<ObtenerTiposDeLLavesResponse> createObtenerTiposDeLLavesResponse(ObtenerTiposDeLLavesResponse value) {
        return new JAXBElement<ObtenerTiposDeLLavesResponse>(_ObtenerTiposDeLLavesResponse_QNAME, ObtenerTiposDeLLavesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarVehiculoPorId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "eliminarVehiculoPorId")
    public JAXBElement<EliminarVehiculoPorId> createEliminarVehiculoPorId(EliminarVehiculoPorId value) {
        return new JAXBElement<EliminarVehiculoPorId>(_EliminarVehiculoPorId_QNAME, EliminarVehiculoPorId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTelefonoPorId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "obtenerTelefonoPorId")
    public JAXBElement<ObtenerTelefonoPorId> createObtenerTelefonoPorId(ObtenerTelefonoPorId value) {
        return new JAXBElement<ObtenerTelefonoPorId>(_ObtenerTelefonoPorId_QNAME, ObtenerTelefonoPorId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerModelosPorIdMarca }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "obtenerModelosPorIdMarca")
    public JAXBElement<ObtenerModelosPorIdMarca> createObtenerModelosPorIdMarca(ObtenerModelosPorIdMarca value) {
        return new JAXBElement<ObtenerModelosPorIdMarca>(_ObtenerModelosPorIdMarca_QNAME, ObtenerModelosPorIdMarca.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerVehiculosPorIdUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "obtenerVehiculosPorIdUsuario")
    public JAXBElement<ObtenerVehiculosPorIdUsuario> createObtenerVehiculosPorIdUsuario(ObtenerVehiculosPorIdUsuario value) {
        return new JAXBElement<ObtenerVehiculosPorIdUsuario>(_ObtenerVehiculosPorIdUsuario_QNAME, ObtenerVehiculosPorIdUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerMarcasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "obtenerMarcasResponse")
    public JAXBElement<ObtenerMarcasResponse> createObtenerMarcasResponse(ObtenerMarcasResponse value) {
        return new JAXBElement<ObtenerMarcasResponse>(_ObtenerMarcasResponse_QNAME, ObtenerMarcasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTiposDeVehiculoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "obtenerTiposDeVehiculoResponse")
    public JAXBElement<ObtenerTiposDeVehiculoResponse> createObtenerTiposDeVehiculoResponse(ObtenerTiposDeVehiculoResponse value) {
        return new JAXBElement<ObtenerTiposDeVehiculoResponse>(_ObtenerTiposDeVehiculoResponse_QNAME, ObtenerTiposDeVehiculoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarDestinatarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "insertarDestinatarioResponse")
    public JAXBElement<InsertarDestinatarioResponse> createInsertarDestinatarioResponse(InsertarDestinatarioResponse value) {
        return new JAXBElement<InsertarDestinatarioResponse>(_InsertarDestinatarioResponse_QNAME, InsertarDestinatarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTelefonoPorIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "obtenerTelefonoPorIdResponse")
    public JAXBElement<ObtenerTelefonoPorIdResponse> createObtenerTelefonoPorIdResponse(ObtenerTelefonoPorIdResponse value) {
        return new JAXBElement<ObtenerTelefonoPorIdResponse>(_ObtenerTelefonoPorIdResponse_QNAME, ObtenerTelefonoPorIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarVehiculo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "actualizarVehiculo")
    public JAXBElement<ActualizarVehiculo> createActualizarVehiculo(ActualizarVehiculo value) {
        return new JAXBElement<ActualizarVehiculo>(_ActualizarVehiculo_QNAME, ActualizarVehiculo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerModeloPorIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "obtenerModeloPorIdResponse")
    public JAXBElement<ObtenerModeloPorIdResponse> createObtenerModeloPorIdResponse(ObtenerModeloPorIdResponse value) {
        return new JAXBElement<ObtenerModeloPorIdResponse>(_ObtenerModeloPorIdResponse_QNAME, ObtenerModeloPorIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarStatusInvitacionPorIdDestinatarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "actualizarStatusInvitacionPorIdDestinatarioResponse")
    public JAXBElement<ActualizarStatusInvitacionPorIdDestinatarioResponse> createActualizarStatusInvitacionPorIdDestinatarioResponse(ActualizarStatusInvitacionPorIdDestinatarioResponse value) {
        return new JAXBElement<ActualizarStatusInvitacionPorIdDestinatarioResponse>(_ActualizarStatusInvitacionPorIdDestinatarioResponse_QNAME, ActualizarStatusInvitacionPorIdDestinatarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerHistoricoPorFechaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "obtenerHistoricoPorFechaResponse")
    public JAXBElement<ObtenerHistoricoPorFechaResponse> createObtenerHistoricoPorFechaResponse(ObtenerHistoricoPorFechaResponse value) {
        return new JAXBElement<ObtenerHistoricoPorFechaResponse>(_ObtenerHistoricoPorFechaResponse_QNAME, ObtenerHistoricoPorFechaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarVehiculo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "insertarVehiculo")
    public JAXBElement<InsertarVehiculo> createInsertarVehiculo(InsertarVehiculo value) {
        return new JAXBElement<InsertarVehiculo>(_InsertarVehiculo_QNAME, InsertarVehiculo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarTelefonoPorTelefono }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "buscarTelefonoPorTelefono")
    public JAXBElement<BuscarTelefonoPorTelefono> createBuscarTelefonoPorTelefono(BuscarTelefonoPorTelefono value) {
        return new JAXBElement<BuscarTelefonoPorTelefono>(_BuscarTelefonoPorTelefono_QNAME, BuscarTelefonoPorTelefono.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarDestinatariosPorIdVehiculo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "eliminarDestinatariosPorIdVehiculo")
    public JAXBElement<EliminarDestinatariosPorIdVehiculo> createEliminarDestinatariosPorIdVehiculo(EliminarDestinatariosPorIdVehiculo value) {
        return new JAXBElement<EliminarDestinatariosPorIdVehiculo>(_EliminarDestinatariosPorIdVehiculo_QNAME, EliminarDestinatariosPorIdVehiculo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "registrarUsuario")
    public JAXBElement<RegistrarUsuario> createRegistrarUsuario(RegistrarUsuario value) {
        return new JAXBElement<RegistrarUsuario>(_RegistrarUsuario_QNAME, RegistrarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTiposDeStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "obtenerTiposDeStatusResponse")
    public JAXBElement<ObtenerTiposDeStatusResponse> createObtenerTiposDeStatusResponse(ObtenerTiposDeStatusResponse value) {
        return new JAXBElement<ObtenerTiposDeStatusResponse>(_ObtenerTiposDeStatusResponse_QNAME, ObtenerTiposDeStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarVehiculoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "actualizarVehiculoResponse")
    public JAXBElement<ActualizarVehiculoResponse> createActualizarVehiculoResponse(ActualizarVehiculoResponse value) {
        return new JAXBElement<ActualizarVehiculoResponse>(_ActualizarVehiculoResponse_QNAME, ActualizarVehiculoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerVehiculosPorIdUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "obtenerVehiculosPorIdUsuarioResponse")
    public JAXBElement<ObtenerVehiculosPorIdUsuarioResponse> createObtenerVehiculosPorIdUsuarioResponse(ObtenerVehiculosPorIdUsuarioResponse value) {
        return new JAXBElement<ObtenerVehiculosPorIdUsuarioResponse>(_ObtenerVehiculosPorIdUsuarioResponse_QNAME, ObtenerVehiculosPorIdUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarDestinatario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "insertarDestinatario")
    public JAXBElement<InsertarDestinatario> createInsertarDestinatario(InsertarDestinatario value) {
        return new JAXBElement<InsertarDestinatario>(_InsertarDestinatario_QNAME, InsertarDestinatario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerMarcas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "obtenerMarcas")
    public JAXBElement<ObtenerMarcas> createObtenerMarcas(ObtenerMarcas value) {
        return new JAXBElement<ObtenerMarcas>(_ObtenerMarcas_QNAME, ObtenerMarcas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarTelefonoPorTelefonoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "buscarTelefonoPorTelefonoResponse")
    public JAXBElement<BuscarTelefonoPorTelefonoResponse> createBuscarTelefonoPorTelefonoResponse(BuscarTelefonoPorTelefonoResponse value) {
        return new JAXBElement<BuscarTelefonoPorTelefonoResponse>(_BuscarTelefonoPorTelefonoResponse_QNAME, BuscarTelefonoPorTelefonoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarDestinatario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "eliminarDestinatario")
    public JAXBElement<EliminarDestinatario> createEliminarDestinatario(EliminarDestinatario value) {
        return new JAXBElement<EliminarDestinatario>(_EliminarDestinatario_QNAME, EliminarDestinatario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarMensajeSuspensionServicio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.tesisws.proyecto.com/", name = "enviarMensajeSuspensionServicio")
    public JAXBElement<EnviarMensajeSuspensionServicio> createEnviarMensajeSuspensionServicio(EnviarMensajeSuspensionServicio value) {
        return new JAXBElement<EnviarMensajeSuspensionServicio>(_EnviarMensajeSuspensionServicio_QNAME, EnviarMensajeSuspensionServicio.class, null, value);
    }

}
