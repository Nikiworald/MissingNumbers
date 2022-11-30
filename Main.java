import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int start = 6;
        int end = 20;
        int lenght = end - start;
        int sumArray = 0;
        int sumNumber = end*(end-1)/2-start*(start-1)/2;
        int missingNumber=0;
        ArrayGenerator arrayGenerator = new ArrayGenerator(lenght);
        int[]array = arrayGenerator.arrayInTheMiddle(start,end);
        System.out.println(Arrays.toString(array));
        for (int i = 0;i<lenght-1;i++){
            sumArray += array[i];
        }
        missingNumber = (sumNumber-sumArray);
        System.out.println(missingNumber);
    }
}
