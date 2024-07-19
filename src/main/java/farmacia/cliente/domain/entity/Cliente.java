package farmacia.cliente.domain.entity;

import java.sql.Date;

public class Cliente {
    private int nro_identificacion;
    private String nombres;
    private String apellidos;
    private int edad;
    private Date fecha_nacimiento;
    private Date fecha_registro;
    private String ciudad_radical;
    private String barrio;
    private int tipo_identificacion_id;
    public Cliente(int tipo_identificacion_id) {
        this.tipo_identificacion_id = tipo_identificacion_id;
    }
    public int getNro_identificacion() {
        return nro_identificacion;
    }
    public void setNro_identificacion(int nro_identificacion) {
        this.nro_identificacion = nro_identificacion;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }
    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    public Date getFecha_registro() {
        return fecha_registro;
    }
    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }
    public String getCiudad_radical() {
        return ciudad_radical;
    }
    public void setCiudad_radical(String ciudad_radical) {
        this.ciudad_radical = ciudad_radical;
    }
    public String getBarrio() {
        return barrio;
    }
    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }
    public int getTipo_identificacion_id() {
        return tipo_identificacion_id;
    }
    public void setTipo_identificacion_id(int tipo_identificacion_id) {
        this.tipo_identificacion_id = tipo_identificacion_id;
    }
    

}
