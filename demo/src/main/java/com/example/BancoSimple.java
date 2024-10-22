package com.example;

import java.util.Scanner;

public class BancoSimple {

    // cuentas disponibles y saldos 
    static String[] nombres = {"Juan Pérez", "María González", "Carlos Ruiz"};
    static double[] saldos = {1500.00, 800.00, 1200.00};
    /////////////////////////////////////////////////////////

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// Interfaz de inicio del programa (bienvenida al usuario)
        System.out.println("Bienvenido a el banco agrario!!!");
        System.out.println("¿En que lo podemos ayudar hoy?");
        //////////////////////////////////////////////////////////

        // se le imprimira el menu y se le solicitara que ingrese una opcion numerica 
        // de lo que se quiere realizar 

        while (true) {
            mostrarMenu();
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            ////////////////////////////////////////

            // dependiento de la opcion seleccionada se ejecutara lo que este accignado a dicha opcionn

            switch (opcion) {
                case 1: 
                    int Depositar = seleccionarCuenta();
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double cantidadDeposito = scanner.nextDouble();
                    depositar(Depositar, cantidadDeposito);
                    break;
                case 2: 
                    int Retiro = seleccionarCuenta();
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double cantidadRetiro = scanner.nextDouble();
                    retirar(Retiro, cantidadRetiro);
                    break;
                case 3: 
                    int Consulta = seleccionarCuenta();
                    consultarSaldo(Consulta);
                    break;
                case 4:
                    System.out.println("Gracias por usar el Banco agrario");
                    System.exit(0);
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
    }
    /////////////////////////////////////////////////////////////////////////////////////////////

    // MENU 

    public static void mostrarMenu() {
        System.out.println("----- Menú -----");
        System.out.println("1. Depositar");
        System.out.println("2. Retirar");
        System.out.println("3. Consultar Saldo");
        System.out.println("4. Salir");
        System.out.println("----------------");
    }
    ////////////////////////////////////////////////////////////////////////////////////

    // se le mostraran los nombres de las cuentas disponibles 

     public static int seleccionarCuenta() {

           System.out.println("Seleccione una cuenta:");

          for (int i = 0; i < nombres.length; i++) {

            System.out.println(i + ". " + nombres[i]);
        }
        ///////////////////////////////////////////////////////

        // se le colicita el numero de la cuenta
          Scanner scanner = new Scanner(System.in);

          int numeroDcuenta;
        while (true) {

               System.out.print("Ingrese el numero de la cuenta: ");
               numeroDcuenta = scanner.nextInt();
             if (numeroDcuenta >= 0 && numeroDcuenta < nombres.length) {
                 return numeroDcuenta;
            } else {
                 System.out.println("Numero no valido. Por favor intente de nuevo.");

            }
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////

    // operacion de depositar a alguna de las cuentas que esten disponibles

    public static void depositar(int deposito, double cantidad) {

        saldos[deposito] += cantidad;

        System.out.println("Depósito exitoso. Nuevo saldo de " + nombres[deposito] + ": " + saldos[deposito]);

    }

    ///////////////////////////////////////////////////////////////////////////////////////

    // Operacion de retirar 

    public static void retirar(int Retiro, double cantidad) {

        if (saldos[Retiro] >= cantidad) {
            saldos[Retiro] -= cantidad;
            System.out.println("Retiro exitoso. Nuevo saldo de " + nombres[Retiro] + ": " + saldos[Retiro]);
        } else {
            System.out.println("Error: Saldo insuficiente.");
        }
    }
    /////////////////////////////////////////////////////////////////////////////

    // Opcion de ver el saldo del usurio 

    public static void consultarSaldo(int saldo) {
        System.out.println("El saldo de " + nombres[saldo] + " es: " + saldos[saldo]);
        //git 

        //tg
    }
}