package com.proto.smartbuilding;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.1)",
    comments = "Source: smartbuilding/smartbuilding.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CommunicationGrpc {

  private CommunicationGrpc() {}

  public static final String SERVICE_NAME = "smartbuilding.Communication";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.smartbuilding.ClientRequest,
      com.proto.smartbuilding.ServerResponse> getComuMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "comu",
      requestType = com.proto.smartbuilding.ClientRequest.class,
      responseType = com.proto.smartbuilding.ServerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.smartbuilding.ClientRequest,
      com.proto.smartbuilding.ServerResponse> getComuMethod() {
    io.grpc.MethodDescriptor<com.proto.smartbuilding.ClientRequest, com.proto.smartbuilding.ServerResponse> getComuMethod;
    if ((getComuMethod = CommunicationGrpc.getComuMethod) == null) {
      synchronized (CommunicationGrpc.class) {
        if ((getComuMethod = CommunicationGrpc.getComuMethod) == null) {
          CommunicationGrpc.getComuMethod = getComuMethod =
              io.grpc.MethodDescriptor.<com.proto.smartbuilding.ClientRequest, com.proto.smartbuilding.ServerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "comu"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.smartbuilding.ClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.smartbuilding.ServerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CommunicationMethodDescriptorSupplier("comu"))
              .build();
        }
      }
    }
    return getComuMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CommunicationStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommunicationStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommunicationStub>() {
        @java.lang.Override
        public CommunicationStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommunicationStub(channel, callOptions);
        }
      };
    return CommunicationStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CommunicationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommunicationBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommunicationBlockingStub>() {
        @java.lang.Override
        public CommunicationBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommunicationBlockingStub(channel, callOptions);
        }
      };
    return CommunicationBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CommunicationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommunicationFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommunicationFutureStub>() {
        @java.lang.Override
        public CommunicationFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommunicationFutureStub(channel, callOptions);
        }
      };
    return CommunicationFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CommunicationImplBase implements io.grpc.BindableService {

    /**
     */
    public void comu(com.proto.smartbuilding.ClientRequest request,
        io.grpc.stub.StreamObserver<com.proto.smartbuilding.ServerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getComuMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getComuMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.smartbuilding.ClientRequest,
                com.proto.smartbuilding.ServerResponse>(
                  this, METHODID_COMU)))
          .build();
    }
  }

  /**
   */
  public static final class CommunicationStub extends io.grpc.stub.AbstractAsyncStub<CommunicationStub> {
    private CommunicationStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommunicationStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommunicationStub(channel, callOptions);
    }

    /**
     */
    public void comu(com.proto.smartbuilding.ClientRequest request,
        io.grpc.stub.StreamObserver<com.proto.smartbuilding.ServerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getComuMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CommunicationBlockingStub extends io.grpc.stub.AbstractBlockingStub<CommunicationBlockingStub> {
    private CommunicationBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommunicationBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommunicationBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.smartbuilding.ServerResponse comu(com.proto.smartbuilding.ClientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getComuMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CommunicationFutureStub extends io.grpc.stub.AbstractFutureStub<CommunicationFutureStub> {
    private CommunicationFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommunicationFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommunicationFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.smartbuilding.ServerResponse> comu(
        com.proto.smartbuilding.ClientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getComuMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_COMU = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CommunicationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CommunicationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COMU:
          serviceImpl.comu((com.proto.smartbuilding.ClientRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.smartbuilding.ServerResponse>) responseObserver);
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

  private static abstract class CommunicationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CommunicationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.smartbuilding.Smartbuilding.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Communication");
    }
  }

  private static final class CommunicationFileDescriptorSupplier
      extends CommunicationBaseDescriptorSupplier {
    CommunicationFileDescriptorSupplier() {}
  }

  private static final class CommunicationMethodDescriptorSupplier
      extends CommunicationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CommunicationMethodDescriptorSupplier(String methodName) {
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
      synchronized (CommunicationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CommunicationFileDescriptorSupplier())
              .addMethod(getComuMethod())
              .build();
        }
      }
    }
    return result;
  }
}
