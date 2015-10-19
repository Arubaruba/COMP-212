public class NaiveLetter {
    public static char toLower(char c) {
        if ('A' <= c && c <= 'Z') {
            return (char) (c + ('a' - 'A'));
        } else {
            return c;
        }
    }

    public static char toUpper(char c) {
        if ('a' <= c && c <= 'z') {
            return (char) (c - ('a' - 'A'));
        } else {
            return c;
        }
    }
}
