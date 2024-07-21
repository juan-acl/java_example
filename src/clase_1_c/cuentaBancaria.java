/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_1_c;

/**
 *
 * @author juanchuc
 */
public class cuentaBancaria {

    public int numeroCUenta;
    public String nombreCuenta;
    public String tipoCuenta;
    public double saldo;

    public cuentaBancaria(int numeroCuenta, String nombreCuenta,
            String tipoCuenta, double saldo
    ) {
        // Procedimiento
        this.nombreCuenta = nombreCuenta;
        this.numeroCUenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }

    public String getCuentaBancaria() {
      return this.nombreCuenta + " " + this.tipoCuenta + " " + this.numeroCUenta + " " + this.saldo;
    }
}
