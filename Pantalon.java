
package shoponline;
        
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
        return "Pantalon{" + "talle=" + talle + '}';
    }
    
    public double getPrecio(){
        int porcentaje = 0;
        if(modelo=="Oxford"){
            porcentaje = 15;
            precio += precio*porcentaje/100;
        }
        if(modelo=="Skinny"){
            porcentaje = 25;
            precio += precio*porcentaje/100;
        }
        if(modelo=="Recto"){
            porcentaje = 15;
            precio -= precio*porcentaje/100;
        }
        return precio;
    }
    
  
}
