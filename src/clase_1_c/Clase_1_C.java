/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_1_c;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author juanchuc
 */
public class Clase_1_C {

    public static void Menu() {
        try{
            Scanner userOptionInput = new Scanner(System.in);
            int numeroCuenta, saldo;
            String tipoCuenta;
            int opcionUsuario;
            System.out.println("Ingresa la opcion del valor del parentesis");
            System.out.println("(1) Ingresar parametros.");
            System.out.println("(2) Salir.");
            opcionUsuario = userOptionInput.nextInt();
            if (opcionUsuario != 1) {
                System.out.println("Que tenga buen dia :)");
                System.exit(0);
            }
            System.out.println("Ingrese el nombre de la cuenta");
            String nombreCuenta = userOptionInput.next();
            System.out.println("Ingrese el numero de cuenta");
            numeroCuenta = userOptionInput.nextInt();
            System.out.println("Ingrese el tipo de cuenta");
            tipoCuenta = userOptionInput.next();
            System.out.println("Ingrese el saldo");
            saldo = userOptionInput.nextInt();
            cuentaBancaria cuenta = new cuentaBancaria(numeroCuenta, nombreCuenta, tipoCuenta, saldo);
            System.out.println("Datos bancarios ingresados: ");
            System.out.println(cuenta.getCuentaBancaria());
            System.out.println(" (1) Regresar al menu");
            System.out.println(" (2) Cancelar");
            opcionUsuario = userOptionInput.nextInt();
            if (opcionUsuario != 1) {
                System.exit(0);
            }
            Menu();
            Runtime.getRuntime().exec("cls");
        }catch(Exception e){
            System.out.println("Ingresa un numero valido");
            Menu();
        }
    }

    public static void main(String[] args) {
        Menu();
    }
}
