package client;

import com.proto.smartbuilding.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Iterator;
import java.util.Scanner;

public class CalculationClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50060).usePlaintext().build();
        CalculationGrpc.CalculationStub calculationStub = CalculationGrpc.newStub(channel);
        StreamObserver<ProfitResponse> responseObserver = new StreamObserver<ProfitResponse>() {
            @Override
            public void onNext(ProfitResponse profitResponse) {
                System.out.println("return:" + profitResponse.getProfitOfStock());
            }
            @Override
            public void onError(Throwable throwable) {
            }
            @Override
            public void onCompleted() {
            }
        };
        Scanner sc = new Scanner(System.in);
        StreamObserver<ProfitRequest> result = calculationStub.profit(responseObserver);
        try {
            for(;;){
                System.out.println("Please enter value: ");
                String price = sc.next();
                ProfitRequest request = ProfitRequest.newBuilder().setCostOfStock(Integer.parseInt(price)).build();
                result.onNext(request);
                Thread.sleep(1000);
            }
//            result.onCompleted();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static String getCalculation(String input){
        final String[] returnVal = {"service is not available"};
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50060).usePlaintext().build();
        CalculationGrpc.CalculationStub calculationStub = CalculationGrpc.newStub(channel);
        StreamObserver<ProfitResponse> responseObserver = new StreamObserver<ProfitResponse>() {
            @Override
            public void onNext(ProfitResponse profitResponse) {
                returnVal[0] = String.valueOf(profitResponse.getProfitOfStock());
            }
            @Override
            public void onError(Throwable throwable) {
            }
            @Override
            public void onCompleted() {
            }
        };
        StreamObserver<ProfitRequest> result = calculationStub.profit(responseObserver);
        try {
            ProfitRequest request = ProfitRequest.newBuilder().setCostOfStock(Integer.parseInt(input)).build();
            result.onNext(request);
            Thread.sleep(2000);
            result.onCompleted();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            channel.shutdown();
        }
        return returnVal[0];
    }
}
