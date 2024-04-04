package chrisferdev.cuentas.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import chrisferdev.cuentas.modelo.Cuenta;
import chrisferdev.cuentas.repositorio.CuentaRepositorio;

@Service
public class CuentaServicio implements ICuentaServicio{

    @Autowired
    private CuentaRepositorio cuentaRepositorio;

    @Override
    public List<Cuenta> listarCuentas() {
        return cuentaRepositorio.findAll();
    }

    @Override
    public Cuenta buscarCuentaPorId(Integer idCuenta) {
        Cuenta cuenta = cuentaRepositorio.findById(idCuenta).orElse(null);
        return cuenta;
    }

    @Override
    public void guardarCuenta(Cuenta cuenta) {
        cuentaRepositorio.save(cuenta);
    }

    @Override
    public void eliminarCuenta(Cuenta cuenta) {
        cuentaRepositorio.delete(cuenta);
    }
    
}
