import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = a + b;
        while (n > c) {
            a=b;
            b=c;
            c=a+b;
        }
        int i=c-n;
        int j=n-b;
        if(i<j){
            System.out.println(i);
        }
        else {
            System.out.println(j);
        }


    }
}
