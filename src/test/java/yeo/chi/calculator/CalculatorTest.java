package yeo.chi.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import yeo.chi.calculator.service.CalculatorService;
import yeo.chi.calculator.service.Question;
import yeo.chi.calculator.service.strategy.Calculator;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class CalculatorTest {

    @DisplayName("operator가 '+' 일 경우 값을 더한다")
    @Test
    void addition() {
        String request = "3 + 4.5";
        Question question = new Question(request);
        CalculatorService calculatorService = new CalculatorService(new Calculator());

        float answer = calculatorService.getAnswer(question);
        assertThat(answer).isEqualTo(7.5f);
    }

    @DisplayName("operator가 '-' 일 경우 값을 뺀다")
    @Test
    void subtraction() {
        String request = "3 - 4.5";
        Question question = new Question(request);
        CalculatorService calculatorService = new CalculatorService(new Calculator());

        float answer = calculatorService.getAnswer(question);
        assertThat(answer).isEqualTo(-1.5f);
    }

    @DisplayName("operator가 '*' 일 경우 값을 뺀다")
    @Test
    void multiplication() {
        String request = "3 * 4.5";
        Question question = new Question(request);
        CalculatorService calculatorService = new CalculatorService(new Calculator());

        float answer = calculatorService.getAnswer(question);
        assertThat(answer).isEqualTo(13.5f);
    }

    @DisplayName("operator가 '/' 일 경우 값을 뺀다")
    @Test
    void division() {
        String request = "4.5 / 4.5";
        Question question = new Question(request);
        CalculatorService calculatorService = new CalculatorService(new Calculator());

        float answer = calculatorService.getAnswer(question);
        assertThat(answer).isEqualTo(1.0f);
    }
}
