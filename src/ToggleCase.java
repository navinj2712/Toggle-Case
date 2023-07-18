import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = scanner.next();
        String output = findToggleCase(str);
        System.out.println("Output : " + output);
    }

    private static String findToggleCase(String str) {
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++){
            ch[i] = (char)(ch[i] ^ (1 << 5));
        }
        return String.valueOf(ch);
    }
}
