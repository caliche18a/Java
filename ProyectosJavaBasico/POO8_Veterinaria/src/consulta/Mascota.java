package consulta;

import java.util.ArrayList;
import java.util.List;

public class Mascota {
    private long idMascota;
    private String especie;
    private String raza;
    private String nombre;
    private Cliente cliente;
    private List<Consulta> consultas;

    public Mascota(long idMascota, String especie, String raza, String nombre, Cliente cliente) {
        this.setIdMascota(idMascota);
        this.setEspecie(especie);
        this.setRaza(raza);
        this.setNombre(nombre);
        this.setCliente(cliente);

        this.setConsultas(new ArrayList<>());
    }


    public long getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(long idMascota) {
        this.idMascota = idMascota;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }
}
