
package com.mycompany.shoponline;

public class Remera extends Producto {
    private char talle;
    
  public Remera (char talle, String desc, double precio){
      super(desc, precio);
      this.talle = talle;
      this.desc = desc;
      this.precio = precio; 
   
  }

    public char getTalle() {
        return talle;
    }
    public void setTalle(char talle) {
        this.talle = talle;
    }
    public String toString() {
        return desc + "........$ " + precio + "(talle:"+ talle +")" ;
    }
    
    public double getPrecio(){
        int porcentaje = 0;
        if(talle=='S'){
            porcentaje = 5;
        }
        if(talle=='M'){
            porcentaje = 10;
        }
        if(talle=='L'){
            porcentaje = 15;
        }
        if(talle=='X'){
            porcentaje = 20;
        }
        precio += precio*porcentaje/100;
        return precio;
    }
    
  
}
