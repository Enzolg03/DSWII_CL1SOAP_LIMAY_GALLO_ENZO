package pe.edu.cibertec.DSWII_CL1SOAP_LIMAY_GALLO_ENZO.service;

import pe.edu.cibertec.DSWII_CL1SOAP_LIMAY_GALLO_ENZO.model.Personaje;
import pe.edu.cibertec.ws.objects.Personajews;

import java.util.List;

public interface IPersonsajeService {
    List<Personajews> listarPersonajes();
    Personajews obtenerPersonajexId(int id);
    Personajews registrarActualizarPersonaje(Personajews personajews);
}
