package consulta;

import factura.Factura;

import java.time.LocalDateTime;

public class Consulta {
    private LocalDateTime fecha;
    private long idConsulta;
    private Veterinario veterinario;
    private Mascota mascota;
    private String descripcion;
    private Factura factura;

    public Consulta(long idConsulta, String descripcion) {
        this.setFecha(LocalDateTime.now());
        this.setIdConsulta(idConsulta);
        this.setDescripcion(descripcion);
    }

    public Consulta (int anio, int mes, int dia, int hora, int minuto, long idConsulta, String descripcion){

        this.setFecha(LocalDateTime.of(anio,mes,dia,hora,minuto));

        this.setIdConsulta(idConsulta);
        this.setDescripcion(descripcion);
    }


    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public long getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(long idConsulta) {
        this.idConsulta = idConsulta;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public void relacionConObjetos(Mascota mascota,Veterinario veterinario){
        mascota.getConsultas().add(this);
        setMascota(mascota);
        setVeterinario(veterinario);
        veterinario.getConsultas().add(this);
    }
}
