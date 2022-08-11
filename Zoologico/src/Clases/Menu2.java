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
public class Menu2 {
   
     public  void menu2(){
        Teclado opci = new Teclado();
       //creamos toro menu
        System.out.println("      Bienvenidos al Sistema del Zoologico      ");
        System.out.println("******Elige una de las siguientes opciones******");
        System.out.println("******  1   =   Ver Animales Caninos      ******");
        System.out.println("******  2   =   Ver Animales Felinos      ******");
        System.out.println("******  3   =   Ver Animales Equinos      ******");
        System.out.println("******  4   =   Ver Animales Bovinos      ******");
        System.out.println("******  5  =   Salir del programa         ******");
        System.out.println("************************************************");
        
       
        int opcion= opci.getInt("******  Elegir:        ******");
        opciones(opcion);
            
    
         
    }
     
     public static void opciones(int opcion)
    {
        switch (opcion) {
            case 1:
                System.out.println("Se muestran los datos de los Caninos");
                //mandamos a llamar el metodo para visualizar los datos
                ImprimirCaninos opci = new ImprimirCaninos();
                opci.ImprimirC();
                 
              
                break;
                
                
            case 2:
                
                System.out.println("Se muestran los datos de los Felinos");
                //mandamos a llamar el metodo para visualizar los datos
                ImprimirFelinos opci2 = new ImprimirFelinos();
                opci2.ImprimirF();
                ;
                break;
            
            case 3:
                
                System.out.println("Se muestran los datos de los Equinos");
                //mandamos a llamar el metodo para visualizar los datos
                ImprimirEquinos opci3 = new ImprimirEquinos();
                opci3.ImprimirE();
                break;
                
             case 4:
                
                System.out.println("Se muestran los datos de los Bovinos");
                //mandamos a llamar el metodo para visualizar los datos
                ImprimirBovinos opci4 = new ImprimirBovinos();
                opci4.ImprimirB();
                break;
                
             case 5:
                
                System.out.println("Hasta luego");
                System.exit(0);
                break;    
                
        }
        
  
    }
    
}
