package server;

import com.proto.smartbuilding.LoginRequest;
import com.proto.smartbuilding.LoginResponse;
import com.proto.smartbuilding.UserLoginServiceGrpc;
import io.grpc.stub.StreamObserver;

import java.util.Scanner;

public class UserLoginServiceImpl extends UserLoginServiceGrpc.UserLoginServiceImplBase {

    @Override
    public StreamObserver<LoginRequest> login(StreamObserver<LoginResponse> responseObserver){
        return new StreamObserver<LoginRequest>() {
            @Override
            public void onNext(LoginRequest request) {
                System.out.println(String.format("username:%s, password:%s", request.getUsername(), request.getPassword()));
                String username = request.getUsername();
                String password = request.getPassword();
                    if(username.equals("Rich") && password.equals("123")){
                        responseObserver.onNext(LoginResponse.newBuilder()
                                .setLoginResults(true)
                                .build());
                        responseObserver.onCompleted();

                    }else{
                        responseObserver.onNext(LoginResponse.newBuilder()
                                .setLoginResults(false)
                                .build());

                    }
            }

            @Override
            public void onError(Throwable t) {
                responseObserver.onError(t);
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}
