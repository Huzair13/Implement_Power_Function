import java.util.Scanner;

public class PowerFunction {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Ath value !!");
        int A=scanner.nextInt();

        System.out.println("Enter the Bth value !!");
        int B=scanner.nextInt();

        System.out.println("Enter the Cth value !!");
        int C=scanner.nextInt();

        int powMod=powModMethod(A,B,C);
        System.out.println(powMod);
    }

    private static int powModMethod(int a, int b, int c) {
        if(b==0){
            return 1;
        }
        int p=powModMethod(a,b/2,c);
        if(b%2==0){
            return (p*p) % c;
        }
        else{
            return (p*p*a) % c;
        }
    }
}