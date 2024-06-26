package by.it.group351002.malisheuski.lesson01;

import java.math.BigInteger;

/*
 * Вам необходимо выполнить способ вычисления чисел Фибоначчи с вспомогательным массивом
 * без ограничений на размер результата (BigInteger)
 */

public class FiboB {

    private long startTime = System.currentTimeMillis();

    private long time() {
        return System.currentTimeMillis() - startTime;
    }

    public static void main(String[] args) {

        //вычисление чисел простым быстрым методом
        FiboB fibo = new FiboB();
        int n = 55555;
        System.out.printf("fastB(%d)=%d \n\t time=%d \n\n", n, fibo.fastB(n), fibo.time());
    }

    BigInteger fastB(Integer n) {
        //здесь нужно реализовать вариант с временем O(n) и памятью O(n)

        if (n == 1 || n == 2) {
            return BigInteger.ONE;
        }
        BigInteger[] Mas = new BigInteger[3];
            Mas[0] = BigInteger.ONE;
            Mas[1] = BigInteger.ONE;
            for (int i = 2; i < n; i++) {
                Mas[2] = Mas[1].add(Mas[0]);
                Mas[0] = Mas[1];
                Mas[1] = Mas[2];
        }
        return Mas[2];
    }
}

