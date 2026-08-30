package proxy;

public class RealFileService implements FileService {
    @Override
    public void read(String fileName) {
        System.out.println("Reading file: " + fileName);
    }
}