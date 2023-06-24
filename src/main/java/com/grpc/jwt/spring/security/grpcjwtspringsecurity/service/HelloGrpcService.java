package com.grpc.jwt.spring.security.grpcjwtspringsecurity.service;

import com.devProblems.Employee;
import com.devProblems.HelloServiceGrpc;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

/**
 * @author Dev Problems(A Sarang Kumar Tak)
 * @YoutubeChannel <a href="https://www.youtube.com/channel/UCVno4tMHEXietE3aUTodaZQ">...</a>
 */
@GrpcService
public class HelloGrpcService extends HelloServiceGrpc.HelloServiceImplBase {
    @Override
    public void getEmployeeInfo(Empty request, StreamObserver<Employee> responseObserver) {
        responseObserver.onNext(Employee.newBuilder().setName("DevProblems").setSalary(1233).build());
        responseObserver.onCompleted();
    }
}
