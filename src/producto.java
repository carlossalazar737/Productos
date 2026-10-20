public class producto {
    private String nombre;
    private double precio;
    private String categoria;
    private boolean disponible;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean Disponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void mostrarinformacion(){
        System.out.println("NOMBRE: "+ getNombre() + "\nPRECIO: "+ getPrecio() + "\nCategoria: "+ getCategoria() + "\nDisponibilidad:" + disponible);

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
