package clasespadre;

public abstract class Empleado extends Persona implements Iacciones{
    private double sueldo;

    public Empleado(long cedula, String nombre, String apellido, int edad, double sueldo) {
        super(cedula, nombre, apellido, edad);
        this.setSueldo(sueldo);
    }


    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
