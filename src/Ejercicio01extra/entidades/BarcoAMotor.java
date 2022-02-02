
package Ejercicio01extra.entidades;

public class BarcoAMotor extends Barco{
    private int potenciaCV;

    public BarcoAMotor() {
        super();
    }

    public BarcoAMotor(int potenciaCV, String matricula, Integer eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public String toString() {
        return "BarcoAMotor{" + super.toString() + "potenciaCV=" + potenciaCV + '}';
    }
    
    @Override
    public Double precioAlquiler(Alquiler a) {
        long fechaAlquiler= a.getFechaAlquiler().getDate();
        long fechaDevolucion= a.getFechaDevolucion().getTime();
        long diasDesde= (long) Math.floor(fechaAlquiler / (1000*60*60*24));
        long diasHasta= (long) Math.floor(fechaDevolucion / (1000*60*60*24));
        long dias = diasHasta - diasDesde;
        
        double modulo= 10 * a.getBarco().getEslora();
        
        return dias*(modulo + potenciaCV);
    }
    
}
