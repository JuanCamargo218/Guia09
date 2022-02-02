/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Ejercicio02extra.entidades;

import java.util.ArrayList;
import java.util.List;


public class Ejercicio02extra {

    public static void main(String[] args) {
        List<Edificio> lista= new ArrayList();
        
        Edificio e1= new Polideportivo("Belgrano", "abierto", 30d, 150d, 10d);
        Edificio e2= new Polideportivo("San Martin", "cerrado", 50d, 100d, 8d);
        Edificio e3= new EdificioDeOficina(8, 10, 8, 50d, 70d, 60d);
        Edificio e4= new EdificioDeOficina(15, 12, 15, 80d, 75d, 90d);
        
        lista.add(e1);
        lista.add(e2);
        lista.add(e3);
        lista.add(e4);
        
        
        
        for(Edificio edificio: lista){
            System.out.println("La superficie de este edificio es: "+ edificio.calcularSuperficie());
            System.out.println("El volumen de este edificio es: "+ edificio.calcularVolumen());
            
            if (edificio.getClass() == Polideportivo.class) {
                
            }
        }
        
        
    }

}
