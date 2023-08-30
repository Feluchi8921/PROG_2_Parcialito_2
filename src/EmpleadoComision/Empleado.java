package EmpleadoComision;

public class Empleado extends Persona{
    private int numero;
    private double sueldo;
    public Empleado(String nombre, String apellido, String dni, int numero, double sueldo) {
        super(nombre, apellido, dni);
        this.numero = numero;
        this.sueldo = sueldo;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

}
