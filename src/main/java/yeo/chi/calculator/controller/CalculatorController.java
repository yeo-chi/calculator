package yeo.chi.calculator.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yeo.chi.calculator.service.CalculatorService;
import yeo.chi.calculator.service.Question;

@RestController
@RequestMapping("api/v1/calculator")
@RequiredArgsConstructor
public class CalculatorController {

    private final CalculatorService calculatorService;

    @GetMapping
    public float getAnswer(String request) {

        float answer = calculatorService.getAnswer(new Question(request));
        System.out.println(request + " = " + answer);

        return answer;
    }
}
