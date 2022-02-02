
package Ejercicio02y03.entidades;

import java.util.Scanner;

public class Lavadora extends Electrodomestico{
    private Double carga;

    public Lavadora() {
        super();
    }

    public Lavadora(Double carga, Double precio, String color, char consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" + super.toString() + "carga=" + carga + '}';
    }
       
    public Lavadora crearLavadora(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Lavadora l1 = new Lavadora();
        
        Electrodomestico e1= new Electrodomestico();
        e1= super.crearElectrodomestico();
        
        l1.setPrecio(e1.getPrecio());
        l1.setColor(e1.getColor());
        l1.setConsumoEnergetico(e1.getConsumoEnergetico());
        l1.setPeso(e1.getPeso());
        
        System.out.println("Ingrese la carga:");
        l1.setCarga(leer.nextDouble());
        
        return l1;        
    }
    
    @Override
    public Double precioFinal(){
        double precio= super.precioFinal();
        
        if(carga>30){
            precio+=500;
        }
        return precio;
    }
}
