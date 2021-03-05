package sample;

public class Modal {

    public double calculate(double number1, double number2, String operator) {

        switch (operator) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "×":
                return number1 * number2;
            case "÷":
                return number1 / number2;
            case "%":
                return number1 / number2 * 100;
           default: return 0;
        }

    }
}
