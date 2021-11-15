import java.util.Arrays;
import java.util.List;

public class ValidateInput {

    public static void validate(String num1, String operator, String num2) {
        int numA, numB, numC, result;
        String[] romanNumbers = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        List<String> list = Arrays.asList(romanNumbers);
        Calculator arabCalc = new Calculator();

        try {

            if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
                if (list.contains(num1.toUpperCase()) && list.contains(num2.toUpperCase())) {
                    ConvertRomanNumbers.romanToArab(num1.toUpperCase(), operator, num2.toUpperCase());
                } else if (Integer.parseInt(num1) >= 0 && Integer.parseInt(num1) <= 10 && Integer.parseInt(num2) >= 0 && Integer.parseInt(num2) <= 10) {
                    numA = Integer.parseInt(num1);
                    numB = Integer.parseInt(num2);

                    if (operator.equals("+")) {
                        result = arabCalc.plus(numA, numB);
                        System.out.println(result);
                    } else if (operator.equals("-")) {
                        result = arabCalc.subtract(numA, numB);
                        System.out.println(result);
                    } else if (operator.equals("*")) {
                        result = arabCalc.multiply(numA, numB);
                        System.out.println(result);
                    } else if (operator.equals("/")) {
                        try {
                            result = arabCalc.divide(numA, numB);
                            System.out.println(result);

                        } catch (ArithmeticException e) {
                            System.out.println("На ноль делить нельзя");
                        }
                    }

                } else
                    System.out.println("Числа не могут быть больше 10, только операторы +, -, *, /. Введите данные корректно. Например, 2 + 4 или II + IX");
            }
        } catch (Exception e) {
            System.out.println("Введите данные правильно");
        }
    }
}
