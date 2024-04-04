package chrisferdev.cuentas.controlador;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import chrisferdev.cuentas.servicio.CuentaServicio;
import lombok.Data;

@Component
@Data

public class IndexControlador {
    
    @Autowired
    CuentaServicio cuentaServicio;
}
