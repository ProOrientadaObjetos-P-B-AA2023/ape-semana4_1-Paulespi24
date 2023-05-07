package problema2;


class Profesores{
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;
    
    public Profesores() {}
    
    public Profesores(String nombre, String apellido, double sueldoBasico, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public void calcularSueldoTotal() {
        this.sueldoTotal = this.sueldoBasico + (this.sueldoBasico*0.2);
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public double getSueldoTotal() {
        return sueldoTotal;
    }

    public String getCedula() {
        return cedula;
    }

    @Override
    public String toString() {
        return "Profesores{" + "nombre=" + nombre + ", apellido=" + apellido + ", sueldoBasico=" + sueldoBasico + ", sueldoTotal=" + sueldoTotal + ", cedula=" + cedula + '}';
    }
    
}

public class Problema2 {

    public static void main(String[] args) {
       
        Profesores profesor1 = new Profesores("Migel","Perez", 100,"110232839");
        profesor1.calcularSueldoTotal();
        System.out.println(profesor1);
        
    }
    
}