package client.jmdns;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.io.IOException;
import java.net.InetAddress;

public class JmDNSClient {
    public static void main(String[] args) {
        try {
            startClient();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void startClient() throws IOException, InterruptedException {
        // Create a JmDNS instance
        JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
        // Register a service
        ServiceInfo serviceInfo = ServiceInfo.create("_http._tcp.local.", "smart-building-client", 1234, "path=test.html");
        jmdns.registerService(serviceInfo);
        // Wait a bit
        Thread.sleep(5000);
        // Unregister all services
        jmdns.unregisterAllServices();

    }
}
