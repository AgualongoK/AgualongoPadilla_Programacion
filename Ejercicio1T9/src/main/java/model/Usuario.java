package model;

import java.io.Serializable;

public class Usuario implements Serializable {

    public Usuario(String nombre, String apellido, String pais, Float sueldo, Integer telefono, Integer id_perfil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.sueldo = sueldo;
        this.telefono = telefono;
        this.id_perfil = id_perfil;
    }


    public Usuario() {
    }

    private String nombre, apellido, pais;
    private Float sueldo;
    private Integer telefono, id_perfil;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Float getSueldo() {
        return sueldo;
    }

    public void setSueldo(Float sueldo) {
        this.sueldo = sueldo;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", pais='" + pais + '\'' +
                ", sueldo=" + sueldo +
                ", telefono=" + telefono +
                ", id_perfil=" + id_perfil +
                '}';
    }
}
