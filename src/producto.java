public class producto {
    public String nombre;
    public double precio;
    String categoria;
    boolean disponible;
    public void mostrarinformacion(){
        System.out.println("NOMBRE: "+ nombre + "\nPRECIO: "+ precio + "\nCategoria: "+ categoria + "\nDisponibilidad:" + disponible);

    }
    public void cambiardisponibilidad(boolean nuevaDisponibilidad){
        disponible=nuevaDisponibilidad;
    }
    void mostrarprecio(){
        System.out.println("Precio: "+ precio);
    }
    void mostrardisponibilidad(){
        if(disponible){
            System.out.println("⭐El producto esta disponible⭐");
        }else{
            System.out.println("El producto no esta disponible");
        }
    }
}
