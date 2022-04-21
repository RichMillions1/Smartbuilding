package server;


import com.proto.smartbuilding.UserInforGrpc;
import com.proto.smartbuilding.UserInforRequest;
import com.proto.smartbuilding.UserInforResponse;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;

public class UserInforServiceImpl extends UserInforGrpc.UserInforImplBase{

    @Override
    public StreamObserver<UserInforRequest> userInformation(StreamObserver<UserInforResponse> responseObserver){
        return new StreamObserver<UserInforRequest>() {
            List<String> list = new ArrayList<>();
            @Override
            public void onNext(UserInforRequest request) {
                System.out.println(request.getLastNamePhone());
                list.add(request.getLastNamePhone());

            }
            @Override
            public void onError(Throwable t) {
                responseObserver.onError(t);
            }

            @Override
            public void onCompleted() {
                UserInforResponse response = UserInforResponse.newBuilder().setUploadResults("Upload successfully" + list.size()).build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
        };
    }
}
