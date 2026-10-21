public class Mainproducto {

    public static void main(String[] args) {
        System.out.println("Total: " + Producto.getTotalCreados());   // 0

        Producto p1 = new Producto("ETB", 89.99, "Pokemon", true);
        System.out.println("Total: " + Producto.getTotalCreados());   // 1

        Producto p2 = new Producto("Booster pack", 7.99, "Pokemon", false);
        Producto p3 = new Producto("Blister pack", 23.99, "Pokemon", true);
        System.out.println("Total: " + Producto.getTotalCreados());   // 3

        p1.mostrarInformacion();
        p1.mostrarDisponibilidad();
        p2.mostrarInformacion();
        p2.mostrarDisponibilidad();
        p3.mostrarInformacion();
        p3.mostrarPrecio();
    }
}