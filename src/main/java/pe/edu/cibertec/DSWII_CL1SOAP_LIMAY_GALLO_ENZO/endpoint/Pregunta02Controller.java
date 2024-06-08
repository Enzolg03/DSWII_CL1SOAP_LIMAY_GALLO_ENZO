package pe.edu.cibertec.DSWII_CL1SOAP_LIMAY_GALLO_ENZO.endpoint;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pe.edu.cibertec.DSWII_CL1SOAP_LIMAY_GALLO_ENZO.service.Pregunta02Service;

@Controller
@AllArgsConstructor
@RequestMapping("/p2")
public class Pregunta02Controller {
    private Pregunta02Service pregunta02;
    @ResponseBody
    @GetMapping("/prestamo")
    public String prestamo(@RequestParam double prestamo){
        return pregunta02.prestamo(prestamo);
    }
    @ResponseBody
    @GetMapping("/vocales")
    public String prestamo(@RequestParam int numero){
        return pregunta02.mostrarVocal(numero);
    }
}

