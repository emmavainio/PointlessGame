import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private final int port = 1234;

    public Server() {
        try (ServerSocket ss = new ServerSocket(port)) {
            Socket socket;
            while ((socket = ss.accept()) != null) {
                System.out.println("HEJ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Server();
    }
}
