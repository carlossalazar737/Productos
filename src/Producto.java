public class Producto {
    private String nombre;
    private double precio;
    private String categoria;
    private boolean disponible;
    private int id;
    private static int contador = 0;

    public Producto(String nombre, double precio, String categoria, boolean disponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.disponible = disponible;
        contador++;
        this.id = contador;
    }

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

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getId() {
        return id;
    }

    public static int getTotalCreados() {
        return contador;
    }

    public void mostrarInformacion() {
        System.out.println("ID: " + getId() + "\nNOMBRE: " + getNombre() + "\nPRECIO: " + getPrecio() + "\nCATEGORIA: " + getCategoria() + "\nDISPONIBILIDAD: " + isDisponible());
    }

    public void cambiarDisponibilidad(boolean nuevaDisponibilidad) {
        setDisponible(nuevaDisponibilidad);
    }

    public void mostrarPrecio() {
        System.out.println("Precio: " + getPrecio());
    }

    public void mostrarDisponibilidad() {
        if (isDisponible()) {
            System.out.println("⭐ El producto está disponible ⭐");
        } else {
            System.out.println("El producto no está disponible");
        }
    }
}

