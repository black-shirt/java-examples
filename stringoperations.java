package unlisted_experiments;

public class stringoperations {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        int l1 = s1.length();
        int l2 = s2.length();
        System.out.println(l1);
        System.out.println(l2);
        String join = s1.concat(s2);
        System.out.println(join);
        Boolean b = s1.equals(s2);
        System.out.println(b);
        String s3="        Hello World      ";
        String trim = s3.trim();
        System.out.println(trim);
        String S1= s1.toUpperCase();
        System.out.println(S1);
        String S2= s2.toLowerCase();
        System.out.println(S2);
    }
}
