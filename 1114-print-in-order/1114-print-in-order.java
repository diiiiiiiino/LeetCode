class Foo {
    private Semaphore semaphoreFirstSecond = new Semaphore(0);
    private Semaphore semaphoreSecondThird = new Semaphore(0);

    public Foo() {
    }

    public void first(Runnable printFirst) throws InterruptedException {
        
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        semaphoreFirstSecond.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        
        semaphoreFirstSecond.acquire();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        semaphoreSecondThird.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        
        semaphoreSecondThird.acquire();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}