package interfaceMethods;

/**
 * Created by Prayas on 3/21/2018.
 */
public class SimpleCalculator implements Callculator {

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int subtract(int a, int b) {
        return a-b;
    }

    public static void main(String args[]){
        SimpleCalculator call = new SimpleCalculator();
        int sum = call.add(24,34);
        int sub = call.subtract(5,2);
        double prod = call.product(5,2);
        double divide = call.divide(4,2);
        int greater = Callculator.greaterNumber(65,23);
        System.out.println("SUM : " + sum + " SUB : " + sub + " PROD : " + prod + " DIVIDE : " + divide +
                " GREATER : " + greater);
    }

}
