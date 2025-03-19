import java.util.*;
public class program3b {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        StringBuffer sb1 = new StringBuffer();
        System.out.println("Capacity of the object sb1 : "+sb1.capacity());
        StringBuffer sb2 = new StringBuffer("Hello");
        System.out.println("Capacity of the object sb2 : "+sb2.capacity());

        System.out.println("ENTER A STRING ");
        String s=in.nextLine();

        StringBuffer reversestring = new StringBuffer(s);
        reversestring.reverse();

        System.out.println("REVERSED LOWER CASE STRING : "+reversestring.toString().toUpperCase());

        System.out.println("ENTER A STRING");
        String str = in.nextLine();

        reversestring.append(str);

        System.out.println("STRING AFTER APPENDING : "+reversestring);

    }
}
