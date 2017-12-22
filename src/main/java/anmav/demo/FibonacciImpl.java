package anmav.demo;

/**
 * 斐波那契数实现
 * @author Nero
 * @since 2017/11/16
 */
public class FibonacciImpl implements IFibonacci{

    @Override
    public int fibonacci(int n) {
        System.out.println("in put : " + n);
        if(n == 0){
            return 0;
        }

        if(n == 1){
            return 1;
        }

        int fibonacci_2 = 0;
        int fibonacci_1 = 1;
        int result = 1;

        for(int i = 2; i <= n; i++){
            result = fibonacci_1 + fibonacci_2;
            fibonacci_2 = fibonacci_1;
            fibonacci_1 = result;
        }

        return result;
    }
}
