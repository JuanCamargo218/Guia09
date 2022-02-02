
package Ejercicio01extra.entidades;

public class YateDeLujo extends Barco{
    private int potenciaCV;
    private int numeroCamarotes;

    public YateDeLujo() {
        super();
    }

    public YateDeLujo(int potenciaCV, int numeroCamarotes, String matricula, Integer eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
        this.numeroCamarotes = numeroCamarotes;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }

    public void setNumeroCamarotes(int numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }

    @Override
    public String toString() {
        return "YateDeLujo{" + super.toString()+ "potenciaCV=" + potenciaCV + ", numeroCamarotes=" + numeroCamarotes + '}';
    }
    
    @Override
    public Double precioAlquiler(Alquiler a) {
        long fechaAlquiler= a.getFechaAlquiler().getDate();
        long fechaDevolucion= a.getFechaDevolucion().getTime();
        long diasDesde= (long) Math.floor(fechaAlquiler / (1000*60*60*24));
        long diasHasta= (long) Math.floor(fechaDevolucion / (1000*60*60*24));
        long dias = diasHasta - diasDesde;
        
        double modulo= 10 * a.getBarco().getEslora();
        
        return dias*(modulo + potenciaCV + numeroCamarotes);
    }
    
}
