package com.proto.smartbuilding;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.1)",
    comments = "Source: smartbuilding/smartbuilding.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserLoginServiceGrpc {

  private UserLoginServiceGrpc() {}

  public static final String SERVICE_NAME = "smartbuilding.UserLoginService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.smartbuilding.LoginRequest,
      com.proto.smartbuilding.LoginResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = com.proto.smartbuilding.LoginRequest.class,
      responseType = com.proto.smartbuilding.LoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.smartbuilding.LoginRequest,
      com.proto.smartbuilding.LoginResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<com.proto.smartbuilding.LoginRequest, com.proto.smartbuilding.LoginResponse> getLoginMethod;
    if ((getLoginMethod = UserLoginServiceGrpc.getLoginMethod) == null) {
      synchronized (UserLoginServiceGrpc.class) {
        if ((getLoginMethod = UserLoginServiceGrpc.getLoginMethod) == null) {
          UserLoginServiceGrpc.getLoginMethod = getLoginMethod =
              io.grpc.MethodDescriptor.<com.proto.smartbuilding.LoginRequest, com.proto.smartbuilding.LoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.smartbuilding.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.smartbuilding.LoginResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserLoginServiceMethodDescriptorSupplier("login"))
              .build();
        }
      }
    }
    return getLoginMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserLoginServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserLoginServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserLoginServiceStub>() {
        @java.lang.Override
        public UserLoginServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserLoginServiceStub(channel, callOptions);
        }
      };
    return UserLoginServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserLoginServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserLoginServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserLoginServiceBlockingStub>() {
        @java.lang.Override
        public UserLoginServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserLoginServiceBlockingStub(channel, callOptions);
        }
      };
    return UserLoginServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserLoginServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserLoginServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserLoginServiceFutureStub>() {
        @java.lang.Override
        public UserLoginServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserLoginServiceFutureStub(channel, callOptions);
        }
      };
    return UserLoginServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UserLoginServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.smartbuilding.LoginRequest> login(
        io.grpc.stub.StreamObserver<com.proto.smartbuilding.LoginResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getLoginMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoginMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.proto.smartbuilding.LoginRequest,
                com.proto.smartbuilding.LoginResponse>(
                  this, METHODID_LOGIN)))
          .build();
    }
  }

  /**
   */
  public static final class UserLoginServiceStub extends io.grpc.stub.AbstractAsyncStub<UserLoginServiceStub> {
    private UserLoginServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserLoginServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserLoginServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.smartbuilding.LoginRequest> login(
        io.grpc.stub.StreamObserver<com.proto.smartbuilding.LoginResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class UserLoginServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserLoginServiceBlockingStub> {
    private UserLoginServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserLoginServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserLoginServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class UserLoginServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UserLoginServiceFutureStub> {
    private UserLoginServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserLoginServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserLoginServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_LOGIN = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserLoginServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserLoginServiceImplBase serviceImpl, int methodId) {
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
        case METHODID_LOGIN:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.login(
              (io.grpc.stub.StreamObserver<com.proto.smartbuilding.LoginResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UserLoginServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserLoginServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.smartbuilding.Smartbuilding.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserLoginService");
    }
  }

  private static final class UserLoginServiceFileDescriptorSupplier
      extends UserLoginServiceBaseDescriptorSupplier {
    UserLoginServiceFileDescriptorSupplier() {}
  }

  private static final class UserLoginServiceMethodDescriptorSupplier
      extends UserLoginServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserLoginServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserLoginServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserLoginServiceFileDescriptorSupplier())
              .addMethod(getLoginMethod())
              .build();
        }
      }
    }
    return result;
  }
}
