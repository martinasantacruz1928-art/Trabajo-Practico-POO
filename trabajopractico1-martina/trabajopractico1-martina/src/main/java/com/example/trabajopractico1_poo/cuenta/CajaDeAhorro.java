package com.example.trabajopractico1_poo.cuenta;

import com.example.trabajopractico1_poo.cliente.ClienteIndividual;

import lombok.Getter;
import lombok.Setter;


@Getter // Consulta los atributos privados de la clase. 
@Setter // Permite modificar la tasa de interés.

public class CajaDeAhorro extends Cuenta {

        private float tasaInteres;

    // Constructor sin saldo, porque comienza en cero.
    public CajaDeAhorro(int nroCuenta, ClienteIndividual clienteIndividual, float tasaInteres) {
        super(nroCuenta, clienteIndividual);
        this.tasaInteres = tasaInteres;
    }

// Aca se me corrigio algo automaticamente directo del Test. No se que paso.

    // Permite retirar dinero sin superar el saldo disponible.
    @Override
    public void extraer(float monto) {
        if (monto > 0 && monto <= getSaldo()) {
            setSaldo(getSaldo() - monto);
        }
    }

    // Calcula el interés y lo suma al saldo actual.
    public void aplicarTasaInteres() {
        float saldoActual = getSaldo();
        setSaldo(saldoActual + (saldoActual * tasaInteres));
    }
}

