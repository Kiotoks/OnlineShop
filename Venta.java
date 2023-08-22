/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shoponline;

import java.util.ArrayList;

import java.time.*; 
import java.time.format.DateTimeFormatter;

/**
 *
 * @author ET36
 */
public class Venta {
    private Cliente cliente;
    private static int cantVentas = 1090;
    private int nroFact;
    private LocalDate fecha;
    private ArrayList<Producto> listaProd = new ArrayList<>();
    
    public Venta(Cliente c, LocalDate fecha){
       
        this.fecha = fecha;
        this.cliente = c;
        this.nroFact = Venta.cantVentas + 1;
        Venta.cantVentas = this.nroFact;// CHEQUEAR SI ES NECESARIO
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void agregarProducto(Producto p){
        listaProd.add(p); // AGREGO UN PRODUCTO A A LISTA DE LA VENTA
    }
    
    public double calcularImporteFinal(){
        double precio = 0;
        for(Producto p : listaProd){
            precio += p.getPrecio();
        }
        return precio;
    }
    public void ImprimirFactura(){
        calcularImporteFinal();
        DateTimeFormatter isoFecha = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println("Factura N°: "+ this.nroFact+ " - " + this.fecha.format(isoFecha));
        for(Producto p : this.listaProd){
            System.out.println(p.toString()); // falta documentar
        }
        System.out.println("Total a pagar:..........$ "+ this.calcularImporteFinal());
        
    }
}
