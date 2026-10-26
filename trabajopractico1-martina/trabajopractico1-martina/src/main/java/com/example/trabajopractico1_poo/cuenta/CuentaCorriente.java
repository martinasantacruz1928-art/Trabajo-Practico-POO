package com.example.trabajopractico1_poo.cuenta;

import com.example.trabajopractico1_poo.cheque.Cheque;
import com.example.trabajopractico1_poo.cliente.Cliente;

import lombok.Getter;
import lombok.Setter;


@Getter // Obtiene atributos privados.
@Setter // Permite modificar el monto autorizado.
public class CuentaCorriente extends Cuenta {

    private float montoAutorizado;

    public CuentaCorriente(int nroCuenta, Cliente cliente, float montoAutorizado) {
        super(nroCuenta, cliente);
        this.montoAutorizado = montoAutorizado;
    }

    // Deposita un cheque si su monto es positivo.
    public void depositarCheque(Cheque cheque) {
        if (cheque != null && cheque.getMonto() > 0) {
            depositar(cheque.getMonto());
        }
    }

    // Permite extraer dinero usando también el monto autorizado.
    @Override
    public void extraer(float monto) {
        if (monto > 0 && monto <= getSaldo() + montoAutorizado) {
            setSaldo(getSaldo() - monto);
        }
    }
}

