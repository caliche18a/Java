package colegio;

//hereda de la clase Persona
public class Estudiante extends Persona{

    private int codigoEstudiante;
    private float notaFinal;

    //herencia y método constructor
    public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal) {
        super(nombre, apellido, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }

    public void mostrarDatos(){
        System.out.println("El nombre es: "+getNombre());//encapsulación
        System.out.println("El apellido es: "+getApellido());//encapsulación
        System.out.println("La edad es: "+getEdad());//encapsulación
        System.out.println("El código es: "+codigoEstudiante);
        System.out.println("La nota final es: "+notaFinal);
        System.out.println("------------------------------------------------");

    }

}
