package edu.hw7;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Task1 {
    private Task1() {
    }
    public static int incrementParallel(int num, int threads) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(threads);
        var res = new AtomicInteger(num);

        Stream.generate(() ->
                new Thread(() -> {
                    res.incrementAndGet();
                    countDownLatch.countDown();
                })
            )
            .limit(threads)
            .forEach(Thread::start);

        countDownLatch.await();

        return res.get();
    }
}