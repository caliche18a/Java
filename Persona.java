package colegio;

public class Persona {

    //Atributos
    private String nombre;
    private String apellido;
    private int edad;

    //Método constructor

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;


    }
    //Métodos getter
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
}
