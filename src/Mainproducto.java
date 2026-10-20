public class Mainproducto {
    public static void main(String[] args) {
        producto P1 = new producto();
        producto P2 = new producto();
        producto P3 = new producto();
        P1.setNombre("ETB");
        P1.setPrecio(89.99);
        P1.setCategoria("Pokemon");
        P1.setDisponible(true);

        P2.setNombre("Booster pack");
        P2.setPrecio(7.99);
        P2.setCategoria("Pokemon");
        P2.setDisponible(false);

        P3.setNombre("Blister pack");
        P3.setPrecio(23.99);
        P3.setCategoria("Pokemon");
        P3.setDisponible(true);

        P1.mostrarinformacion();
        P1.mostrardisponibilidad();
        P2.mostrarinformacion();
        P2.mostrardisponibilidad();
        P3.mostrarinformacion();
        P3.mostrarprecio();
    }
}