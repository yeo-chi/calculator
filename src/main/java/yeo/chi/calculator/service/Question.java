package yeo.chi.calculator.service;

import lombok.Getter;

@Getter
public class Question {
    private final float x;

    private final float y;

    private String operator;

    private final String REGEX = "[0-9]+[.]?[0-9]*";

    public Question(String request) {
        String[] split = request.split(" ");

        validLength(split);
        validOperation(split);
        validIsNumeric(split);

        x = Float.parseFloat(split[0]);
        y = Float.parseFloat(split[2]);
        operator = split[1];
    }

    private void validLength(String[] split) {
        if (split.length != 3) {
            throw new IllegalArgumentException();
        }
    }

    private void validOperation(String[] split) {
        String operation = split[1];

        switch (operation) {
            case "+":
            case "-":
            case "*":
            case "/":
                break;
            default:
                throw new IllegalArgumentException();
        }

        this.operator = operation;
    }

    private void validIsNumeric(String[] split) {
        if (!split[0].matches(REGEX) || !split[2].matches(REGEX)) {
            throw new NumberFormatException();
        }
    }
}
