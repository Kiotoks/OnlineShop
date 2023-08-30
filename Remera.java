
package com.mycompany.shoponline;
// Josue Bieber
public class Remera extends Producto {
    private Talles talle;
    
  public Remera (Talles talle, String desc, double precio){
      super(desc, precio);
      this.talle = talle;
      this.desc = desc;
      this.precio = precio; 
   
  }

    public char getTalle() {
        return talle;
    }
    public void setTalle(Talles talle) {
        this.talle = talle;
    }
    public String toString() {
        // idem Pantalón
        return super.toString() + "(talle:"+ talle +")" ;
    }
    
    public double getPrecio(){
        int porcentaje = 0;
         switch(talle){
            case S: this.precio += 5*this.precio/100;
            break;
            
            case M: this.precio += 10*this.precio/100;
            break;
            
            case L: this.precio += 15*this.precio/100;
            break;
            
            case XL: this.precio += 20*this.precio/100;
            break;
        }
        this.precio += precio*porcentaje/100;
        return precio;
    }
    
  
}
