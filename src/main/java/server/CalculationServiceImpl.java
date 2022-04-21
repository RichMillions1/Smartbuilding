package server;


import com.proto.smartbuilding.*;
import io.grpc.stub.StreamObserver;

import java.util.Random;

public class CalculationServiceImpl extends CalculationGrpc.CalculationImplBase {
    @Override
    public StreamObserver<ProfitRequest> profit(StreamObserver<ProfitResponse> responseObserver) {
        return new StreamObserver<ProfitRequest>() {

            @Override
            public void onNext(ProfitRequest request) {
                int requestVal = request.getCostOfStock();
                int randomVal = new Random().nextInt(10) + 1;
                int responseVal = requestVal + randomVal;
                System.out.println(String.format("request:%s, response:%s", requestVal, responseVal));
                ProfitResponse result = ProfitResponse.newBuilder().setProfitOfStock(responseVal).build();
                responseObserver.onNext(result);
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}
