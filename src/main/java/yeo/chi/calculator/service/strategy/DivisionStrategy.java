package yeo.chi.calculator.service.strategy;

import org.springframework.stereotype.Component;

@Component
public class DivisionStrategy implements CalculateStrategy {

    @Override
    public float calculate(float x, float y) {
        return x / y;
    }
}
