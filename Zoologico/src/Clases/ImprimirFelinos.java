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
public class ImprimirFelinos {
    
     public  void ImprimirF(){
         //colocamos los datos de los objetos
    Felinos c1 = new Felinos("Tigre", "Macho", 10, "Naranja");
    Felinos c2 = new Felinos("Jaguar", "Hembra", 8, "Amarillo");
    Felinos c3 = new Felinos("Leon", "Hembra", 6, "Amarillo");
    Felinos c4 = new Felinos("Gato", "Macho", 7, "Negro");
    
         //imprimimos los datos de los objetos
         System.out.println(c1.getNombre()+ " es "+c1.getSexo()+ ", tiene "+c1.getEdad()+" años de edad y es color "+c1.getPelaje());
         System.out.println(c2.getNombre()+ " es "+c2.getSexo()+ ", tiene "+c2.getEdad()+" años de edad y es color "+c2.getPelaje());
         System.out.println(c3.getNombre()+ " es "+c3.getSexo()+ ", tiene "+c3.getEdad()+" años de edad y es color "+c3.getPelaje());
         System.out.println(c4.getNombre()+ " es "+c4.getSexo()+ ", tiene "+c4.getEdad()+" años de edad y es color "+c4.getPelaje());
    
  
    
}
}
