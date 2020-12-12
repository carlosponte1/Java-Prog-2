/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3_0;

/**
 *
 * @author Carlos
 */
public class  Cuenta {
    // Definición de las propiedades de la clase
    private int numeroCuenta;
    private double saldo;
    private Persona propietario;
    
    public Cuenta(int cuenta, double inicial,String nombre,String apellido,String telefono,String direccion,String email ) 
    {
       this.numeroCuenta = cuenta;
        this.saldo = inicial;
        
        this.propietario = new Propietario(nombre,apellido,telefono,direccion,email);
        
    } // Fin del constructor cuenta

    public void depositar(double cantidad) {
        saldo = saldo + cantidad;
    } // Fin del método depositar

    public void retirar(double cantidad) {
        saldo = saldo - cantidad;
    } // Fin del método retirar

    public double saldo() {
        return saldo;
    } // Fin del método saldo   
    
    public Persona people() {
        
        return this.propietario;
                
    }
    
     public int NumCuent(){
        return numeroCuenta;
    }
          // Fin del método saldo 
}
