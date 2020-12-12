/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tarea3_0;
import java.util.*;
import java.util.Properties; 
import java.lang.*;



/**
 *
 * @author Carlos
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
             transaccion();
        
    }
    public static void transaccion()
    {
     Scanner sc = new Scanner(System.in);
     double totalCuenta;

        // Creamos la cuenta
        Cuenta Cuenta1 ,Cuenta2;
        Cuenta1 = new Cuenta(1, 2500.70,"carlos","Ponte","123","casa2","asda@asdas.com");
        //Cuenta2 = new Cuenta(2, 3000.70,"carlos1","Ponte1","123","casa2","asda@asdas.com");

        // Consultamos el saldo
        totalCuenta = Cuenta1.saldo();
        System.out.println("Total actual en la cuenta: " + totalCuenta + " $");

        // Hacemos un ingreso en la cuenta
        double ingreso = 350.25;
        System.out.println("Se ingresan en la cuenta: " + ingreso + " $");
        Cuenta1.depositar(ingreso);
        
        System.out.println("-------------------------------------------------");

        // Consultamos el saldo de nuevo
        totalCuenta = Cuenta1.saldo();
        System.out.println(Cuenta1.saldo());
        System.out.println("Total actual en la cuenta de :  :: " +" "+ Cuenta1.NumCuent()+" "+totalCuenta + " "); 
    }
    
}
