package pe.edu.cibertec.DSWII_CL1SOAP_LIMAY_GALLO_ENZO.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class Pregunta02Service {
    public String prestamo(double monto){
        String resultado = "";
        if(monto <=4000.0){
            monto = monto + (monto * 0.12);
        }else{
            monto = monto + (monto * 0.1);
        }
        if(monto >= 5000.0){
            resultado = "El pago será en 3 cuotas \n" +
                    "Cada cuota será de: " + monto/3;
        } else 
            if (monto <= 1000.0) {
                resultado = "El pago será en 1 cuota";
        } else if (monto >= 2000.0 && monto <= 3000.0) {
                resultado = "El pago será en 2 cuotas \n" +
                        "Cada cuota será de: " + monto/2;
            }else{
                resultado ="El pago será en 5 cuotas \n" +
                "Cada cuota será de: " + monto/5;
            }
            return resultado;
    }
    public String mostrarVocal(int numero){
        String resultado = "";
        switch (numero){
            case 1: resultado = "El número " + numero + "corresponse a la vocal 'A'"; break;
            case 2: resultado = "El número " + numero + "corresponse a la vocal 'E'"; break;
            case 3: resultado = "El número " + numero + "corresponse a la vocal 'I'"; break;
            case 4: resultado = "El número " + numero + "corresponse a la vocal 'O'"; break;
            case 5: resultado = "El número " + numero + "corresponse a la vocal 'U'"; break;
            default: resultado = "Ingrese un numero entre 1 y 5";
        }
        return resultado;
    }
}
