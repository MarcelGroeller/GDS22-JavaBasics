public class ArithmetischeOperationen {

    public static void main(String[] args) {

        System.out.println("Hello Konsole");

        int number1 = 4;
        int number2 = 0;

        number2 = 5;

        System.out.println("Zahl 1: " + number1);
        System.out.println("Zahl 2: " + number2);

        int summe = number1 + number2;
        System.out.println(number1 + "+" +number2 + " = " + summe);

        int resultSubtraktion = number1 - number2;
        System.out.println(number1 + "-" + number2 + " = " + resultSubtraktion);

        int resultMultiplikation = number1 * number2;
        System.out.println(number1 + "*" + number2 + " = " + resultMultiplikation);

        double numberDouble2 = number2;
        double resultDivision = number1 / numberDouble2;
        System.out.println(number1 + "/" + number2 + " = " + resultDivision);

        int resultModul = number1 % number2;
        System.out.println(number1 + "%" + number2 + " = " + resultModul);


        //oder

        int a = 3;
        int b = 2;
        int result;

        result = a + b;
        System.out.println("result = " + result);

        result = a - b;
        System.out.println("result = " + result);

        System.out.println("Multiplikation = " + (a * b));

        double Dividieren = a / (1.0 * b);
        System.out.println("Dividieren Double= " + Dividieren);

        result = a % b;
        System.out.println("result Modulo = " + result);


    }
}
