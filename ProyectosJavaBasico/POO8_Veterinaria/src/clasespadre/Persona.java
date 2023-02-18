package clasespadre;

public abstract class Persona {
    private long cedula;
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(long cedula, String nombre, String apellido, int edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }


    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString(){
        return "Persona: ";
    }


}
