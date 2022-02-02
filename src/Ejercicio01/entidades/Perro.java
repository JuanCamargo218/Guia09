
package Ejercicio01.entidades;

public class Perro extends Animal{
    
    public Perro() {
        super();
    }
    
    public Perro(String nombre, String alimento, Integer edad, String raza){
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentarse() {
        System.out.println("Me alimento de "+ super.alimento);
    }
    
}
