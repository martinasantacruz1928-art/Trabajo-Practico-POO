package com.example.trabajopractico1_poo.cuenta;

import com.example.trabajopractico1_poo.cliente.ClienteEmpresa;
// Se utiliza para permitir utilizar una clase que está en otro paquete.
// En este caso, de ClienteEmpresa para crear la cuenta de convertibilidad.

import lombok.Getter;
import lombok.ToString;


@Getter // Consulta el valor privado. Obtiene la tasa de conversión o el saldo en dólares.
@ToString(callSuper = true) // Convierte los datos en texto.
// No hay setter para que el saldo en dólares solo se modifique mediante 
// depositarDolares, extraerDolares, convertirPesoDolar y convertirDolarPeso.
public class CuentaConvertibilidad extends CuentaCorriente {

    private float saldoDolares; // Saldo disponible en dólares.

    // Constructor para inicializar la cuenta de convertibilidad heredando los datos de la clase padre (Cuenta).
    public CuentaConvertibilidad(
            int nroCuenta,
            ClienteEmpresa cliente,
            float montoAutorizado) {

        super(nroCuenta, cliente, montoAutorizado); // Llama al constructor de la clase padre (Cuenta) 
        // para asignar los datos principales. 
    }

    // Deposita dinero en dólares.
    public void depositarDolares(float cantidad) {
        if (cantidad > 0) { // Verifica que la cantidad sea mayor a cero.
            saldoDolares += cantidad; // Suma el monto al saldo en dólares.
        }
    }

    // Retira dólares si hay saldo suficiente.
    public void extraerDolares(float cantidad) {
        if (cantidad > 0 && cantidad <= saldoDolares) { // Verifica que sea mayor a cero y haya fondos.
            saldoDolares -= cantidad; // Descuenta el monto del saldo en dólares.
        }
    }

    // Convierte pesos a dólares.
    public void convertirPesoDolar(float cantidad, float tasa) {
        // Verifica que la cantidad y la tasa sean válidas y haya suficiente saldo en pesos.
        if (cantidad > 0 && tasa > 0 && cantidad <= getSaldo()) {
            float dolares = cantidad / tasa; // Calcula los dólares equivalentes.
            setSaldo(getSaldo() - cantidad); // Descuenta los pesos del saldo principal.
            saldoDolares += dolares; // Suma los dólares obtenidos al saldo en dólares.
        } else {
            // Si no se cumple va tirar un mensaje de error:
            System.out.println("Error: Monto o tasa inválidos, o saldo en pesos insuficiente.");
        }
    }

    // Convierte dólares a pesos.
    public void convertirDolarPeso(float cantidad, float tasa) {
        // Verifica que la cantidad y la tasa sean válidas y haya suficiente saldo en dólares.
        if (cantidad > 0 && tasa > 0 && cantidad <= saldoDolares) {
            float pesos = cantidad * tasa; // Calcula los pesos recibidos.
            saldoDolares -= cantidad; // Descuenta los dólares de la cuenta.
            setSaldo(getSaldo() + pesos); // Suma los pesos al saldo principal.
        } else {
            // Si no se cumple va tirar un mensaje de error:
            System.out.println("Error: Monto o tasa inválidos, o saldo en dólares insuficiente.");
        }
    }
}