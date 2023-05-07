package problema4;

class Cheque{
    private String nombreCliente;
    private String nombreBanco;
    private double valor;
    private double comision;

    public Cheque() {}

    public Cheque(String nombreCliente, String nombreBanco, double valor) {
        this.nombreCliente = nombreCliente;
        this.nombreBanco = nombreBanco;
        this.valor = valor;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void calcularComision() {
        this.comision = this.valor * 0.00003;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public double getValor() {
        return valor;
    }

    public double getComision() {
        return comision;
    }

    @Override
    public String toString() {
        return "Cheque{" + "nombreCliente=" + nombreCliente + ", nombreBanco=" + nombreBanco + ", valor=" + valor + ", comision=" + comision + '}';
    }
    
}

public class Problema4 {

    public static void main(String[] args) {
        
        Cheque cheque1 = new Cheque("Mria","Banco del Austro",1993550);
        cheque1.calcularComision();
        System.out.println(cheque1);
        
    }
    
}

