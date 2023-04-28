import java.util.Scanner;
public class diff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int diff = a - b;
        System.out.println("The difference of a and b is: " + diff);
        sc.close();
     }
}

