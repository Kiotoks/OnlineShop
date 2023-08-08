
package shoponline;

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
        return "Accesorio{" + "peso=" + peso + ", metal=" + metal + '}';
    }

    
    public double getPrecio(){
        if(metal=="oro"){
            precio = precioOro*peso;
        }
        if(metal=="plata"){
            precio = precioPlata*peso;
        }
        if(metal=="acero"){
            precio = precioAcero*peso;
        }
        return precio;
    }
    
  
}
