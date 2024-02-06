package yeo.chi.calculator.service.strategy;

import org.springframework.stereotype.Component;

@Component
public class MultiplicationStrategy implements CalculateStrategy {

    @Override
    public float calculate(float x, float y) {
        return x * y;
    }
}
