package com.proto.smartbuilding;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.1)",
    comments = "Source: smartbuilding/smartbuilding.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WelcomeServiceGrpc {

  private WelcomeServiceGrpc() {}

  public static final String SERVICE_NAME = "smartbuilding.WelcomeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.smartbuilding.TurnOn,
      com.proto.smartbuilding.WelcomeResponse> getWelcomePageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "welcomePage",
      requestType = com.proto.smartbuilding.TurnOn.class,
      responseType = com.proto.smartbuilding.WelcomeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.smartbuilding.TurnOn,
      com.proto.smartbuilding.WelcomeResponse> getWelcomePageMethod() {
    io.grpc.MethodDescriptor<com.proto.smartbuilding.TurnOn, com.proto.smartbuilding.WelcomeResponse> getWelcomePageMethod;
    if ((getWelcomePageMethod = WelcomeServiceGrpc.getWelcomePageMethod) == null) {
      synchronized (WelcomeServiceGrpc.class) {
        if ((getWelcomePageMethod = WelcomeServiceGrpc.getWelcomePageMethod) == null) {
          WelcomeServiceGrpc.getWelcomePageMethod = getWelcomePageMethod =
              io.grpc.MethodDescriptor.<com.proto.smartbuilding.TurnOn, com.proto.smartbuilding.WelcomeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "welcomePage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.smartbuilding.TurnOn.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.smartbuilding.WelcomeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WelcomeServiceMethodDescriptorSupplier("welcomePage"))
              .build();
        }
      }
    }
    return getWelcomePageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.smartbuilding.TurnOn,
      com.proto.smartbuilding.ClockResponse> getTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "time",
      requestType = com.proto.smartbuilding.TurnOn.class,
      responseType = com.proto.smartbuilding.ClockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.smartbuilding.TurnOn,
      com.proto.smartbuilding.ClockResponse> getTimeMethod() {
    io.grpc.MethodDescriptor<com.proto.smartbuilding.TurnOn, com.proto.smartbuilding.ClockResponse> getTimeMethod;
    if ((getTimeMethod = WelcomeServiceGrpc.getTimeMethod) == null) {
      synchronized (WelcomeServiceGrpc.class) {
        if ((getTimeMethod = WelcomeServiceGrpc.getTimeMethod) == null) {
          WelcomeServiceGrpc.getTimeMethod = getTimeMethod =
              io.grpc.MethodDescriptor.<com.proto.smartbuilding.TurnOn, com.proto.smartbuilding.ClockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "time"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.smartbuilding.TurnOn.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.smartbuilding.ClockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WelcomeServiceMethodDescriptorSupplier("time"))
              .build();
        }
      }
    }
    return getTimeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WelcomeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WelcomeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WelcomeServiceStub>() {
        @java.lang.Override
        public WelcomeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WelcomeServiceStub(channel, callOptions);
        }
      };
    return WelcomeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WelcomeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WelcomeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WelcomeServiceBlockingStub>() {
        @java.lang.Override
        public WelcomeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WelcomeServiceBlockingStub(channel, callOptions);
        }
      };
    return WelcomeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WelcomeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WelcomeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WelcomeServiceFutureStub>() {
        @java.lang.Override
        public WelcomeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WelcomeServiceFutureStub(channel, callOptions);
        }
      };
    return WelcomeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class WelcomeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void welcomePage(com.proto.smartbuilding.TurnOn request,
        io.grpc.stub.StreamObserver<com.proto.smartbuilding.WelcomeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWelcomePageMethod(), responseObserver);
    }

    /**
     */
    public void time(com.proto.smartbuilding.TurnOn request,
        io.grpc.stub.StreamObserver<com.proto.smartbuilding.ClockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTimeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getWelcomePageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.smartbuilding.TurnOn,
                com.proto.smartbuilding.WelcomeResponse>(
                  this, METHODID_WELCOME_PAGE)))
          .addMethod(
            getTimeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.smartbuilding.TurnOn,
                com.proto.smartbuilding.ClockResponse>(
                  this, METHODID_TIME)))
          .build();
    }
  }

  /**
   */
  public static final class WelcomeServiceStub extends io.grpc.stub.AbstractAsyncStub<WelcomeServiceStub> {
    private WelcomeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WelcomeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WelcomeServiceStub(channel, callOptions);
    }

    /**
     */
    public void welcomePage(com.proto.smartbuilding.TurnOn request,
        io.grpc.stub.StreamObserver<com.proto.smartbuilding.WelcomeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWelcomePageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void time(com.proto.smartbuilding.TurnOn request,
        io.grpc.stub.StreamObserver<com.proto.smartbuilding.ClockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTimeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class WelcomeServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<WelcomeServiceBlockingStub> {
    private WelcomeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WelcomeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WelcomeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.smartbuilding.WelcomeResponse welcomePage(com.proto.smartbuilding.TurnOn request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWelcomePageMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.smartbuilding.ClockResponse time(com.proto.smartbuilding.TurnOn request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTimeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class WelcomeServiceFutureStub extends io.grpc.stub.AbstractFutureStub<WelcomeServiceFutureStub> {
    private WelcomeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WelcomeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WelcomeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.smartbuilding.WelcomeResponse> welcomePage(
        com.proto.smartbuilding.TurnOn request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWelcomePageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.smartbuilding.ClockResponse> time(
        com.proto.smartbuilding.TurnOn request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTimeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_WELCOME_PAGE = 0;
  private static final int METHODID_TIME = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WelcomeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WelcomeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_WELCOME_PAGE:
          serviceImpl.welcomePage((com.proto.smartbuilding.TurnOn) request,
              (io.grpc.stub.StreamObserver<com.proto.smartbuilding.WelcomeResponse>) responseObserver);
          break;
        case METHODID_TIME:
          serviceImpl.time((com.proto.smartbuilding.TurnOn) request,
              (io.grpc.stub.StreamObserver<com.proto.smartbuilding.ClockResponse>) responseObserver);
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

  private static abstract class WelcomeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WelcomeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.smartbuilding.Smartbuilding.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WelcomeService");
    }
  }

  private static final class WelcomeServiceFileDescriptorSupplier
      extends WelcomeServiceBaseDescriptorSupplier {
    WelcomeServiceFileDescriptorSupplier() {}
  }

  private static final class WelcomeServiceMethodDescriptorSupplier
      extends WelcomeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WelcomeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (WelcomeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WelcomeServiceFileDescriptorSupplier())
              .addMethod(getWelcomePageMethod())
              .addMethod(getTimeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
