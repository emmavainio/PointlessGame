import java.io.IOException;
import java.net.Socket;

public class Client {
    private final int PORT = 1234;

    public Client() {
        try (Socket socket = new Socket("192.168.1.245", PORT)) {

            new GUI();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("HI");
    }

    public static void main(String[] args) {
        new Client();
    }
}
