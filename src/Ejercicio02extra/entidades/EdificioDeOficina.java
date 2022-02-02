
package Ejercicio02extra.entidades;

import java.util.Scanner;

public class EdificioDeOficina extends Edificio{
    private Integer numeroOficinas;
    private Integer cantidadPersonas;
    private Integer cantidadPisos;

    public EdificioDeOficina() {
        super();
    }

    public EdificioDeOficina(Integer numeroOficinas, Integer cantidadPersonas, Integer cantidadPisos, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.numeroOficinas = numeroOficinas;
        this.cantidadPersonas = cantidadPersonas;
        this.cantidadPisos = cantidadPisos;
    }

    public Integer getNumeroOficinas() {
        return numeroOficinas;
    }

    public void setNumeroOficinas(Integer numeroOficinas) {
        this.numeroOficinas = numeroOficinas;
    }

    public Integer getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(Integer cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public Integer getCantidadPisos() {
        return cantidadPisos;
    }

    public void setCantidadPisos(Integer cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }

    @Override
    public String toString() {
        return "EdificioDeOficinas{" + super.toString()+ "numeroOficinas=" + numeroOficinas + ", cantidadPersonas=" + cantidadPersonas + ", cantidadPisos=" + cantidadPisos + '}';
    }     
    
    @Override
    public Double calcularSuperficie() {
        return ancho*largo*(cantidadPisos+1);
    }

    @Override
    public Double calcularVolumen() {
        return ancho*largo*alto;
    }
    
    public void cantPersonas(){
        System.out.println("En un piso entrarian "+ cantidadPersonas);
        System.out.println("\nEn todo el edificio entrarian "+ cantidadPersonas*cantidadPisos);
    }
    
    public EdificioDeOficina crearEdificioDeOficina(){
        EdificioDeOficina e1= new EdificioDeOficina();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el ancho:");
        e1.setAncho(leer.nextDouble());
        
        System.out.println("Ingrese el alto:");
        e1.setAlto(leer.nextDouble());
        
        System.out.println("Ingrese el largo:");
        e1.setLargo(leer.nextDouble());
        
        System.out.println("Ingrese el numero de oficinas:");
        e1.setNumeroOficinas(leer.nextInt());
        
        System.out.println("Ingrese la cantidad de personas por oficina:");
        e1.setCantidadPersonas(leer.nextInt());
        
        System.out.println("Ingrese la cantidad de pisos:");
        e1.setCantidadPisos(leer.nextInt());
        
        return e1;
    }
    
    
}
