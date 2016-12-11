import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class HelloWorld2 {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        Greeter myGreeterObject = new Greeter();
        myGreeterObject.sayHello();

        Socket MyClient;
    try {
           MyClient = new Socket("Machine name", 53645);
    }
    catch (IOException e) {
        System.out.println(e);
    }
    }

}
