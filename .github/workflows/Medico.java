package clinica;

public class Medico extends Usuario {

    private int registroMedico;
    private String especialidad;

    public Medico(String nombre, String apellido, int documento, int edad, int registroMedico, String especialidad) {
        super(nombre, apellido, documento, edad);
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }

    public int getRegistroMedico() {
        return registroMedico;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void mostrarDatos(){
        System.out.println("Los datos del médico son:");
        System.out.println("Nombre médico: "+getNombre());
        System.out.println("Apellido médico: "+getApellido());
        System.out.println("Documento médico: "+getDocumento());
        System.out.println("Edad médico: "+getEdad());
        System.out.println("Registro médico: "+registroMedico);
        System.out.println("Especialidad: "+especialidad);
        System.out.println("-------------------------------------");
    }
}
