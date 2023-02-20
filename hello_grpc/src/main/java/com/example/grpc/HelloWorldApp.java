package com.example.grpc;

/**
 * @author jitwxs
 * @date 2022年09月20日 14:28
 */
public class HelloWorldApp {

    public static void main(String[] args) throws Exception {
        int port = 8000;
        GrpcServer server = new GrpcServer(port);
        server.start();
        HelloWorldClient client = new HelloWorldClient("localhost", port);
        String reply = client.sayHello("HanMeiMei");
        System.out.println(reply);
        server.shutdown();
    }
}
