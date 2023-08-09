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
        this.nroFact = this.cantVentas + 1;
        this.cantVentas = this.nroFact;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void agregarProducto(Producto p){
        listaProd.add(p);
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
        System.out.println("Factura N°: "+ nroFact+ " - " + fecha.format(isoFecha));
        for(Producto p : listaProd){
            System.out.println(p.toString());
        }
        System.out.println("Total a pagar:..........$ "+ calcularImporteFinal());
        
    }
}
