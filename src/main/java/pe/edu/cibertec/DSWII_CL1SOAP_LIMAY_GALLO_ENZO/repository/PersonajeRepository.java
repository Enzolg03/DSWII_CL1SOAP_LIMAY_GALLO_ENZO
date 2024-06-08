package pe.edu.cibertec.DSWII_CL1SOAP_LIMAY_GALLO_ENZO.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DSWII_CL1SOAP_LIMAY_GALLO_ENZO.model.Personaje;

@Repository
public interface PersonajeRepository extends JpaRepository<Personaje, Integer> {
}
