package com.mycompany.shoponline;

public abstract class Producto {
 protected String desc;
 protected double precio;

    public Producto(String desc, double precio) {
        this.desc = desc;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return this.desc + "........ $ " + this.precio;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public abstract double getPrecio();

    public void setPrecio(double precio) {
        this.precio = precio;
    }
 

 
 
}