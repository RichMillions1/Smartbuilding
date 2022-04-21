package server;

import com.proto.smartbuilding.ClockResponse;
import com.proto.smartbuilding.TurnOn;
import com.proto.smartbuilding.WelcomeResponse;
import com.proto.smartbuilding.WelcomeServiceGrpc;
import io.grpc.Metadata;
import io.grpc.stub.StreamObserver;

import java.text.SimpleDateFormat;
import java.util.Date;

public class WelcomeServerImpl extends WelcomeServiceGrpc.WelcomeServiceImplBase{

    @Override
    public void welcomePage(TurnOn turnOn, StreamObserver<WelcomeResponse> responseObserver){
        System.out.println("welcome page");
        WelcomeResponse.Builder response = WelcomeResponse.newBuilder();
        response.setGreetMessage("Welcome to smart building system");
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();


    }

    @Override
    public void time(TurnOn turnOn, StreamObserver<ClockResponse> responseObserver1){
        ClockResponse.Builder response1 = ClockResponse.newBuilder();
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        response1.setTime("The time is: " + dateString);

        responseObserver1.onNext(response1.build());
        responseObserver1.onCompleted();

    }
}
