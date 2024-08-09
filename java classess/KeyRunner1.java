public class KeyRunner1 {
    public static void main(String[] args) {
        Key key1 = new Key(90, "radha");
        Keybunch keybunch1 = new Keybunch("Steel", key1);

        Key key2 = new Key(80, "krishna");
        Keybunch keybunch2 = new Keybunch("Plastic", key2);

        keybunch1.details();
        keybunch2.details();
    }
}