package com.example.trabajopractico1_poo.cheque;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@AllArgsConstructor
public class Cheque {

    private double monto;
    private String bancoEmisor;
    private String fechaPago;
}


