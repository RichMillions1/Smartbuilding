package server;


import com.proto.smartbuilding.PirceGrpc;
import com.proto.smartbuilding.PriceRequest;
import com.proto.smartbuilding.PriceResponse;
import io.grpc.stub.StreamObserver;

import java.util.Random;

public class PriceServiceImpl extends PirceGrpc.PirceImplBase{

    @Override
    public void stock(PriceRequest  priceRequest,StreamObserver<PriceResponse> responseObserver){
//        int price = new Random().nextInt(10) + 1;
//        PriceResponse result = PriceResponse.newBuilder().setStockPrice(price).build();

        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            int price = new Random().nextInt(10) + 1;
            PriceResponse result = PriceResponse.newBuilder().setStockPrice(price).build();
            responseObserver.onNext(result);
        }




////        responseObserver.onNext(result);
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        responseObserver.onNext(result);
        responseObserver.onCompleted();
    }
}
