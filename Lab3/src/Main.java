public class Main {
    public static void main(String args[]) {
        // Letter
        System.out.println("NaiveLetter.toLower");
        System.out.println(NaiveLetter.toLower('C'));

        // Letter
        System.out.println("NaiveLetter.toUpper");
        System.out.println(NaiveLetter.toUpper('d'));

        // Reverse
        System.out.println("reverse");
        System.out.println(reverse(1234));

        Rect r = new Rect();
        System.out.println(r.getArea());
    }

    public static int reverse(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(num);
        stringBuilder.reverse();
        return Integer.parseInt(stringBuilder.toString());
    }
}
