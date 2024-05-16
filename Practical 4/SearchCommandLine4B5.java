public class SearchCommandLine4B5 {
    public static void main(String[] args) {
        String s1 = args[0];
        String s2 = s1.toUpperCase();
        if (s1.equals(s2)) {
            System.out.println("String is in upper case");
        } else {
            System.out.println("String is not in uppercase\nPrograme Terminated");
            System.exit(0);
        }
    }
}
