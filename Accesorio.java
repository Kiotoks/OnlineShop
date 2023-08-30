
package com.mycompany.shoponline;
// Autor: Bieber
public class Accesorio extends Producto implements Importable{
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

    public void setPeso(double peso) 
        this.peso = peso;
    }

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }
    @Override
    public void arancelAduanero(){
        this.precio += 10*this.precio/100;
        JOptionPane.showMessageDialog(null, "Arancel Aduanero: " + this.precio);
    }
    
    @Override
    public void arancelTransporte(){
        this.precio += 2*this.precio/100;
        JOptionPane.showMessageDialog(null, "Arancel de Transporte: " + this.precio);
    }
    
    @Override
    public String toString() {
        // HAY CÓDIGO REDUNDANTE, volver a pensar
        return super.toString() + "(metal:"+ metal+" " + peso+"g)" ;
    }

    @Override    
    public double getPrecio(){
        // falta invocar a los métodos de la Interface
        precio = precio * peso;
        return precio;
    }
    
  
}
