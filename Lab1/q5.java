//5. Print numbers in triangle and pyramid vice
/*
1
121
12321
1234321
123454321
*/
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the n value:\n");
        int n = input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int k=i;k>1;k--){
                System.out.print(k-1);
            }
            System.out.println();
        }
    }
}
