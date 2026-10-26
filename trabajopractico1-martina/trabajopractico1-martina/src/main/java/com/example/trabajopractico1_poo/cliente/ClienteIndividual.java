package com.example.trabajopractico1_poo.cliente;

import lombok.Getter;
import lombok.ToString;


@Getter
@ToString (callSuper = true)
// No hay @Setter porque no quiero que los datos personales se modifiquen

public class ClienteIndividual extends Cliente {

    private String nombre;
    private String apellido;
    private String dni; // DNI del cliente.

    // Constructor que recibe los datos del cliente.
    public ClienteIndividual(int nroCliente, String nombre, String apellido, String dni) {
        super(nroCliente);
        this.nombre = nombre; // Guarda el nombre.
        this.apellido = apellido; // Guarda el apellido
        this.dni = dni; // Guarda el DNI
    }
}

