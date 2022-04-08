package comparator;

import java.util.Comparator;

public class SquareComparator implements Comparator<Square> {
    @Override
    public int compare(Square r1,Square r2){
        if (r1.getCanh() > r2.getCanh()) return 1;
        else if (r1.getCanh() < r2.getCanh()) return -1;
        else return 0;
    }
}
