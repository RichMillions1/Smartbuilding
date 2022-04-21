package server;

import client.jmdns.CommunicationService;
import io.grpc.*;

import java.io.IOException;

public class MainService {
    public static void main(String[] args) throws IOException, InterruptedException {
        //        File certChainFile = new File("") ;
//        File privateKeyFile = new File("") ;
        Server server = ServerBuilder.forPort(50000)
                //                .addService(ServerInterceptors.intercept(mainService, new MainServerInterceptor()))
                .addService(new MainServiceImpl())
                .build();
        server.start();
        System.out.println("Server started at " + server.getPort());
        server.awaitTermination();
    }

    public void start() throws IOException, InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //        File certChainFile = new File("") ;
//        File privateKeyFile = new File("") ;
                    Server server = ServerBuilder.forPort(50000)
                            //                .addService(ServerInterceptors.intercept(mainService, new MainServerInterceptor()))
                            .addService(new MainServiceImpl())
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
