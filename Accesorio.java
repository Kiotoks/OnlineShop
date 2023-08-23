
package com.mycompany.shoponline;
// Autor: Bieber
public class Accesorio extends Producto {
    private double peso;
    private String metal;
    
  public Accesorio (double peso, String metal, String desc, double precio){
      super(desc, precio);
      this.peso = peso;
      this.metal = metal;
      this.desc = desc;
      this.precio = precio; 
   
  }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }

    public String toString() {
        // HAY CÓDIGO REDUNDANTE, volver a pensar
        return desc + "........$ " + precio + "(metal:"+ metal+" " + peso+"g)" ;
    }

    
    public double getPrecio(){
        precio = precio * peso;
        return precio;
    }
    
  
}
