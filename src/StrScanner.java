import java.util.Scanner;
public class StrScanner {
    public void strScanner() {
        Scanner sc = new Scanner(System.in);
        String ans = sc.nextLine();
        sc.close();
        System.out.println("output: " + ans);
        char[] strToArray = ans.toCharArray();
        for (int i = 0; i < strToArray.length; i++) {
            System.out.print(strToArray[i] + " ");
        }
    }
}