package co.edu.uptc.controller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class ClientsThread extends Thread{

    private Socket socket;
    private DataOutputStream dataOutput;
    private DataInputStream dataInput;

    public ClientsThread(Socket socket) {
        this.socket = socket;
    }

    public void run() {
         try {
            dataOutput = new DataOutputStream(socket.getOutputStream());
            dataInput = new DataInputStream(socket.getInputStream());
            System.out.println("Cliente conectado " + socket.getInetAddress());

            boolean running = true;

            while (running) {
                String command = dataInput.readUTF();

            }

            socket.close();
            dataOutput.close();
            dataInput.close();
            System.out.println("Cliente desconectado: " + socket.getInetAddress());

        } catch (Exception e) {
            System.out.println("Error en el hilo del cliente: " + e.getMessage());
        }
    }
}
