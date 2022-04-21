package server.jmdns;

import com.proto.smartbuilding.ClientRequest;
import com.proto.smartbuilding.CommunicationGrpc;
import com.proto.smartbuilding.ServerResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class CommunicationClient {
    public static void main(String[] args) throws Exception {
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 40000)
                .usePlaintext()
                .build();

        CommunicationGrpc.CommunicationBlockingStub stub = CommunicationGrpc.newBlockingStub(channel);
        ClientRequest request = ClientRequest.newBuilder().setClientMessage("111").build();
        ServerResponse response = stub.comu(request);
        System.out.println(response.getServerMessage());
    }

    public static void sendMessage(String message) {
        System.out.println("send message:"+message);
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 40000)
                .usePlaintext()
                .build();
        CommunicationGrpc.CommunicationBlockingStub stub = CommunicationGrpc.newBlockingStub(channel);
        try {
            ClientRequest request = ClientRequest.newBuilder().setClientMessage(message).build();
            ServerResponse response = stub.comu(request);
            System.out.println(response.getServerMessage());
        } catch (Exception e) {

        } finally {
            channel.shutdown();
        }

    }
}