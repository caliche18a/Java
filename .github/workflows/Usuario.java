package clinica;

public class Usuario {
    private String nombre;
    private String apellido;
    private int documento;
    private int edad;

    public Usuario(String nombre, String apellido, int documento, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDocumento() {
        return documento;
    }

    public int getEdad(){
        return edad;
    }
}
