import java.util.Scanner;

public class Q7_MaxMin {
    public static void main (String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter number of elements of Array: ");
        int n= sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements of the array: ");
        for (int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        for (int i=1; i<arr.length;i++){
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int maxCount=0;
        int minCount=0;
        int firstMaxPos=-1;
        int lastMinPos=-1;

        for (int i=0; i<n; i++){
            if (arr[i] == max){
                maxCount++;
                if (firstMaxPos == -1){
                    firstMaxPos = i+1;
                }
            }
            if (arr[i]==min){
                minCount++;
                lastMinPos = i+1;
            }
        }
        System.out.println("Maximum element is: " + max);
        System.out.println("Minimum element is: " + min);
        System.out.println("Count of Maximum element is: " + maxCount);
        System.out.println("Count of Minimum element is: " + minCount);
        System.out.println("First occurrence of Maximum element is at position: " + firstMaxPos);
        System.out.println("Last occurrence of Minimum element is at position: " + lastMinPos);

        sc.close();
    }

}
