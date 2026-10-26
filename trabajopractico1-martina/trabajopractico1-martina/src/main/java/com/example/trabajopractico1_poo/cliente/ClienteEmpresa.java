package com.example.trabajopractico1_poo.cliente;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString(callSuper = true)
public class ClienteEmpresa extends Cliente {

    private String nombreFantasia; // Nombre comercial de la empresa.
    private String cuit; // Identificación tributaria de la empresa.

  // Constructor que recibe los datos de la empresa.
public ClienteEmpresa(int nroCliente, String nombreFantasia, String cuit) {

    super(nroCliente); // llama al constructor de la clase padre Cliente para guardar su número. 

    this.nombreFantasia = nombreFantasia; // Guarda el nombre de fantasía de la empresa.
    this.cuit = cuit; // Guarda el CUIT de la empresa.
    }
}

