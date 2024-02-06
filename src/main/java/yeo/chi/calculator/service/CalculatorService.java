package yeo.chi.calculator.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import yeo.chi.calculator.service.strategy.Calculator;

@Service
@RequiredArgsConstructor
public class CalculatorService {

    private final Calculator calculator;

    public float getAnswer(Question question) {
        return calculator.calculate(question);
    }
}
