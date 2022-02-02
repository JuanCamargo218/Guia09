
package Ejercicio01extra.entidades;

public class Velero extends Barco{
    private int numeroMastiles;

    public Velero() {
        super();
    }

    public Velero(int numeroMastiles, String matricula, Integer eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    @Override
    public String toString() {
        return "Velero{" + super.toString()+ "numeroMastiles=" + numeroMastiles + '}';
    }
       
    @Override
    public Double precioAlquiler(Alquiler a) {
        long fechaAlquiler= a.getFechaAlquiler().getDate();
        long fechaDevolucion= a.getFechaDevolucion().getTime();
        long diasDesde= (long) Math.floor(fechaAlquiler / (1000*60*60*24));
        long diasHasta= (long) Math.floor(fechaDevolucion / (1000*60*60*24));
        long dias = diasHasta - diasDesde;
        
        double modulo= 10 * a.getBarco().getEslora();
        
        return dias*(modulo + numeroMastiles);
    }
    
}
