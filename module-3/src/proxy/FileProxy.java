package proxy;

public class FileProxy implements FileService {
    private final RealFileService realService = new RealFileService();
    private final String role;

    public FileProxy(String role) {
        this.role = role;
    }

    @Override
    public void read(String fileName) {
        if (!role.equals("admin")) {
            System.out.println("Access denied");
            return;
        }
        realService.read(fileName);
    }
}