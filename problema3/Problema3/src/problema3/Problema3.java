package problema3;


class Automotor{
    private String cedulaPropietario;
    private String marca;
    private int anioFafricacion;
    private double valorVehiculo;
    private double valorMatricula;
    
    public Automotor(){}

    public Automotor(String cedulaPropietario, String marca, int anioFafricacion, double valorVehiculo) {
        this.cedulaPropietario = cedulaPropietario;
        this.marca = marca;
        this.anioFafricacion = anioFafricacion;
        this.valorVehiculo = valorVehiculo;
    }

    public void setCedulaPropietario(String cedulaPropietario) {
        this.cedulaPropietario = cedulaPropietario;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnioFafricacion(int anioFafricacion) {
        this.anioFafricacion = anioFafricacion;
    }

    public void setValorVehiculo(double valorVehiculo) {
        this.valorVehiculo = valorVehiculo;
    }
    
    public void calcularValorMatricula() {
        this.valorMatricula = (this.valorVehiculo * 0.00002) * ( 2023 - this.anioFafricacion);
    }

    public String getCedulaPropietario() {
        return cedulaPropietario;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnioFafricacion() {
        return anioFafricacion;
    }

    public double getValorVehiculo() {
        return valorVehiculo;
    }

    public double getValorMatricula() {
        return valorMatricula;
    }

    @Override
    public String toString() {
        return "Automotor{" + "cedulaPropietario=" + cedulaPropietario + ", marca=" + marca + ", anioFafricacion=" + anioFafricacion + ", valorVehiculo=" + valorVehiculo + ", valorMatricula=" + valorMatricula + '}';
    }
    
}

public class Problema3 {
    public static void main(String[] args) {
        
        Automotor automotor1 = new Automotor("1105678910","Tesla" ,2015,46990);
        automotor1.calcularValorMatricula();
        System.out.println(automotor1); 
    }
    
}