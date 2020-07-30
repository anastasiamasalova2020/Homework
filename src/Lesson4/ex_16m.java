//Определите сумму элементов одномерного массива, расположенных между
//минимальным и максимальным значениями.
public class ex_16m {
    public static void main(String[] args) {
        int arr[] = new int[15];
        System.out.println();
        System.out.println("The original array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        int max = arr[0];
        int min = arr[0];
        int k = 0, f = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println();
        System.out.println("Max: " + max + " Min: " + min);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                k = i;
                break;
            }}
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == max) {
                    f = i;
                    break;
                }
            }
        System.out.println();
        System.out.println("The members of array between max and min :");
            if (k > f) {
                for (int i = f+1; i <= k-1; i++) {
                    System.out.print(arr[i] + "\t");
                }
            } else {
                for (int i = k+1; i <= f-1; i++) {
                    System.out.print(arr[i] + "\t");
                }
            }

        System.out.println();
    }
}
