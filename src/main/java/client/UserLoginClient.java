package client;

import com.proto.smartbuilding.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Scanner;

public class UserLoginClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50056).usePlaintext().build();
        UserLoginServiceGrpc.UserLoginServiceStub userStub = UserLoginServiceGrpc.newStub(channel);

        final boolean[] check = {false};
        StreamObserver<LoginResponse> responseObserver = new StreamObserver<LoginResponse>() {
            @Override
            public void onNext(LoginResponse loginResponse) {
                System.out.println("return:" + loginResponse.getLoginResults());
                 check[0] = loginResponse.getLoginResults() ;
            }
            @Override
            public void onError(Throwable throwable) {
            }
            @Override
            public void onCompleted() {
            }
        };
        Scanner sc = new Scanner(System.in);
        StreamObserver<LoginRequest> result = userStub.login(responseObserver);
        try {
            for(;;){
                System.out.println("Please enter your username: ");
                String username = sc.next();
                System.out.println("Please enter your password: ");
                String password = sc.next();
                LoginRequest request = LoginRequest.newBuilder().setUsername(username).setPassword(password).build();
                result.onNext(request);
                Thread.sleep(1000);
                if(check[0]){
                    break;
                }
            }
            result.onCompleted();
            channel.shutdown();
        }catch (Exception e){

        }
    }

    public static boolean checkUser(String username, String password){
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50056).usePlaintext().build();
        UserLoginServiceGrpc.UserLoginServiceStub userStub = UserLoginServiceGrpc.newStub(channel);

        final boolean[] check = {false};
        StreamObserver<LoginResponse> responseObserver = new StreamObserver<LoginResponse>() {
            @Override
            public void onNext(LoginResponse loginResponse) {
                System.out.println("return:" + loginResponse.getLoginResults());
                check[0] = loginResponse.getLoginResults() ;
            }
            @Override
            public void onError(Throwable throwable) {
            }
            @Override
            public void onCompleted() {
            }
        };
        LoginRequest request = LoginRequest.newBuilder().setUsername(username).setPassword(password).build();
        StreamObserver<LoginRequest> result = userStub.login(responseObserver);
        try {
            result.onNext(request);
            Thread.sleep(1000);
            result.onCompleted();
        }catch (Exception e){
        }finally {
            channel.shutdown();
        }
        return check[0];
    }
}
