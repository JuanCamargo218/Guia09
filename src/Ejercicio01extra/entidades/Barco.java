
package Ejercicio01extra.entidades;

public abstract class Barco {
    protected String matricula;
    protected Integer eslora;
    protected Integer anioFabricacion;

    public Barco() {
    }

    public Barco(String matricula, Integer eslora, Integer anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Integer anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", anioFabricacion=" + anioFabricacion + '}';
    }
    
    public abstract Double precioAlquiler(Alquiler a);
        
        /*long fechaAlquiler= a.getFechaAlquiler().getDate();
        long fechaDevolucion= a.getFechaDevolucion().getTime();
        long diasDesde= (long) Math.floor(fechaAlquiler / (1000*60*60*24));
        long diasHasta= (long) Math.floor(fechaDevolucion / (1000*60*60*24));
        long dias = diasHasta - diasDesde;
        
        double modulo= 10 * a.getBarco().getEslora();
        
        return dias*modulo;*/        
    
}
