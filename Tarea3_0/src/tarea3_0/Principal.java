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
         Cuenta Cuenta1 ,Cuenta2;
     Scanner sc = new Scanner(System.in);
     double totalCuenta;
       System.out.println("Selecciones cuenta #1 o #2");  
        int selec;
        selec= sc.nextInt();
        if(selec==1){
            Cuenta1 = new Cuenta(1, 2500.70,"Carlos","Ponte","95647891","Panama","Correo1@asdas.com");
             System.out.println("Seleciono la cuenta"+Cuenta1.NumCuent()+" " + Cuenta1.people().name +" "+Cuenta1.people().apellido );
            }
        else{
            Cuenta1 = new Cuenta(2, 5000.00,"Juan","rodriguez","62467894","Vergauas","Correo2@asdas.com");
            System.out.println("Seleciono la cuenta"+Cuenta1.NumCuent()+" " + Cuenta1.people().name +" "+Cuenta1.people().apellido );
        }
        
        
          totalCuenta = Cuenta1.saldo();
          System.out.println("Total actual en la cuenta: " + totalCuenta + " $");
           int tip;
           System.out.println("desea ingresar o retirar");  
           System.out.println("1 Deposito /// 2 Retiro"); 
            tip = sc.nextInt();
            if(tip==1){
            double ingreso;
            System.out.println("Ingrese la cantidad a Depositar"); 
            ingreso = sc.nextDouble();
            System.out.println("Se ingresan en la cuenta: " + ingreso + " $");
            Cuenta1.depositar(ingreso);
            totalCuenta = Cuenta1.saldo();
           
System.out.println("Total actual en la cuenta de  " +Cuenta1.people().name +" "+Cuenta1.people().apellido+" "+"Numero de Cuenta: "+ Cuenta1.NumCuent()+" "+"Total en cuenta: "+totalCuenta + " ");             
         }
            else{
            double retiro;
            System.out.println("Ingrese la cantidad a Retirar"); 
            retiro = sc.nextDouble();
            System.out.println("Se Retiraron  de la cuenta: " + retiro + " $");
            Cuenta1.retirar(retiro);
            totalCuenta = Cuenta1.saldo();
            if(totalCuenta<0){
            System.out.println("Error su Saldo es menor que 0");
            }
            
System.out.println("Total actual en la cuenta de  " +Cuenta1.people().name +" "+Cuenta1.people().apellido+" "+"Numero de Cuenta: "+ Cuenta1.NumCuent()+" "+"Total en cuenta: "+totalCuenta + " ");             
            
            }
         
       
      
        
      
    }
    
}
