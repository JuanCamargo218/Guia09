
package Ejercicio02y03.entidades;

import java.util.Scanner;

public class Televisor extends Electrodomestico{
    private Double resolucion;
    private Boolean sintonizadorTDT;

    public Televisor() {
        super();
    }

    public Televisor(Double resolucion, Boolean sintonizadorTDT, Double precio, String color, char consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Double getResolucion() {
        return resolucion;
    }

    public void setResolucion(Double resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(Boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public String toString() {
        return "Televisor{" + super.toString() + "resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT + '}';
    }
    
    public Televisor crearTelevisor(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Televisor t1 = new Televisor();
        
        Electrodomestico e1= new Electrodomestico();
        e1= super.crearElectrodomestico();
        
        t1.setPrecio(e1.getPrecio());
        t1.setColor(e1.getColor());
        t1.setConsumoEnergetico(e1.getConsumoEnergetico());
        t1.setPeso(e1.getPeso());
        
        System.out.println("Ingrese la resolucion:");
        t1.setResolucion(leer.nextDouble());
        
        System.out.println("Ingrese si tiene sintonizador TDT (si/no):");
        if("si".equalsIgnoreCase(leer.next())){
            t1.setSintonizadorTDT(true);
        }else{
            t1.setSintonizadorTDT(false);
        }
        
        return t1;
    }
    
    @Override
    public Double precioFinal(){
        double precio= super.precioFinal();
        
        if(resolucion>40){
            precio*=1.3;
        }
        if(sintonizadorTDT){
            precio+=500;
        }
        
        return precio;
    }
    
    
    
    
    
    
}
