package com.mycompany.shoponline;
import java.util.ArrayList;
import java.time.LocalDate; 

public class ShopOnline {

    public static void main(String[] args) {
        Cliente c = crearCliente();
        Venta v = crearVenta(c);
        v = cargarProducto(v);
      }

    public static Producto crearRemera(){
        Scanner teclado = new Scanner(System.in); 
        Talles t = Talles.S;
        System.out.println("Ingrese el talle (S, M, L, XL): ");
        char talle = teclado.next().charAt(0);
        switch(talle){
            case 'S': t = Talles.S;
            break;
            
            case 'M': t = Talles.M;
            break;
            
            case 'L': t = Talles.L;
            break;
            
            case 'X': t = Talles.XL;
            break;
            
        }
        System.out.println("Ingrese el precio: ");
        int precio == teclado.nextInt()

        System.out.println("Ingrese la descripcion del producto: ");
        String desc == teclado.nextInt()

        Producto r = new Remera(t, desc , precio );
        return r;
    }
    
    public static Producto hacerPantalon(){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el talle: ");
        int talle = teclado.nextInt();

        System.out.println("Ingrese el precio: ");
        int precio == teclado.nextInt()
        
        System.out.println("Ingrese el modelo de Pantalon: Oxford, Skinny, Recto\n");
        String modelo = teclado.next();
        
        Producto p = new Pantalon(talle, modelo, "Pantalon " + modelo , precio);
        return p;
    }
    
    public static Producto crearAccesorio(){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el peso: ");
        double peso = teclado.nextDouble();
        
        System.out.println("Ingrese el metal de la Cadena: Plata, Acero, Oro\n");
        String metal = teclado.next();
        
        System.out.println("Ingrese el precio por gramo: ");
        int precio == teclado.nextInt()
        
        Producto a = new Accesorio(peso, metal, "Cadena de " + metal , precio);
        return a;
    }
    
    public static Cliente crearCliente(){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese su DNI:");
        String dni = teclado.nextInt();
        
        System.out.println("Ingrese su nombre: ");
        String nombre = teclado.next();
        
        System.out.println("Ingrese su telefono: ");
        String tel = teclado.nextInt();
        
        Cliente c = new Cliente( dni,nombre, tel);
        
        return c;
    }
    
    public static Venta crearVenta(Cliente c){
        LocalDate fecha = LocalDate.now();
        Venta v = new Venta(c,fecha);
        
        return v;
    }
    
    public static Venta realizarVenta(Venta v){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Que producto quiere comprar (Remera, Pantalon, Accesorio): ");
        String opc = teclado.next();
        
        if(opc.equals("Remera")){
            Producto p = hacerRemera();
            v.agregarProducto(p);
        }
        if(opc.equals("Pantalon")){
            Producto p = hacerPantalon();
            v.agregarProducto(p);
        }
        if(opc.equals("Accesorio")){
            Producto p = hacerAccesorio();
            v.agregarProducto(p);
        }
        return v;
    }
    
    public static Venta cargarProducto(Venta v){
        Scanner teclado = new Scanner(System.in);
        while(true){
            v = realizarVenta(v);
            System.out.println("¿Quiere seguir agregando productos o no? 1-Si, 2-No: ");
            opc = teclado.nextInt();
            if(opc != 1){
                break;            
            }
        }
        v.imprimirFactura();
        return v;
    }
    
}
 
