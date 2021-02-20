package lambda_calculator;

public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        Integer x1 = calc.plus.apply(1,2);
        calc.println.accept(x1);

        Integer x2 = calc.minus.apply(5,2);
        calc.println.accept(x2);

        Integer x3 = calc.devide.apply(150, 5);
        calc.println.accept(x3);

        Integer x4 = calc.abs.apply(1);
        calc.println.accept(x4);

        Integer x5 = calc.abs.apply(-5);
        calc.println.accept(x5);


    }

}
