package colegio;

public class Main {
    public static void main(String[] args) {

        //instanciar
        Estudiante est = new Estudiante("Carlos","Jiménez",36,02,4.5f);
        est.mostrarDatos();

        //instanciar
        Docente doc = new Docente("Gloria","Rojo",56,01,3000000);
        doc.mostrarDatos();
    }
}
