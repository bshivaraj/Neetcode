
package hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.util.stream.IntStream;

public class LilysHomework {

    private static final Scanner scn = new Scanner(System.in);

    private static void swap(long[] array, int index1, int index2) {
        long temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static int swaps(long[] unsortedValues) {
        int swaps = 0;

        Map<Long, Integer> locations = new HashMap<>();
        for (int i = 0; i < unsortedValues.length; i++) {
            locations.put(unsortedValues[i], i);
        }

        long [] sortedValue = unsortedValues.clone();
        Arrays.sort(sortedValue);

        for (int i = 0; i < sortedValue.length; i++) {
            if (sortedValue[i] != unsortedValues[i]) {
                swaps++;

                int swapIndex = locations.get(sortedValue[i]);
                locations.put(unsortedValues[i], swapIndex);

                swap(unsortedValues, i, swapIndex);
            }
        }

        return swaps;
    }

    public static void main(String[] args) {
    	long arr[]={2,5,3,1};
    	System.out.println(swaps(arr));
    }
}