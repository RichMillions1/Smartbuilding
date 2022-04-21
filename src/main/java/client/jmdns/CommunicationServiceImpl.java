package client.jmdns;

import client.gui.SmartUi;
import com.proto.smartbuilding.*;
import io.grpc.stub.StreamObserver;

public class CommunicationServiceImpl extends CommunicationGrpc.CommunicationImplBase {

    @Override
    public void comu(ClientRequest clientRequest, StreamObserver<ServerResponse> responseObserver){
        ServerResponse.Builder response = ServerResponse.newBuilder();
        String message = clientRequest.getClientMessage();
        System.out.println("request----"+message);
        SmartUi.JMDNS_MESSAGE = message;
        response.setServerMessage("success");
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}
