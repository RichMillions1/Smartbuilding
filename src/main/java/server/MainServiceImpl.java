package server;

import com.proto.smartbuilding.MainServiceGrpc;
import com.proto.smartbuilding.MenuRequest;
import com.proto.smartbuilding.MenuResponse;
import io.grpc.Metadata;
import io.grpc.protobuf.ProtoUtils;
import io.grpc.stub.StreamObserver;

public class MainServiceImpl extends MainServiceGrpc.MainServiceImplBase {

    @Override
    public void mainMenu(MenuRequest menuRequest, StreamObserver<MenuResponse> responseObserver){

        MenuResponse.Builder response = MenuResponse.newBuilder();

        String menu = menuRequest.getMenu();
        if(menu.equals("menu")){
            response.setMenuResults("1. Upload the information;" + "\n" + "2. Get the Rich’s stock price;" + "\n" + "3. Calculate profit.");
            responseObserver.onNext(response.build());
            responseObserver.onCompleted();
        }else{
            Metadata.Key<String> errorResponseKey = Metadata.Key.of("response", Metadata.ASCII_STRING_MARSHALLER) ;
            Metadata metadata = new Metadata();
            metadata.put(errorResponseKey, "error input");
            responseObserver.onError(io.grpc.Status.INVALID_ARGUMENT.withDescription("The commodity is not supported")
                    .asRuntimeException(metadata));
        }

    }
}
