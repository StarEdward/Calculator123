public class CalculateRomanNumbers extends Calculator {

    public static void calculateRomanNum(int num1, String operator, int num2) {
        int result;
        if (operator.equals("+")) {
            result = plus(num1, num2);
            ConvertRomanNumbers.arabToRoman(result);
        } else {
            if (operator.equals ("-")) {
                result = subtract(num1, num2);
                ConvertRomanNumbers.arabToRoman(result);
            } else if (operator.equals("*")) {
                result = multiply(num1, num2);
                ConvertRomanNumbers.arabToRoman(result);
            } else if (operator.equals("/")) {
                try {
                    result = divide(num1, num2);
                    ConvertRomanNumbers.arabToRoman(result);
                } catch (ArithmeticException e) {
                    System.out.println("На ноль делить нельзя");
                }

            }
        }
    }


}
