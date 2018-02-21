import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfDiscIntersectionsTest {
    @Test
    void solution() {
        int[] A = {1,5,2,1,4,0};
        assertEquals(11,NumberOfDiscIntersections.solution(A));

        int[] B = {1,2,3};
        assertEquals(3,NumberOfDiscIntersections.solution(B));

        int[] C = {1,5,25,1000};
        assertEquals(6,NumberOfDiscIntersections.solution(C));

        //Test for overflow
        int[] D = new int[100000];
        for(int i = 0; i<D.length;i++){
            D[i] = i+1;
        }
        assertEquals(-1,NumberOfDiscIntersections.solution(D));
    }
}