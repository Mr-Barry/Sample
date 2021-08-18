import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hello! Write a valid date here");
        String date = scanner.next();
        int n1, n2, n3;
        n1 =Integer.parseInt(String.valueOf(date.charAt(0)));
        n1+=Integer.parseInt(String.valueOf(date.charAt(1)));
        n1+=Integer.parseInt(String.valueOf(date.charAt(3)));
        n1+=Integer.parseInt(String.valueOf(date.charAt(4)));
        n1+=Integer.parseInt(String.valueOf(date.charAt(6)));
        n1+=Integer.parseInt(String.valueOf(date.charAt(7)));
        n1+=Integer.parseInt(String.valueOf(date.charAt(8)));
        n1+=Integer.parseInt(String.valueOf(date.charAt(9)));

        System.out.println(Main.factorial(n1));

    }

    public static int factorial(int num) {
        int ans = 1;
        for (int i=num; i > 1; i--) {
            ans*=i;
        }
        return ans;
    }
}
