package client.jmdns;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import server.MainServiceImpl;

import java.io.IOException;

public class CommunicationService {
    public static void main(String[] args) throws IOException, InterruptedException {
        start();
    }

    public static void start() throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(40000).addService(new CommunicationServiceImpl()).build();
        server.start();
        System.out.println("Server started at " + server.getPort());
        server.awaitTermination();
    }
}
