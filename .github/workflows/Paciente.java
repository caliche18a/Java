package clinica;

import java.util.Scanner;

public class Paciente extends Usuario{

    private int historia;
    private String diagnostico;

    public Paciente(String nombre, String apellido, int documento, int edad, int historia, String diagnostico) {
        super(nombre, apellido, documento, edad);
        this.historia = historia;
        this.diagnostico = diagnostico;
    }

    public void mostrarDatos(){

        System.out.println("Nombre paciente: "+getNombre());
        System.out.println("Apellido paciente: "+getApellido());
        System.out.println("Documento paciente: "+getDocumento());
        System.out.println("Edad paciente: "+getEdad());
        System.out.println("Historia clínica: "+historia);
        System.out.println("Diagnóstico: "+diagnostico);
        System.out.println("-------------------------------------");
    }

    public void entrarDatos(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Los datos del paciente son:");
        System.out.print("Ingrese el nombre del paciente: ");
        String nombre = entrada.nextLine();
        System.out.print("Ingrese el apellido del paciente: ");
        String apellido = entrada.nextLine();
        System.out.print("Ingrese el documento del paciente: ");
        int documento = entrada.nextInt();
        System.out.print("Ingrese la edad del paciente: ");
        int edad = entrada.nextInt();
        System.out.print("Ingrese la historia del paciente: ");
        int historia = entrada.nextInt();
        System.out.print("Ingrese el diagnóstico del paciente: ");
        String diagnostico = entrada.next();


    }
}
