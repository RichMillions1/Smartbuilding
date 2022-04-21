package com.proto.smartbuilding;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.1)",
    comments = "Source: smartbuilding/smartbuilding.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CalculationGrpc {

  private CalculationGrpc() {}

  public static final String SERVICE_NAME = "smartbuilding.Calculation";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.smartbuilding.ProfitRequest,
      com.proto.smartbuilding.ProfitResponse> getProfitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "profit",
      requestType = com.proto.smartbuilding.ProfitRequest.class,
      responseType = com.proto.smartbuilding.ProfitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.smartbuilding.ProfitRequest,
      com.proto.smartbuilding.ProfitResponse> getProfitMethod() {
    io.grpc.MethodDescriptor<com.proto.smartbuilding.ProfitRequest, com.proto.smartbuilding.ProfitResponse> getProfitMethod;
    if ((getProfitMethod = CalculationGrpc.getProfitMethod) == null) {
      synchronized (CalculationGrpc.class) {
        if ((getProfitMethod = CalculationGrpc.getProfitMethod) == null) {
          CalculationGrpc.getProfitMethod = getProfitMethod =
              io.grpc.MethodDescriptor.<com.proto.smartbuilding.ProfitRequest, com.proto.smartbuilding.ProfitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "profit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.smartbuilding.ProfitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.smartbuilding.ProfitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculationMethodDescriptorSupplier("profit"))
              .build();
        }
      }
    }
    return getProfitMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CalculationStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculationStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculationStub>() {
        @java.lang.Override
        public CalculationStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculationStub(channel, callOptions);
        }
      };
    return CalculationStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CalculationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculationBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculationBlockingStub>() {
        @java.lang.Override
        public CalculationBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculationBlockingStub(channel, callOptions);
        }
      };
    return CalculationBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CalculationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculationFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculationFutureStub>() {
        @java.lang.Override
        public CalculationFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculationFutureStub(channel, callOptions);
        }
      };
    return CalculationFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CalculationImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.smartbuilding.ProfitRequest> profit(
        io.grpc.stub.StreamObserver<com.proto.smartbuilding.ProfitResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getProfitMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getProfitMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.proto.smartbuilding.ProfitRequest,
                com.proto.smartbuilding.ProfitResponse>(
                  this, METHODID_PROFIT)))
          .build();
    }
  }

  /**
   */
  public static final class CalculationStub extends io.grpc.stub.AbstractAsyncStub<CalculationStub> {
    private CalculationStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculationStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculationStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.smartbuilding.ProfitRequest> profit(
        io.grpc.stub.StreamObserver<com.proto.smartbuilding.ProfitResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getProfitMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class CalculationBlockingStub extends io.grpc.stub.AbstractBlockingStub<CalculationBlockingStub> {
    private CalculationBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculationBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculationBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class CalculationFutureStub extends io.grpc.stub.AbstractFutureStub<CalculationFutureStub> {
    private CalculationFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculationFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculationFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_PROFIT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CalculationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CalculationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PROFIT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.profit(
              (io.grpc.stub.StreamObserver<com.proto.smartbuilding.ProfitResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CalculationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CalculationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.smartbuilding.Smartbuilding.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Calculation");
    }
  }

  private static final class CalculationFileDescriptorSupplier
      extends CalculationBaseDescriptorSupplier {
    CalculationFileDescriptorSupplier() {}
  }

  private static final class CalculationMethodDescriptorSupplier
      extends CalculationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CalculationMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CalculationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CalculationFileDescriptorSupplier())
              .addMethod(getProfitMethod())
              .build();
        }
      }
    }
    return result;
  }
}
