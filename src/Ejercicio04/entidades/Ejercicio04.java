
package Ejercicio04.entidades;


public class Ejercicio04 {

    public static void main(String[] args) {
        Circulo c1= new Circulo(50d);
        Rectangulo r1= new Rectangulo(20d, 30d);
        
        System.out.println("El area del circulo es: "+ c1.calcularArea());
        System.out.println("El perimetro del circulo es: "+ c1.calcularPerimetro());
        
        System.out.println("\nEl area del rectangulo es: "+ r1.calcularArea());
        System.out.println("El perimetro del rectangulo es: "+ r1.calcularPerimetro());
    }

}
