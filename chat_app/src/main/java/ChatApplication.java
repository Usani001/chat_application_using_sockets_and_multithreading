import com.clientandserver.Client1;
import com.clientandserver.Server;

public class ChatApplication {
    public static void main(String[] args) {
        Client1 client1 = new Client1();
        Server server = new Server();
        Thread client1Thread = new Thread(client1);
        client1Thread.start();


        Thread serverThread = new Thread(server);
        serverThread.start();

    }
}
