import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {
    private final int PORT = 1234;

    public Client() {
        GUI gui = new GUI();

        try (Socket socket = new Socket("192.168.1.245", PORT);
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream())) {
            
            while (true) {
                Game p = (Game) in.readObject();

                


            }


            

        } catch (IOException | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("HI");
    }

    public static void main(String[] args) {
        new Client();
    }
}
