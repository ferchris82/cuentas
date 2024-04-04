package chrisferdev.cuentas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import chrisferdev.cuentas.modelo.Cuenta;

public interface CuentaRepositorio extends JpaRepository<Cuenta, Integer>{

}
