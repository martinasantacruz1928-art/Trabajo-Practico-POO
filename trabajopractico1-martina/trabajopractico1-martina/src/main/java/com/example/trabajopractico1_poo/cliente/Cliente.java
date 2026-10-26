package com.example.trabajopractico1_poo.cliente;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;


// Clase abstracta (papá de ClienteIndividual y ClienteEmpresa).
@Getter
@ToString
@AllArgsConstructor
public abstract class Cliente {

    private final int nroCliente;
}

// No hay @Setter para que el número de cliente no se modifique
