package yeo.chi.calculator.service;

import org.apache.commons.lang3.StringUtils;

public class Question {
    private float x;

    private float y;

    private String operator;

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
        if (!StringUtils.isNumeric(split[0]) || !StringUtils.isNumeric(split[2])) {
            throw new NumberFormatException();
        }
    }
}
