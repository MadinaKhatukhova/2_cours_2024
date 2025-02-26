package ru.skypro.Calculator;

import service.CalculatorService;

@RestController
@RequestMapping("/calculator")

public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }


    @GetMapping
    public String showGreetings() {
        return "<h1>Добро пожаловать в калькулятор.</h1>";
    }


    @GetMapping("/plus")
    public String sumNumbers(@RequestParam Integer num1,  @RequestParam Integer num2);

    Integer result = calculatorService.sum(num1, num2);

        return generateMessage(num1, num2, '+', result);
    }
    @GetMapping("/minus")
    public String subtractNumbers(@RequestParam int num1, @RequestParam int num2) {
    int result = calculatorService.subtract(num1, num2);
    return generateMessage(num1, num2, '-', result);
}



@GetMapping("/multiply")
public String multiplyNumbers(@RequestParam int num1, @RequestParam int num2) {
    int result = calculatorService.multiply(num1, num2);
    return generateMessage(num1, num2, '*', result);
}

@GetMapping("/divide")
public String divideNumbers(@RequestParam int num1, @RequestParam int num2) {
    if (num2 == 0) {
        return "<h1>Второй аргумент равен 0. Деление на 0 невозможно.</h1>";

    }

    int result = calculatorService.divide(num1, num2);
    return generateMessage(num1, num2, '/', result);
}

private String generateMessage(Integer num1, Integer num2, char action, int result) {
    return String.format("<h1>%d %c %d = %d</h1>", num1, action, num2, result);
}
