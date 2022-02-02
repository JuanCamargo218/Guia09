
package Ejercicio02y03.entidades;


import java.util.Scanner;

public class Electrodomestico {
    protected Double precio;
    protected String color;
    protected char consumoEnergetico;
    protected Double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, char consumoEnergetico, Double peso) {
        this.precio = precio;
        this.peso = peso;        
        this.color= comprobarColor(color);
        this.consumoEnergetico= comprobarConsumoEnergetico(consumoEnergetico);    
        
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }    

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
    
    public char comprobarConsumoEnergetico(char letra){
        if('A'== Character.toUpperCase(letra) || 'B'== Character.toUpperCase(letra) || 'C'== Character.toUpperCase(letra) || 'D'== Character.toUpperCase(letra) || 'E'== Character.toUpperCase(letra) || 'F'== Character.toUpperCase(letra)){
            return Character.toUpperCase(letra);
        }else{
            return 'F';
        }
    }
    
    public String comprobarColor(String color){
        if("blanco".equalsIgnoreCase(color) || "gris".equalsIgnoreCase(color) || "negro".equalsIgnoreCase(color) || "azul".equalsIgnoreCase(color) || "rojo".equalsIgnoreCase(color)){
            return color;
        }else{
            return "blanco";
        }
    }
    
    public Electrodomestico crearElectrodomestico(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Electrodomestico e1= new Electrodomestico();
        
        System.out.println("Ingrese el precio:");
        e1.setPrecio(leer.nextDouble());
        
        System.out.println("Ingrese el color:");
        e1.setColor(comprobarColor(leer.next()));
        
        System.out.println("Ingrese el consumo energetico:");
        e1.setConsumoEnergetico(comprobarConsumoEnergetico(leer.next().charAt(0)));
        
        System.out.println("Ingrese el peso:");
        e1.setPeso(leer.nextDouble());
        
        return e1;
    }
    
    public Double precioFinal(){
        double precioFinal=0;
        
        switch(consumoEnergetico){
            case 'A':
                precioFinal= getPrecio()+1000;
                break;
            case 'B':
                precioFinal= getPrecio()+800;
                break;
            case 'C':
                precioFinal= getPrecio()+600;
                break;  
            case 'D':
                precioFinal= getPrecio()+500;
                break;
            case 'E':
                precioFinal= getPrecio()+300;
                break;
            case 'F':
                precioFinal= getPrecio()+100;
                break;    
        }
        
        if(getPeso()>=1 && getPeso()<=19){
            precioFinal+=100;
        }else if(getPeso()>=20 && getPeso()<=49){
            precioFinal+=500;
        }else if(getPeso()>=50 && getPeso()<=79){
            precioFinal+=800;
        }else if(getPeso()>=80){
            precioFinal+=1000;
        }
        
        return precioFinal;
    }
    
}
