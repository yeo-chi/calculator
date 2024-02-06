package yeo.chi.calculator.service.strategy;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import yeo.chi.calculator.service.Question;

@Component
@RequiredArgsConstructor
public class Calculator {

    public float calculate(Question question) {
        return ofStrategy(question.getOperator()).calculate(question.getX(), question.getY());
    }

    private CalculateStrategy ofStrategy(String operation) {
        switch (operation) {
            case "+" -> {
                return new AdditionStrategy();
            }
            case "-" -> {
                return new SubtractionStrategy();
            }
            case "*" -> {
                return new MultiplicationStrategy();
            }
            case "/" -> {
                return new DivisionStrategy();
            }
        }

        throw new RuntimeException();
    }
}
