
package Ejercicio02extra.entidades;

public class Polideportivo extends Edificio{
    private String nombre;
    private String tipoInstalacion;

    public Polideportivo() {
        super();
    }

    public Polideportivo(String nombre, String tipoInstalacion, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setTipoInstalacion(String tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }

    @Override
    public String toString() {
        return "Polideportivo{" + super.toString()+ "nombre=" + nombre + ", tipoInstalacion=" + tipoInstalacion + '}';
    }    
        
    @Override
    public Double calcularSuperficie() {
        return ancho*largo;
    }

    @Override
    public Double calcularVolumen() {
        return ancho*largo*alto;
    }
    
}
