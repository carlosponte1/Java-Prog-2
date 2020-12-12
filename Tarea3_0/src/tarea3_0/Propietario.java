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
public class Propietario implements Persona{
    
    
     public   String name="";
     public    String apellido="";
     public   String telefono="";
     public   String direccion="";
     public   String email="";
       
       public Propietario(String name,String apellido, String telefono, String direccion,String email){
          // System.out.println(name);
           this.name=name;
           this.apellido=apellido;
           this.telefono=telefono;
           this.direccion=direccion;
           this.email=email;
       
       }
}
