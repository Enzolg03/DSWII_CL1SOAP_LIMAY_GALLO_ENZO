package pe.edu.cibertec.DSWII_CL1SOAP_LIMAY_GALLO_ENZO.endpoint;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pe.edu.cibertec.DSWII_CL1SOAP_LIMAY_GALLO_ENZO.service.Pregunta02Service;

import java.util.List;
import java.util.Map;

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
    @ResponseBody
    @GetMapping("/potencias")
    public List<Map<String, Double>> calcularPotencias(@RequestParam int limite) {
        return pregunta02.calcularPotencias(limite);
    }
    @ResponseBody
    @GetMapping("/almacen")
    public String almacen(@RequestParam double precio, @RequestParam int cantidad){
        return pregunta02.almacen(precio, cantidad);
    }
    @ResponseBody
    @GetMapping("/aniobisiesto")
    public String aniobisiesto(@RequestParam int anio){
        return pregunta02.aniobisiesto(anio);
    }
}

