package anmav.demo;

/**
 * @author Nero
 * @since 2017/11/16
 */
public class Main {
    public static void main(String[] args) {

        IFibonacci fibonacci = new FibonacciImpl();

        int n = 50;

        long beginTime = System.currentTimeMillis();
        int result = fibonacci.fibonacci(n);
        long endTime = System.currentTimeMillis();

        System.out.println("第" + n + "个斐波那契数为：" + result);
        System.out.println("求第" + n + "个斐波那契数花费的时间为：" + (endTime - beginTime) + "ms");
    }
}
