package client;

import com.proto.smartbuilding.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class PriceClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Stock code: ");
        String price = sc.next();
        PriceRequest request = PriceRequest.newBuilder().setStockNumber(Integer.parseInt(price)).build();

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50059).usePlaintext().build();
        PirceGrpc.PirceBlockingStub priceStub = PirceGrpc.newBlockingStub(channel);
        Iterator<PriceResponse> result = priceStub.stock(request);
        result.forEachRemaining(o->{
            System.out.println(o.getStockPrice());
        });
        System.out.println("end");
    }

    public static String getPrice(String price){
        AtomicReference<String> returnVal = new AtomicReference<>("service is not available");
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50059).usePlaintext().build();
        PirceGrpc.PirceBlockingStub priceStub = PirceGrpc.newBlockingStub(channel);
        try {
            PriceRequest request = PriceRequest.newBuilder().setStockNumber(Integer.parseInt(price)).build();
            Iterator<PriceResponse> result = priceStub.stock(request);
            result.forEachRemaining(o->{
                returnVal.set(String.valueOf(o.getStockPrice()));
            });
        }catch (Exception e){
                e.printStackTrace();
        }finally {
            channel.shutdown();
        }
        return returnVal.get();
    }
}
