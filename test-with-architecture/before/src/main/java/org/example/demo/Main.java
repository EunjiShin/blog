package org.example.demo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(
    title = "Toy project",
    version = "v1",
    description = "테스트 코드를 추가하기 위한 연습에 사용될 토이 프로젝트입니다"
))
public class Main {

//    public static void main(String[] args) {
//        CalculationRequest calculationRequest = new CalculationRequestReader().read();
//        long answer = new Calculator().calculate(
//            calculationRequest.getNum1(),
//            calculationRequest.getOperator(),
//            calculationRequest.getNum2()
//        );
//        System.out.println(answer);
//    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}