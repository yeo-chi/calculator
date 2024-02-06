package yeo.chi.calculator.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CalculatorService {
    public float getAnswer(Question question) {
        switch (question.getOperator()) {
            case "+" -> {
                return question.getX() + question.getY();
            }
        }

        throw new RuntimeException();
    }
}
