package co.edu.uptc.controller;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Controller {

    private final int PORT  = 49045;// Toca pedirlo por View
    private Socket socket;
    private ServerSocket serverSocket;

    public Controller() throws IOException{
        serverSocket = new ServerSocket(PORT);
        while (true) {
            socket = serverSocket.accept();
            new ClientsThread(socket).start();
        }
    }
}
