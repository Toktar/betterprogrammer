import java.util.List;


public class BetterProgrammerTask3tree {
protected static int sum =0, count = 0;

    // Please do not change this interface
    public static interface Node {
        int getValue();
        List<Node> getChildren();
    }


    public static double getAverage(Node root) {
        count++;
        sum +=root.getValue();
       List<Node> children = root.getChildren();
        for(Node child : children) {
            getAverage(child);
        }
        return (double)sum/(double)count;
    }
    


}




