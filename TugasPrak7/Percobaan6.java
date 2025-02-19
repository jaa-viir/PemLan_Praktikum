package TugasPrak7;

public class Percobaan6 {
    public static void main(String[] args) {
        try {
            System.out.println(reverse("This is a String"));
        } catch (Exception e) {
            System.out.println("String tersebut kosong");
        } finally {
            System.out.println("Semua selesai");
        }
    }

    public static String reverse(String s) throws Exception {
        if (s.length() == 0) {
            throw new Exception();
        }
        String reverseStr = "";
        for (int i = s.length() - 1; i >= 0; --i) {
            reverseStr += s.charAt(i);
        }
        return reverseStr;
    }
}
