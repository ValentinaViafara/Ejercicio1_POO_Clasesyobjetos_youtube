/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase.objetos.ejercicio;

/**
 *
 * @author danie
 */
public class Coche {
    ///Atributos
 String color;
 String marca;
 int kilometros;
 
 
 //Métodos
 public static void main(String[] args){
     Coche coche1= new Coche();
     
     coche1.color="Blanco";
     coche1.marca="Ford";
     coche1.kilometros=0;
     
     System.out.println("El color del carro es= "+ coche1.color);
     System.out.println("La marca del carro es="+ coche1.marca);
     System.out.println("El kilometraje del carro es="+coche1.kilometros);
     
     Coche coche2= new Coche();
     
     coche2.color="Negro";
     coche2.marca="Hyunday";
     coche2.kilometros=100;
     

 }
}
