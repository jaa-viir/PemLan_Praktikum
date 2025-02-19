package TugasPrak7;

import java.io.*;

public class Test3 {
    public void methodA() {
        System.out.println("Method A");
    }

    public void methodB() {
        try {
            System.out.println(20 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan aritmatika");
        }
        System.out.println("Method B");
    }
}

// class Utama {
//     public static void main(String[] args) throws IOException {
//         Test3 c = new Test3();
//         c.methodA();
//         c.methodB();
//     }
// }

class Utama {
    public static void main(String[] args) {
        Test3 obj = new Test3();
        obj.methodA();
        try {
            obj.methodB();
        } catch (Exception e) {
            System.out.println("Error di Method B");
        } finally {
            System.out.println("Ini selalu dicetak");
        }
    }
}