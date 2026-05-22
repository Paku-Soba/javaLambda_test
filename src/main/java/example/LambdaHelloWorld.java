package example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaHelloWorld implements RequestHandler<String, String> {
    /**
     *
     * Lambda request handlers implement AWS Lambda Function application logic using plain old java objects
     * as input and output.
     *
     * @param: The input parameter type
     * @param: The output parameter type
     */
    @Override
    public String handleRequest(String input, Context context) {
        StringBuilder output = new StringBuilder("Check Start:");
        output.append(" Hello");
        output.append(" World!");
        output.append(" Lambdafunction check");
        output.append(" Success");
        String outputResult = output.toString();
        return outputResult;
    }
}