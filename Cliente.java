
package com.mycompany.shoponline;

public class Cliente {
       private int dni;
       private String nombre;
       private String direccion;
       private int telefono;
       private double codigo;

    public Cliente(int dni, String nombre, String direccion, int telefono, double codigo) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.codigo = codigo;
    }
    public String mostrarCliente(){
        return("DNI:" + dni + " Nombre:" + nombre + " Direccion:" + direccion + " Telefono:" + telefono + " Codigo:" + codigo);
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }
    
}