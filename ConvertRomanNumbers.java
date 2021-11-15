public class ConvertRomanNumbers {


    public static void romanToArab(String romanNum1, String operator, String romanNum2) {
        String[] romanNumbers = {"NULL", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        int num1 = 0, num2 = 0;
        for (int i = 0; i < romanNumbers.length; i++) {
            if (romanNum1.equals(romanNumbers[i])) {
                num1 = i;
            }
            if (romanNum2.equals(romanNumbers[i])) {
                num2 = i;
            }
        }
        CalculateRomanNumbers.calculateRomanNum(num1, operator, num2);

    }

    public static void arabToRoman(int c) {
        String[] romanNumbers = {"NULL", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] romanNumbersDec = {"NULL", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"};
        if (c <= 0) {
            System.out.println("В римских числах нет отрицательных чисел");
        } else if (c < 10 && c > 0) {
            System.out.println(romanNumbers[c]);
        } else if (c == 10) {
            System.out.println(romanNumbers[c]);
        } else if (c > 10 && c % 10 == 0) {
            System.out.println(romanNumbersDec[(c / 10)]);
        } else {
            System.out.println(romanNumbersDec[(c / 10)] + romanNumbers[c % 10]);
        }

    }
}
