
package Ejercicio01extra.entidades;

public class Ejercicio01extra {

    public static void main(String[] args) {
        Alquiler a1= new Alquiler();
        a1= a1.crearAlquiler();
        
        System.out.println("El precio del alquiler es: "+ a1.getBarco().precioAlquiler(a1));
        
    }

}
