import java.util.Scanner;

public class ex_17m {

    public static void main(String[] args) {
        System.out.println("Enter the number of lines n (keep in mind that n equals the number of columns) ");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.close();
        int arr[][] = new int[n][n];
        int i, j, h=arr.length;


        for (i = 0; i < h / 2 + 1; i++) {
            for (j = 0; j < arr[i].length; j++) {
                if ((j < i) || (j >= (arr[i].length - i)))
                {arr[i][j] = 0;}
                else
                {arr[i][j] = 1;}

            }

        }
        for (i = h- 1; i >= h / 2 + 1; i--) {
            for (j = 0; j < arr[i].length; j++) {
                if ((j < (arr[i].length - 1 - i)) || (j > i))
                {arr[i][j] = 0;}
                else
                {arr[i][j] = 1;}
            }
        }
        for (i = 0; i < h; i++) {
            for (j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
