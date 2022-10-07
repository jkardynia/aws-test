package org.example;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class App {
   public static void main(String[] args) {
      SpringApplication.run(App.class, args);
   }

   @Bean
   public Function<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> processAblyMessages() {
      return new AblyRoutingFunction();
   }
}
