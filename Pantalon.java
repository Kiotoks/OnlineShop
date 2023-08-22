
package com.mycompany.shoponline;
 // Josue Bieber       
public class Pantalon extends Producto {
    private int talle;
    private String modelo;
    
  public Pantalon (int talle, String modelo, String desc, double precio){
      super(desc, precio);
      this.talle = talle;
      this.modelo = modelo;
      this.desc = desc;
      this.precio = precio; 
      
  }

    public int getTalle() {
        return talle;
    }

    public void setTalle(int talle) {
        this.talle = talle;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    @Override
    public String toString() {
        return desc + "........$ " + precio + "(talle:"+ talle +")" ;
    }
    
    public double getPrecio(){
        int porcentaje = 0;
        if("Oxford".equals(modelo)){
            porcentaje = 15;
            precio += precio*porcentaje/100;
        }
        if("Skinny".equals(modelo)){
            porcentaje = 25;
            precio += precio*porcentaje/100;
        }
        if("Recto".equals(modelo)){
            porcentaje = 15;
            precio -= precio*porcentaje/100;
        }
        return precio;
    }
    
  
}
