package clinica;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("--------------------------------");
        System.out.println("- 1: PACIENTE,2:MÉDICO,0:SALIR -");
        System.out.println("--------------------------------");
        System.out.print("Ingrese la opción: ");
            int opcion = entrada.nextInt();

            if (opcion==1) {

                    System.out.print("Ingrese el nombre del paciente: ");
                    String nombre = entrada.next();

                    System.out.print("Ingrese el apellido del paciente: ");
                    String apellido = entrada.next();

                    System.out.print("Ingrese el documento del paciente: ");
                    int documento = entrada.nextInt();

                    System.out.print("Ingrese la edad del paciente: ");
                    int edad = entrada.nextInt();

                    System.out.print("Ingrese la historia del paciente: ");
                    int historia = entrada.nextInt();

                    System.out.print("Ingrese el diagnóstico del paciente: ");
                    String diagnostico = entrada.next();


                    Paciente pc = new Paciente(nombre, apellido, documento, edad, historia, diagnostico);
                    pc.mostrarDatos();

            } else if (opcion==2) {
                    System.out.print("Ingrese el nombre del médico: ");
                    String nombre = entrada.next();

                    System.out.print("Ingrese el apellido del médico: ");
                    String apellido = entrada.next();

                    System.out.print("Ingrese el documento del médico: ");
                    int documento = entrada.nextInt();

                    System.out.print("Ingrese la edad del médico: ");
                    int edad = entrada.nextInt();

                    System.out.print("Ingrese el registro médico: ");
                    int registroMedico = entrada.nextInt();

                    System.out.print("Ingrese la especialidad del médico: ");
                    String especialidad = entrada.next();


                    Paciente pc = new Paciente(nombre, apellido, documento, edad, registroMedico, especialidad);
                    pc.mostrarDatos();
            }
            else if (opcion==0){
                    System.out.print("has salido del sistema.");

            }
            else {
                    System.out.println("La opción que ingresó no es válida");
            }

    }
}
