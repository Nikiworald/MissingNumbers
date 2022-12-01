import java.util.Arrays;
import java.util.Random;

public class MissingNumberWithUnknownStartAndEnd {
    public static void main(String arg[]) {
        Random rnd = new Random();
        int hiddenStart = rnd.nextInt(100);
        int hiddenEnd = rnd.nextInt(100);
        //hiddenStart =34;//ili lipsva 33 ili 34
        //hiddenEnd = 35;
        //hiddenStart = 0;//greshka
        //hiddenEnd = 1;
        while (hiddenEnd <= hiddenStart) {
            hiddenEnd = rnd.nextInt(100);
        }

        if (hiddenStart > 1) {//opravq greshkata pri start = 0,end = 1S
            hiddenStart--;
        }
        else {hiddenEnd++;}

        int length = hiddenEnd - hiddenStart;
        ArrayGenerator arrayGenerator = new ArrayGenerator(length);
        int[] array = arrayGenerator.arrayInTheMiddle(hiddenStart, hiddenEnd);
        System.out.println(hiddenStart + "/" + hiddenEnd);
        System.out.println(Arrays.toString(array));

        //reshenie
        int minNumberInArray = array[0];//start
        int maxNumberInArray = array[0];//end
        int sumInArray = 0;
        int missingNumber = 0;
        for (int x = 0; x < array.length; x++) {
            if (minNumberInArray > array[x]) {
                minNumberInArray = array[x];
            }
            if (maxNumberInArray < array[x]) {
                maxNumberInArray = array[x];
            }
            sumInArray = sumInArray + array[x];
        }
        maxNumberInArray++;
        int sumNumber = (maxNumberInArray * (maxNumberInArray - 1) / 2) - (minNumberInArray * (minNumberInArray - 1) / 2);
        missingNumber = sumNumber - sumInArray;
        System.out.println(minNumberInArray + "/" + maxNumberInArray);
        if (missingNumber == 0) {
            System.out.println("the missing number is " + (minNumberInArray - 1) + " or " + (maxNumberInArray));
        } else {
            System.out.println("the missing number is " + missingNumber);
        }
    }
}
