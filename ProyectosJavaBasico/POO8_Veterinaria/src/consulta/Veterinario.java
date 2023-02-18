package consulta;

import clasespadre.Empleado;

import java.util.ArrayList;
import java.util.List;

public class Veterinario extends Empleado {

    private String especialidad;
    private List<Consulta> consultas;

    public Veterinario(long cedula, String nombre, String apellido, int edad, double sueldo, String especialidad) {
        super(cedula, nombre, apellido, edad, sueldo);
        this.setEspecialidad(especialidad);
        this.setConsultas(new ArrayList<>());
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    @Override
    public void calcularSueldo() {

    }




}
