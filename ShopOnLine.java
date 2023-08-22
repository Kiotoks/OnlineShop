package com.mycompany.shoponline;
import java.util.ArrayList;
import java.time.*; 
import java.time.format.DateTimeFormatter;

public class Shoponline {

    public static void main(String[] args) {
        // modificar usando método en esta clase para permitir al usuario crear diferentes productos
        Producto r = new Remera('L', "Remera recta blanca", 2300);
        Producto p = new Pantalon(44,"Oxford", "Pantalon tiro alto", 4000);
        Producto a = new Accesorio(46, "Oro", "collar + dije", 3000);
       
        Cliente c = new Cliente(11231, "Javier", "sexo",13453, 23423);
        
        LocalDate f = LocalDate.now();
       
        Venta v = new Venta(c,f);
        v.agregarProducto(p);
        v.agregarProducto(r);
        v.agregarProducto(a);
        v.ImprimirFactura();
        double precioPantalon = p.getPrecio();
        System.out.println(precioPantalon);
    }
}
