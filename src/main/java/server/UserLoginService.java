package server;

import client.jmdns.CommunicationService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class UserLoginService {

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(50056).addService(new UserLoginServiceImpl()).build();

        server.start();
        System.out.println("Server started at " + server.getPort());

        server.awaitTermination();
    }
    public void start() throws IOException, InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Server server = ServerBuilder.forPort(50056).addService(new UserLoginServiceImpl()).build();

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
