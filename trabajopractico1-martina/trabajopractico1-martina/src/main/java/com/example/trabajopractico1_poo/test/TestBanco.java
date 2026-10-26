package com.example.trabajopractico1_poo.test;


import com.example.trabajopractico1_poo.cheque.Cheque;
import com.example.trabajopractico1_poo.cliente.ClienteEmpresa;
import com.example.trabajopractico1_poo.cliente.ClienteIndividual;
import com.example.trabajopractico1_poo.cuenta.CajaDeAhorro;
import com.example.trabajopractico1_poo.cuenta.CuentaConvertibilidad;
import com.example.trabajopractico1_poo.cuenta.CuentaCorriente;

// Prueba el funcionamiento de las clases del banco.
public class TestBanco {

        static void main(String[] args) {

        // Creo los clientes.
        ClienteIndividual clienteIndividual =
                new ClienteIndividual(1, "Martina", "Santa Cruz", "12345678");

        ClienteEmpresa clienteEmpresa =
                new ClienteEmpresa(2, "Matufia", "27-12345678-9");

        // Creo un cheque.
        Cheque cheque = new Cheque(5000, "Banco Galicia", "30/09/2026");

        // Creo y pruebo una caja de ahorro.
        CajaDeAhorro caja =
                new CajaDeAhorro(1001, clienteIndividual, 0.05f);

        caja.depositar(15000);
        caja.extraer(2000);
        caja.aplicarTasaInteres();

        // Creo y pruebo una cuenta corriente.
        CuentaCorriente cuentaCorriente =
                new CuentaCorriente(2001, clienteIndividual, 5000);

        cuentaCorriente.depositar(3000);
        cuentaCorriente.depositarCheque(cheque);
        cuentaCorriente.extraer(4000);

        // Creo y pruebo una cuenta de convertibilidad.
        CuentaConvertibilidad cuentaConvertibilidad =
                new CuentaConvertibilidad(3001, clienteEmpresa, 5000);

        cuentaConvertibilidad.depositar(3000);
        cuentaConvertibilidad.depositarCheque(cheque);
        cuentaConvertibilidad.extraer(4000);
        cuentaConvertibilidad.depositarDolares(100);
        cuentaConvertibilidad.extraerDolares(50);
        cuentaConvertibilidad.convertirPesoDolar(1000, 1600);
        cuentaConvertibilidad.convertirDolarPeso(50, 1600);
        
        // Muestro los resultados.
        System.out.println(clienteIndividual);
        System.out.println(clienteEmpresa);
        System.out.println(cheque);
        System.out.println(caja);
        System.out.println(cuentaCorriente);
        System.out.println(cuentaConvertibilidad);
        }
}

