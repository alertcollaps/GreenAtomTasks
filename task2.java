import java.util.concurrent.atomic.AtomicInteger;

class Task2{
    public static void main(String[] args) {
        AtomicInteger a, b;
        a = new AtomicInteger(90);
        b = new AtomicInteger(67);
        print(a, b);
        swap(a, b);
        print(a, b);

        int a1, b1;
        a1 = 7; b1 = 9;
        print(a1, b1);
        a1 = swapV2(b1, b1 = a1);
        print(a1, b1);
    }

    public static void swap(AtomicInteger var1, AtomicInteger var2){
        var1.set(var1.get() ^ var2.get());  //a ^ b
        var2.set(var1.get() ^ var2.get()); //a ^ b ^ b = a
        var1.set(var1.get() ^ var2.get()); //a ^ b ^ a = b
    }

    public static int swapV2(int a, int bEQa){
        return a;
    }

    public static void print(AtomicInteger a, AtomicInteger b){
        System.out.println("val1: " + a + ";\tb: " + b);
    }

    public static void print(int a, int b){
        System.out.println("val1: " + a + ";\tb: " + b);
    }
}