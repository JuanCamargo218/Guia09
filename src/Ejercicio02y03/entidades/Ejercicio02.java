/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Ejercicio02y03.entidades;

import java.util.ArrayList;
import java.util.List;


public class Ejercicio02 {

    public static void main(String[] args) {
        /*Electrodomestico e1= new Electrodomestico(12.5d,"blanco", 'A', 50d);
        System.out.println(e1.consumoEnergetico);
        System.out.println(e1.color);
        
        Electrodomestico e2= new Electrodomestico(12.5d, "verde", 'b', 25d);
        System.out.println(e2.consumoEnergetico);
        System.out.println(e2.color);
        
        Electrodomestico e3= new Electrodomestico(12.5d, "negro", 'j', 80d);
        System.out.println(e3.consumoEnergetico);
        System.out.println(e3.color);*/
        
        
        /*Electrodomestico e4= new Electrodomestico();
        
        e4= e4.crearElectrodomestico();
        System.out.println(e4.getPrecio());
        System.out.println(e4.getConsumoEnergetico());
        System.out.println(e4.getColor());
        System.out.println(e4.getPeso());
        
        System.out.println(e1.precioFinal());
        System.out.println(e2.precioFinal());
        System.out.println(e3.precioFinal());*/
        
        /*Punto 2
        Lavadora l1= new Lavadora( 50d, 500d, "blanco", 'b', 60d);
        Televisor t1= new Televisor(50d, true, 5000d, "azul", 'f', 80d);
        
        System.out.println("Lavadora:");
        System.out.println("Precio: "+ l1.getPrecio());
        System.out.println("Precio Final: "+ l1.precioFinal());
        System.out.println("------------------------\n");
        
        System.out.println("Televisor");
        System.out.println("Precio: "+ t1.getPrecio());
        System.out.println("Precio Final: "+ t1.precioFinal());*/
        
        /*Punto 3
        List<Electrodomestico> listaProducto= new ArrayList();
        
        Lavadora l1= new Lavadora( 50d, 500d, "blanco", 'b', 60d);
        Lavadora l2= new Lavadora( 40d, 400d, "azul", 'd', 80d);
        Televisor t1= new Televisor(800d, false, 3000d, "negro", 'b', 50d);
        Televisor t2= new Televisor(50d, true, 5000d, "azul", 'f', 80d);
        
        listaProducto.add(l1);
        listaProducto.add(l2);
        listaProducto.add(t1);
        listaProducto.add(t2);
        
        double totalProductos=0;
        int i=1;
        for(Electrodomestico producto : listaProducto){
            totalProductos+=producto.precioFinal();
            System.out.println("Producto "+i);
            System.out.println("El precio final es: "+ producto.precioFinal());
            i++;
        }
        
        System.out.println("\nEl precio total de los productos es: "+ totalProductos);*/
        
    }

}
