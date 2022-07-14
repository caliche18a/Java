package colegio;

public class Docente extends Persona{
    private int codigoDocente;
    private float sueldo;

    //herencia y método constructor
    public Docente(String nombre, String apellido, int edad, int codigoDocente, float sueldo) {
        super(nombre, apellido, edad);
        this.codigoDocente = codigoDocente;
        this.sueldo = sueldo;
    }

    //método para mostrar datos
    public void mostrarDatos(){
        System.out.println("El nombre es: "+getNombre());//encapsulación
        System.out.println("El apellido es: "+getApellido());//encapsulación
        System.out.println("La edad es: "+getEdad());//encapsulación
        System.out.println("El código es: "+codigoDocente);
        System.out.println("La nota final es: "+sueldo);
        System.out.println("------------------------------------------------");

    }

}
