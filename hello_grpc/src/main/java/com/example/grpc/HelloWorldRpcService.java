package com.example.grpc;

/**
 * @author jitwxs
 * @date 2022年09月20日 14:23
 */

import io.grpc.stub.StreamObserver;

public class HelloWorldRpcService extends HelloWorldGrpc.HelloWorldImplBase {

    @Override
    public void sayHello(Greeting request, StreamObserver<HelloResp> responseObserver) {
        String name = request.getName();
        HelloResp resp = HelloResp.newBuilder()
                .setReply("Hello " + name + "!")
                .build();
        responseObserver.onNext(resp);
        responseObserver.onCompleted();
    }
}
