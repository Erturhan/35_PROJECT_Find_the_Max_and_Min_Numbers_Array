import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int der = 0;
        System.out.print("Please determine the size of the array: ");
        der = scan.nextInt();

        int[] arr = new int[der];

        for (int i = 0; i < der; i++) {
            System.out.print("Please determine " + (i+1 )+ ". value of array: ");
            arr[i] = scan.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < der; i++) {

            if (max < arr[i]){ max = arr[i];}
            else if (min > arr[i]) { min = arr[i];}
        }


            System.out.println("max : "+ max);
        System.out.print("min : "+ min);

    }
}
