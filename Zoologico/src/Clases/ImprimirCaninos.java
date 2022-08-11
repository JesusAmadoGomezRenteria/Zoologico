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
public class ImprimirCaninos {
    
     public  void ImprimirC(){
         //colocamos los datos de los objetos
    Caninos c1 = new Caninos("Coyote", "Macho", 10, "gris");
    Caninos c2 = new Caninos("Dingo", "Macho", 8, "Amarillo");
    Caninos c3 = new Caninos("Zorro", "Hembra", 4, "Naranja");
    Caninos c4 = new Caninos("Lobo", "Macho", 7, "Negro");
    
    //imprimimos los datos de los objetos
         System.out.println(c1.getNombre()+ " es "+c1.getSexo()+ ", tiene "+c1.getEdad()+" años de edad y es color "+c1.getPelaje());
         System.out.println(c2.getNombre()+ " es "+c2.getSexo()+ ", tiene "+c2.getEdad()+" años de edad y es color "+c2.getPelaje());
         System.out.println(c3.getNombre()+ " es "+c3.getSexo()+ ", tiene "+c3.getEdad()+" años de edad y es color "+c3.getPelaje());
         System.out.println(c4.getNombre()+ " es "+c4.getSexo()+ ", tiene "+c4.getEdad()+" años de edad y es color "+c4.getPelaje());
    
  
    
}
}
