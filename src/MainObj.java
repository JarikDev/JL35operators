import java.util.List;

public class MainObj extends Object{
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main instanceof List);
        System.out.println(main instanceof Object);

        String s = "bla";
        System.out.println(s + " yohohoho");
        System.out.println("" + 5);
        System.out.println("" + 5 + 6);
        System.out.println(5 + 6 + "");
        int a = 5;
        a++;
        System.out.println(a);
        a--;
        --a;
        System.out.println(a);
        System.out.println(a++ + ++a);
        System.out.println(a);
        int i = (5 > 6) ? 1 : 2;
        System.out.println(i);
        i = (7 > 6) ? 1 + 3 : 2;
        System.out.println(i);
        i = false ? 1 : 2;
        System.out.println(i);

        System.out.println(true && false);
        System.out.println(5 < 6 && 3 < 4);
        System.out.println(5 < 6 & 3 < 4);
        System.out.println(5>6 | 3<4);
        System.out.println(5>6 | 3>4);

        System.out.println(3>4 || returnBool());
        System.out.println(3>4 | returnBool());

        System.out.println(!(3>4));
        System.out.println(true ^ false);
        System.out.println(true ^ true);
    }
    private static boolean returnBool(){
        System.out.println("returnBoolean");
        return true;
    }
}
