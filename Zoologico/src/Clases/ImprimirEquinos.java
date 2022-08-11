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
public class ImprimirEquinos {
     public  void ImprimirE(){
         //colocamos los datos de los objetos
    Felinos c1 = new Felinos("Cebra", "Macho", 10, "Negro y blanco");
    Felinos c2 = new Felinos("Onagro", "Hembra", 8, "Negro");
    Felinos c3 = new Felinos("Cabllo", "Hembra", 6, "Amarillo");
    Felinos c4 = new Felinos("Asno", "Macho", 13, "Gris");
    
         //imprimimos los datos de los objetos
         System.out.println(c1.getNombre()+ " es "+c1.getSexo()+ ", tiene "+c1.getEdad()+" años de edad y es color "+c1.getPelaje());
         System.out.println(c2.getNombre()+ " es "+c2.getSexo()+ ", tiene "+c2.getEdad()+" años de edad y es color "+c2.getPelaje());
         System.out.println(c3.getNombre()+ " es "+c3.getSexo()+ ", tiene "+c3.getEdad()+" años de edad y es color "+c3.getPelaje());
         System.out.println(c4.getNombre()+ " es "+c4.getSexo()+ ", tiene "+c4.getEdad()+" años de edad y es color "+c4.getPelaje());
    
  
    
}
    
}
