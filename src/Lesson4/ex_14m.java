//Создать массив оценок произвольной длины, вывести максимальную и
// минимальную оценку, её (их) номера.
public class ex_14m {
    public static void main(String[] args) {
        int array [] = {8,8,9,10,4,5,6,3,7,8,9,6,5,4,3,6,1,2,9};
        int max=array[0];
        int min=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println();
        System.out.println("The index(es) of members with the maximum value - "+max+" - is/are: ");
        for(int i=0;i<array.length;i++){
            if(array[i]==max){
                System.out.print(i+"\t");
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("The index(es) of members with the minimum value - "+min+" - is/are: ");
        for(int i=0;i<array.length;i++){

            if(array[i]==min){
                System.out.print(i+"\t");
            }
        }
        System.out.println();

    }
}
