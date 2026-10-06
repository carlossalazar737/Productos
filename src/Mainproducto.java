public class Mainproducto {
    public static void main(String[] args) {
        producto P1 = new producto();
        producto P2 = new producto();
        producto P3 = new producto();
        P1.nombre = "ETB";
        P1.precio = 89.99;
        P1.categoria = "Pokemon";
        P1.disponible = true;
        P2.nombre = "Booster pack";
        P2.precio = 7.99;
        P2.categoria = "Pokemon";
        P2.disponible = false;
        P3.nombre = "Blister pack";
        P3.precio = 23.99;
        P3.categoria = "Pokemon";
        P3.disponible = true;
        P1.mostrarinformacion();
        P1.mostrardisponibilidad();
        P2.mostrarinformacion();
        P2.mostrardisponibilidad();
        P3.mostrarinformacion();
        P3.mostrarprecio();
    }
}