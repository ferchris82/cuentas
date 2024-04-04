package chrisferdev.cuentas.servicio;

import java.util.List;

import chrisferdev.cuentas.modelo.Cuenta;

public interface ICuentaServicio {

    public List<Cuenta> listarCuentas();

    public Cuenta buscarCuentaPorId(Integer idCuenta);

    public void guardarCuenta(Cuenta cuenta);

    public void eliminarCuenta(Cuenta cuenta);
}
