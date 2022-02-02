
package Ejercicio04.entidades;

public class Circulo implements calculosFormas{
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }  
        
    @Override
    public Double calcularArea() {
        return PI * (radio*radio);
    }

    @Override
    public Double calcularPerimetro() {
        return PI*(radio*2);
    }
    
}
