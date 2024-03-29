package yeo.chi.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import yeo.chi.calculator.service.Question;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

@SpringBootTest
public class QuestionValidTest {

    @DisplayName("들어온 데이터가 3개로 나눌 수 없으면 에러가 발생한다.")
    @Test
    public void arrayLengthIsThree() {
        String request = "12 32";

        assertThatCode(() -> new Question(request)).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("들어온 데이터의 가운데 글자가 기호가 아닐 경우 에러가 발생한다.")
    @Test
    public void middleCharacterIsOperation() {
        String request = "45 45 45";

        assertThatCode(() -> new Question(request)).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("들어온 데이터의 첫번째, 세번째가 숫자가 아니면 에러가 발생한다.")
    @Test
    public void firstCharacterAdLastCharacterIsNumeric() {
        String request = "/ / 8.9";

        assertThatCode(() -> new Question(request)).isInstanceOf(NumberFormatException.class);
    }

    @DisplayName("정상적인 데이터가 들어오면 에러가 발생하지 않는다.")
    @Test
    public void isNormalData() {
        String request = "14 * 4.4";
        Question question = new Question(request);

        String[] split = request.split(" ");

        assertThat(question.getX()).isEqualTo(Float.parseFloat(split[0]));
        assertThat(question.getOperator()).isEqualTo(split[1]);
        assertThat(question.getY()).isEqualTo(Float.parseFloat(split[2]));
    }
}
