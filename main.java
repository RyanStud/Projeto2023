public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.imprimirMenu();

        Usuario usuario1 = new Usuario("Maicou", "Maicou@email.com", "senha123", 30, "Rua que existe, 123");
        Usuario usuario2 = new Usuario("Maria", "maria@email.com", "senha456", 25, "Avenida de asfalto, 456");
        Usuario usuario3 = new Usuario("Pedro", "pedro@email.com", "senha789", 28, "Alameda dos alamos, 789");

        System.out.println(usuario1);
        System.out.println(usuario2);
        System.out.println(usuario3);
    }
}