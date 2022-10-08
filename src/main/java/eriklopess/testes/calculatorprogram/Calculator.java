package eriklopess.testes.calculatorprogram;

public class Calculator {
    public double sum(double... numbers) {
        double result = 0;

        if (numbers.length > 0) {
            for (double number : numbers) {
                result += number;
            }
        }

        return result;
    }

    public double sub(double... numbers) {
        double result = 0;

        if (numbers.length > 0) {
            for (double number : numbers) {
                result -= number;
            }
        }

        return result;
    }
}
