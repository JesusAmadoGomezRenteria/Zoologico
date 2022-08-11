/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author amado
 */
public class Animal {
   
     public static void main(String args[]){
        Teclado opci = new Teclado();//se crea el metodo de entrada para el teclado
       
        
        //Se crean las opciones para el usuario
        System.out.println("      Bienvenidos al Sistema del Zoologico      ");
        System.out.println("******Elige una de las siguientes opciones******");
        System.out.println("******  1   =   Ver Animales Mamiferos    ******");
        System.out.println("******  2   =   Salir del programa        ******");
        System.out.println("************************************************");
        int opcion= opci.getInt("******  Elegir:        ******");
        opciones(opcion);
  
         
    }
     
     //se crea un submenu con solo dos opciones
     public static void opciones(int opcion)
    {
        switch (opcion) {
            case 1:
                 Menu2 opci = new Menu2(); // manda a traer el metodo 
                 opci.menu2();
                break;
                
                
            case 2:
                System.out.println("Hasta luego");
                System.exit(0); // especificamos que queremos salir de la aplicacion
                ;
                break;
         
        }
        
  
    }
    
}
