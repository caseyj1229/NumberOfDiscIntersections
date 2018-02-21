import java.util.Arrays;

public class NumberOfDiscIntersections {
    public static int solution(int[] A) {
        long[] A1 = new long[A.length];
        long[] A2 = new long[A.length];

        for(int i = 0; i < A.length; i++){
            A1[i] = i - (long)A[i];

            A2[i] = i + (long)A[i];
        }

        Arrays.sort(A1);
        Arrays.sort(A2);

        long count = 0;
        int j = 0;

        for(int i = 0; i < A.length; i++){
            while(j < A.length && A2[i] >= A1[j]){
                count += j;//add intersections of lower end
                count -= i;//avoid double counting intersections
                j++;
            }
        }

        if(count > 10_000_000){
            return -1;
        }

        return (int) count;
    }
}
