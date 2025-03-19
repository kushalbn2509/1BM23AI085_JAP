public class program3a {

    public static boolean compareStrings(String s1, String s2)
    {
        return s1.equals(s2);
    }

    public static String copy(String s1)
    {
        return new String(s1);
    }

    public static String Concat(String s1, String s2)
    {
        return s1.concat(s2);
    }

    public static void main(String args[])
    {
        String s1="Hello";
        String s2="Hello";
        System.out.println("BOTH STRINGS ARE EQUAL : "+compareStrings(s1,s2));
        System.out.println("COPIED STRING : "+copy(s1));
        String s3="Hello";
        String s4=" World";
        System.out.println("CONCATENATED STRINGS : "+Concat(s3,s4));
    }
}

