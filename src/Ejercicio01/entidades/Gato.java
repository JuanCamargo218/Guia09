
package Ejercicio01.entidades;

public class Gato extends Animal{
    public Gato() {
        super();
    }
    
    public Gato(String nombre, String alimento, Integer edad, String raza){
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentarse() {
        System.out.println("Me alimento de "+ super.alimento);
    }
}
