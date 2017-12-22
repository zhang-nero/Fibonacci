package anmav.demo;

/**
 * 斐波那契数递归实现
 *
 * @author Nero
 * @since 2017/11/16
 */
public class FibonacciRecursiveImpl implements IFibonacci {

    @Override
    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
