
public class BetterProgrammerTask {

    public static int getClosestToZero(int[] a) {
        /*
          Please implement this method to
          return the number in the array that is closest to zero.
          If there are two equally close to zero elements like 2 and -2
          - consider the positive element to be "closer" to zero.
         */
        int closestIndex = 0;
        for (int i = 1; i < a.length; i++) {

            if(Math.abs(a[i]) < Math.abs(a[closestIndex]) || Math.abs(a[i]) == Math.abs(a[closestIndex]) && a[i]>0) {
                closestIndex = i;
            }
        }
        return a[closestIndex];
    }

}
