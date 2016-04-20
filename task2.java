import java.util.HashSet;
import java.util.Set;


public class BetterProgrammerTask {

    public static Set<Object> getUniqueElements(Set<Object> a, Set<Object> b) {
        /*
          Please implement this method to
          return a set of elements that can be found only in set a or set b,
          but not in both Sets.
          The method should not change the content of the parameters.
         */
        Set<Object> unique = new HashSet<Object>();
        for(Object bIterator : b) {
            if(!a.contains(bIterator)) {
                unique.add(bIterator);
            }
        }
        for(Object iterator : a) {
            if(!b.contains(iterator)) {
                unique.add(iterator);
            }
        }

        return unique;
    }
   
}
