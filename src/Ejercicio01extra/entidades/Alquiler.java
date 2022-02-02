
package Ejercicio01extra.entidades;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Alquiler {
    private String nombre;
    private String documentoCliente;
    private Date fechaAlquiler;
    private Date fechaDevolucion;
    private Integer posicionAmarre;
    private Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, String documentoCliente, Date fechaAlquiler, Date fechaDevolucion, Integer posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.documentoCliente = documentoCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumentoCliente() {
        return documentoCliente;
    }

    public void setDocumentoCliente(String documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Integer getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(Integer posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", documentoCliente=" + documentoCliente + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", posicionAmarre=" + posicionAmarre + ", barco=" + barco + '}';
    }
    
    public Alquiler crearAlquiler(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Alquiler a1= new Alquiler();
        Barco v1= new Velero(2, "253641", 15, 2002);
        Barco bm1= new BarcoAMotor(30, "371186", 8, 2000);
        Barco y1= new YateDeLujo(35, 8, "236037", 15, 1992);        
        
        System.out.println("Ingrese su nombre:");
        a1.setNombre(leer.next());
        
        System.out.println("Ingrese su DNI:");
        a1.setDocumentoCliente(leer.next());
        
        System.out.println("Ingrese la fecha de alquiler (dd/mm/yyyy):");
        String fecha= leer.next();
        SimpleDateFormat df= new SimpleDateFormat("dd/MM/yyyy");
        Date fechaPrueba= null;
        String date= fecha;
        try{
            fechaPrueba= df.parse(date);
        }catch(Exception e){System.out.println("Fecha invalida!!");}
        
        if (!df.format(fechaPrueba).equals(date)) {
            System.out.println("Fecha Invalida");
        }else{
            System.out.println("Fecha Valida");
            a1.setFechaAlquiler(fechaPrueba);
        }
        
        System.out.println("Ingrese la fecha de devolucion (dd/MM/yyyy):");
        String fecha2= leer.next();
        SimpleDateFormat df2= new SimpleDateFormat("dd/MM/yyyy");
        Date fechaPrueba2= null;
        String date2= fecha;
        try{
            fechaPrueba2= df.parse(date2);
        }catch(Exception e){System.out.println("Fecha invalida!!");}
        
        if (!df.format(fechaPrueba2).equals(date2)) {
            System.out.println("Fecha Invalida");
        }else{
            System.out.println("Fecha Valida");
            a1.setFechaDevolucion(fechaPrueba2);
        }
        
        System.out.println("Ingrese la posicion de amarre:");
        a1.setPosicionAmarre(leer.nextInt());
        
        System.out.println("Seleccione el barco que desee alquilar:");
        System.out.println("1. Velero");
        System.out.println("2. Barco a motor");
        System.out.println("3. Yate de lujo");
        int barco= leer.nextInt();
        
        switch(barco){
            case 1:
                a1.setBarco(v1);
                break;
            case 2:
                a1.setBarco(bm1);
                break;
            case 3:
                a1.setBarco(y1);
                break;
        }
        
        return a1;        
    }
    
       
    
    
}
