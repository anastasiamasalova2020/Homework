//Создать массив, заполнить его случайными элементами, распечатать,
// перевернуть, и снова распечатать (при переворачивании нежелательно создавать еще один массив).
public class ex_15m {
    public static void main(String[] args) {
        int arr[]=new int[11];
        System.out.println("The original array: ");
        int n=arr.length;
        for(int i=0;i<n;i++){
            arr[i]= (int) (Math.random()*100+1);
            System.out.print(arr[i]+"\t");
        }
        System.out.println();

        System.out.println("The inverted array: ");
        for(int i=0;i<=n/2;i++){
            int f=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=f;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
