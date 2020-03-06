import java.util.Scanner;

public class Naina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = "";
        int count = 0;
        int p = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        String[] arr = new String[count + 1];
        for (int m = 0; m < str.length(); m++) {
            if (m == str.length() - 1) {
                arr[p] = str2 + str.charAt(m);
            }
            if (str.charAt(m) == ' ') {
                arr[p] = str2;
                str2 = "";
                p++;
            } else {
                str2 = str2 + str.charAt(m);
            }
        }
        int n = sc.nextInt();
        for (int j = 0; j < n; j++) {
            String ch = arr[arr.length - 1];
            for (int k = arr.length - 2; k >= 0; k--) {
                arr[k + 1] = arr[k];
            }
            arr[0] = ch;
        }
        for (String l : arr) {
            System.out.print(l + " ");
        }

    }
}
