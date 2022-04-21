package client;

import com.proto.smartbuilding.ClockResponse;
import com.proto.smartbuilding.TurnOn;
import com.proto.smartbuilding.WelcomeResponse;
import com.proto.smartbuilding.WelcomeServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.time.Clock;
import java.util.concurrent.TimeUnit;

public class WelcomeClient {

    public static void main(String[] args) {
        System.out.println(getWelcomeMessage());
    }

    public static String getWelcomeMessage() {
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 50055)
                .usePlaintext()
                .build();

        WelcomeServiceGrpc.WelcomeServiceBlockingStub userStub = WelcomeServiceGrpc.newBlockingStub(channel);
        try {
            TurnOn turnOn = TurnOn.newBuilder().setFirstName("Turn on").build();
            WelcomeResponse response = userStub.withDeadlineAfter(20, TimeUnit.SECONDS).welcomePage(turnOn);
            ClockResponse response1 = userStub.time(turnOn);
            return response.getGreetMessage() + "\n" + response1.getTime();
        } catch (Exception e) {
            return "service is not available";
        }finally {
            channel.shutdown();
        }
    }
}
