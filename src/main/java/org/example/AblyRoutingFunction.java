package org.example;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;

import java.util.function.Function;

public class AblyRoutingFunction implements Function<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {
   @Override
   public APIGatewayProxyResponseEvent apply(APIGatewayProxyRequestEvent apiGatewayProxyRequestEvent) {
      APIGatewayProxyResponseEvent response = new APIGatewayProxyResponseEvent();
      response.setStatusCode(200);
      response.setBody("Lambda works");
      return response;
   }
}
