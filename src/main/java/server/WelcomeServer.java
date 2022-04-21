package server;

import io.grpc.*;

import java.io.File;
import java.io.IOException;

public class WelcomeServer{

    public static void main(String[] args) throws IOException, InterruptedException {
        WelcomeServerImpl welcomeServer = new WelcomeServerImpl();
        Server server = ServerBuilder.forPort(50055)
                .addService(welcomeServer)
                .build();

        server.start();
        System.out.println("Server started at " + server.getPort());
        server.awaitTermination();
    }

    public void start() throws IOException, InterruptedException{
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    WelcomeServerImpl welcomeServer = new WelcomeServerImpl();
                    Server server = ServerBuilder.forPort(50055)
                            .addService(welcomeServer)
                            .build();

                    server.start();
                    System.out.println("Server started at " + server.getPort());
                    server.awaitTermination();
                } catch (IOException ex) {
                    ex.printStackTrace();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }).start();

    }
}
