package consulta;

import clasespadre.Persona;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {

    private List<Mascota> mascotas;

    public Cliente(long cedula, String nombre, String apellido, int edad) {
        super(cedula, nombre, apellido, edad);

        this.mascotas = new ArrayList<>();
    }


    public List<Mascota> getMascotas() {
        return mascotas;
    }
}
