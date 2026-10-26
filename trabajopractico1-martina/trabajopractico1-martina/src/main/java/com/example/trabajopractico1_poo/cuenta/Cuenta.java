package com.example.trabajopractico1_poo.cuenta;

import com.example.trabajopractico1_poo.cliente.Cliente;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


// Clase abstracta que sirve como base para las demás cuentas.
@Getter // Genera los getters para consultar los atributos.
@ToString // Genera toString() para mostrar los datos del objeto.
@Setter // Permite modificar el saldo desde otras clases.

public abstract class Cuenta {

    private final int nroCuenta;

    private float saldo = 0;

    private final Cliente cliente;

    // Constructor sin saldo, porque siempre comienza en cero.
    public Cuenta(int nroCuenta, Cliente cliente) {
        this.nroCuenta = nroCuenta;
        this.cliente = cliente;
    }

    // Todas las cuentas depositan dinero de la misma manera.
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    // Cada tipo de cuenta define sus propias condiciones para extraer.
    public abstract void extraer(float monto);
}

