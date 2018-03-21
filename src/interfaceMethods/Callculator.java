package interfaceMethods;

/**
 * Created by Prayas on 3/21/2018.
 */
public interface Callculator {
    // Sum
    int add(int a, int b);

    // Subtract
    int subtract(int a, int b);

    // Default : Product
    default double product(int a, int b){
        return a*b;
    }

    // default divide
    default double divide(int a, int b){
        return a/b;
    }

    // Static greater number
    static int greaterNumber(int a, int b){
        if(a>b){
            return a;
        }else {
            return b;
        }
    }

}
