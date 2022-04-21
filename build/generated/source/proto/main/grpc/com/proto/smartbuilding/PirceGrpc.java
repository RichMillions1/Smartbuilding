package com.proto.smartbuilding;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.1)",
    comments = "Source: smartbuilding/smartbuilding.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PirceGrpc {

  private PirceGrpc() {}

  public static final String SERVICE_NAME = "smartbuilding.Pirce";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.smartbuilding.PriceRequest,
      com.proto.smartbuilding.PriceResponse> getStockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "stock",
      requestType = com.proto.smartbuilding.PriceRequest.class,
      responseType = com.proto.smartbuilding.PriceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.smartbuilding.PriceRequest,
      com.proto.smartbuilding.PriceResponse> getStockMethod() {
    io.grpc.MethodDescriptor<com.proto.smartbuilding.PriceRequest, com.proto.smartbuilding.PriceResponse> getStockMethod;
    if ((getStockMethod = PirceGrpc.getStockMethod) == null) {
      synchronized (PirceGrpc.class) {
        if ((getStockMethod = PirceGrpc.getStockMethod) == null) {
          PirceGrpc.getStockMethod = getStockMethod =
              io.grpc.MethodDescriptor.<com.proto.smartbuilding.PriceRequest, com.proto.smartbuilding.PriceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "stock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.smartbuilding.PriceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.smartbuilding.PriceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PirceMethodDescriptorSupplier("stock"))
              .build();
        }
      }
    }
    return getStockMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PirceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PirceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PirceStub>() {
        @java.lang.Override
        public PirceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PirceStub(channel, callOptions);
        }
      };
    return PirceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PirceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PirceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PirceBlockingStub>() {
        @java.lang.Override
        public PirceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PirceBlockingStub(channel, callOptions);
        }
      };
    return PirceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PirceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PirceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PirceFutureStub>() {
        @java.lang.Override
        public PirceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PirceFutureStub(channel, callOptions);
        }
      };
    return PirceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PirceImplBase implements io.grpc.BindableService {

    /**
     */
    public void stock(com.proto.smartbuilding.PriceRequest request,
        io.grpc.stub.StreamObserver<com.proto.smartbuilding.PriceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStockMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStockMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.proto.smartbuilding.PriceRequest,
                com.proto.smartbuilding.PriceResponse>(
                  this, METHODID_STOCK)))
          .build();
    }
  }

  /**
   */
  public static final class PirceStub extends io.grpc.stub.AbstractAsyncStub<PirceStub> {
    private PirceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PirceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PirceStub(channel, callOptions);
    }

    /**
     */
    public void stock(com.proto.smartbuilding.PriceRequest request,
        io.grpc.stub.StreamObserver<com.proto.smartbuilding.PriceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStockMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PirceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PirceBlockingStub> {
    private PirceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PirceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PirceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.proto.smartbuilding.PriceResponse> stock(
        com.proto.smartbuilding.PriceRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStockMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PirceFutureStub extends io.grpc.stub.AbstractFutureStub<PirceFutureStub> {
    private PirceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PirceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PirceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_STOCK = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PirceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PirceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STOCK:
          serviceImpl.stock((com.proto.smartbuilding.PriceRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.smartbuilding.PriceResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PirceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PirceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.smartbuilding.Smartbuilding.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Pirce");
    }
  }

  private static final class PirceFileDescriptorSupplier
      extends PirceBaseDescriptorSupplier {
    PirceFileDescriptorSupplier() {}
  }

  private static final class PirceMethodDescriptorSupplier
      extends PirceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PirceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PirceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PirceFileDescriptorSupplier())
              .addMethod(getStockMethod())
              .build();
        }
      }
    }
    return result;
  }
}
