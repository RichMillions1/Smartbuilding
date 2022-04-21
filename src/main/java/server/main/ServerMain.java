package server.main;

import client.jmdns.CommunicationService;
import server.*;
import server.jmdns.JmDNSServer;

import java.io.IOException;

public class ServerMain {
    public static void main(String[] args) {
        try {
            new WelcomeServer().start();
            new UserLoginService().start();
            new UserInforService().start();
            new PriceService().start();
            new MainService().start();
            new CalculationService().start();
            JmDNSServer.startServer();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
