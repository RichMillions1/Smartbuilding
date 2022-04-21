package client;

import com.proto.smartbuilding.MainServiceGrpc;
import com.proto.smartbuilding.MenuRequest;
import com.proto.smartbuilding.MenuResponse;
import io.grpc.*;

import java.util.Scanner;

public class MainClient {

    class MainClientInterceptor implements ClientInterceptor {
        @Override
        public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> method, CallOptions callOptions, Channel next) {
            System.out.println("client interceptor");
            System.out.println(method.getFullMethodName());
            return next.newCall(method, callOptions);
        }
    }

    public static void main(String[] args) throws Exception {
        new MainClient().start();
    }

    private void start() {
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 50000)
                .usePlaintext()
                // Enable TLS
//                .useTransportSecurity(certChainFile, privateKeyFile)
                .build();
//        ManagedChannel channel2 = NettyChannelBuilder.forAddress("localhost", 50057)
//                .sslContext(GrpcSslContexts.forClient().trustManager(new File("roots.pem")).build());
        ClientInterceptor interceptor = new MainClientInterceptor();
        Channel interceptChannel = ClientInterceptors.intercept(channel, interceptor);
//        MainServiceGrpc.MainServiceBlockingStub userStub = MainServiceGrpc.newBlockingStub(channel);
        MainServiceGrpc.MainServiceBlockingStub userStub = MainServiceGrpc.newBlockingStub(interceptChannel);

        boolean value = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter menu to get system menu");
        do {
            try {

                String m = sc.next();
                if (m.equals("menu")) {
                    value = true;
                } else {
                    value = false;
                }
                MenuRequest menuRequest = MenuRequest.newBuilder().setMenu(m).build();
                MenuResponse response = userStub.mainMenu(menuRequest);
                System.out.println(response.getMenuResults());


            } catch (Exception e) {
                System.out.println("You have entered invalid word it should be menu only");

            }
        } while (value == false);
    }

    public static String getMenu(String input) {
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 50000)
                .usePlaintext()
                .build();

        MainServiceGrpc.MainServiceBlockingStub userStub = MainServiceGrpc.newBlockingStub(channel);
        try {

            MenuRequest menuRequest = MenuRequest.newBuilder().setMenu(input).build();
            MenuResponse response = userStub.mainMenu(menuRequest);
            System.out.println(response.getMenuResults());
            return response.getMenuResults();
        } catch (Exception e) {
            System.out.println("You have entered invalid word it should be menu only");
            return "You have entered invalid word it should be menu only";
        } finally {
            channel.shutdown();
        }
    }
}