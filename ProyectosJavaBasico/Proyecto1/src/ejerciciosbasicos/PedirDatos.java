package ejerciciosbasicos;

import java.util.Scanner;

public class PedirDatos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Ingrese su dad: ");
        int edad = entrada.nextInt();

        System.out.println("Su nombre es: "+nombre+" y tienes "+edad+" años.");
    }


}
