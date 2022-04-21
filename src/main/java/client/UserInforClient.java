package client;

import com.proto.smartbuilding.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.checkerframework.checker.units.qual.A;

import java.util.Scanner;

public class UserInforClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50058).usePlaintext().build();
        UserInforGrpc.UserInforStub userInforStub = UserInforGrpc.newStub(channel);

        StreamObserver<UserInforResponse> responseObserver = new StreamObserver<UserInforResponse>() {
            @Override
            public void onNext(UserInforResponse value) {
                System.out.println(value);
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
            }
        };
        Scanner sc = new Scanner(System.in);
        StreamObserver<UserInforRequest> result = userInforStub.userInformation(responseObserver);
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter your phone: ");
            String phone = sc.next();
            UserInforRequest request = UserInforRequest.newBuilder().setLastNamePhone(phone).build();
            result.onNext(request);
        }
        result.onCompleted();
        try {
            Thread.sleep(10000);
        } catch (Exception ex) {
        }
    }

    public static String uploadPhone(String phone) {
        final String[] message = {"upload error"};
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50058).usePlaintext().build();
        UserInforGrpc.UserInforStub userInforStub = UserInforGrpc.newStub(channel);
        StreamObserver<UserInforResponse> responseObserver = new StreamObserver<UserInforResponse>() {
            @Override
            public void onNext(UserInforResponse value) {
                message[0] = "upload success";
                System.out.println("success");
            }
            @Override
            public void onError(Throwable t) {
                message[0] = "upload error";
                System.out.println("error");
            }

            @Override
            public void onCompleted() {
            }
        };
        try {
            StreamObserver<UserInforRequest> result = userInforStub.userInformation(responseObserver);
            UserInforRequest request = UserInforRequest.newBuilder().setLastNamePhone(phone).build();
            result.onNext(request);
            result.onCompleted();
            Thread.sleep(3000);
            return message[0];
        } catch (Exception ex) {
            return "upload error";
        }finally {
            channel.shutdown();
        }
    }

}
