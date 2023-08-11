
package com.mycompany.shoponline;

public class Accesorio extends Producto {
    private double peso;
    private String metal;
    static double precioOro = 300;
    static double precioPlata = 200;
    static double precioAcero = 100;
    
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
        return desc + "........$ " + precio + "(metal:"+ metal+" " + peso+"g)" ;
    }

    
    public double getPrecio(){
        if("oro".equals(metal)){
            precio = precioOro*peso;
        }
        if("plata".equals(metal)){
            precio = precioPlata*peso;
        }
        if("acero".equals(metal)){
            precio = precioAcero*peso;
        }
        return precio;
    }
    
  
}
