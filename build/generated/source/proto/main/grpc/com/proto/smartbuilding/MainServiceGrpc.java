package com.proto.smartbuilding;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.1)",
    comments = "Source: smartbuilding/smartbuilding.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MainServiceGrpc {

  private MainServiceGrpc() {}

  public static final String SERVICE_NAME = "smartbuilding.MainService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.smartbuilding.MenuRequest,
      com.proto.smartbuilding.MenuResponse> getMainMenuMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "mainMenu",
      requestType = com.proto.smartbuilding.MenuRequest.class,
      responseType = com.proto.smartbuilding.MenuResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.smartbuilding.MenuRequest,
      com.proto.smartbuilding.MenuResponse> getMainMenuMethod() {
    io.grpc.MethodDescriptor<com.proto.smartbuilding.MenuRequest, com.proto.smartbuilding.MenuResponse> getMainMenuMethod;
    if ((getMainMenuMethod = MainServiceGrpc.getMainMenuMethod) == null) {
      synchronized (MainServiceGrpc.class) {
        if ((getMainMenuMethod = MainServiceGrpc.getMainMenuMethod) == null) {
          MainServiceGrpc.getMainMenuMethod = getMainMenuMethod =
              io.grpc.MethodDescriptor.<com.proto.smartbuilding.MenuRequest, com.proto.smartbuilding.MenuResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "mainMenu"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.smartbuilding.MenuRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.smartbuilding.MenuResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MainServiceMethodDescriptorSupplier("mainMenu"))
              .build();
        }
      }
    }
    return getMainMenuMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MainServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MainServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MainServiceStub>() {
        @java.lang.Override
        public MainServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MainServiceStub(channel, callOptions);
        }
      };
    return MainServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MainServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MainServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MainServiceBlockingStub>() {
        @java.lang.Override
        public MainServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MainServiceBlockingStub(channel, callOptions);
        }
      };
    return MainServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MainServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MainServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MainServiceFutureStub>() {
        @java.lang.Override
        public MainServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MainServiceFutureStub(channel, callOptions);
        }
      };
    return MainServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class MainServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void mainMenu(com.proto.smartbuilding.MenuRequest request,
        io.grpc.stub.StreamObserver<com.proto.smartbuilding.MenuResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMainMenuMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMainMenuMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.smartbuilding.MenuRequest,
                com.proto.smartbuilding.MenuResponse>(
                  this, METHODID_MAIN_MENU)))
          .build();
    }
  }

  /**
   */
  public static final class MainServiceStub extends io.grpc.stub.AbstractAsyncStub<MainServiceStub> {
    private MainServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MainServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MainServiceStub(channel, callOptions);
    }

    /**
     */
    public void mainMenu(com.proto.smartbuilding.MenuRequest request,
        io.grpc.stub.StreamObserver<com.proto.smartbuilding.MenuResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMainMenuMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MainServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MainServiceBlockingStub> {
    private MainServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MainServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MainServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.smartbuilding.MenuResponse mainMenu(com.proto.smartbuilding.MenuRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMainMenuMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MainServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MainServiceFutureStub> {
    private MainServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MainServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MainServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.smartbuilding.MenuResponse> mainMenu(
        com.proto.smartbuilding.MenuRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMainMenuMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MAIN_MENU = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MainServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MainServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MAIN_MENU:
          serviceImpl.mainMenu((com.proto.smartbuilding.MenuRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.smartbuilding.MenuResponse>) responseObserver);
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

  private static abstract class MainServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MainServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.smartbuilding.Smartbuilding.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MainService");
    }
  }

  private static final class MainServiceFileDescriptorSupplier
      extends MainServiceBaseDescriptorSupplier {
    MainServiceFileDescriptorSupplier() {}
  }

  private static final class MainServiceMethodDescriptorSupplier
      extends MainServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MainServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MainServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MainServiceFileDescriptorSupplier())
              .addMethod(getMainMenuMethod())
              .build();
        }
      }
    }
    return result;
  }
}
