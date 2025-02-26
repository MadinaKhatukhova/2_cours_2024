package ru.skypro.Calculator;

public class CalculatorServiceImplParameterTest {
    private final CalculatorService out = new CalculatorServiceImpl();

    @MethodSource("provideArgumentsForCalculatorTests")
    @ParameterizedTest
    public void shouldReturnCorrectResultOfSummation(int num1, int num2) {
        assertEquals( num1 + num2, out.sum(num1, num2));

    }

    @MethodSource("provideArgumentsForCalculatorTests")
    @ParameterizedTest
    public void shouldReturnCorrectResultOfSummation(int num1, int num2) {
        assertEquals( num1 + num2, out.subtract(num1, num2));

    }

    @MethodSource("provideArgumentsForCalculatorTests")
    @ParameterizedTest
    public void shouldReturnCorrectResultOfSummation(int num1, int num2) {
        assertEquals( num1 + num2, out.multiply(num1, num2));

    }

    @MethodSource("provideArgumentsForCalculatorTests")
    @ParameterizedTest
    public void shouldReturnCorrectResultOfSummation(int num1, int num2) {
        assertEquals( num1 + num2, out.divide(num1, num2));

    }

    private static Stream<Arguments> provideArgumentsForCalculatorTests() {

        return Stream.of(
                Arguments. of (ZERO, ONE), Arguments.of(ZERO, TWO),
                Arguments. of (ONE, ONE),
                Arguments.of (ONE, TWO),
                Arguments. of(TIVO, ONE)
        );
    }



}
