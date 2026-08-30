package proxy;

public class ProxyApp {
    public static void main() {
        FileService guest = new FileProxy("guest");
        guest.read("secret.txt");

        FileService admin = new FileProxy("admin");
        admin.read("secret.txt");
    }
}