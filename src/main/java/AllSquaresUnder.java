import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllSquaresUnder {
    public static String findSquares(int left, int right) {
        List<Integer> squares = new ArrayList<>();
        for(int i = left; i <= right; i++) {
            //is it a square?
            //add to list
            double sqrt = Math.sqrt(i);
            if ((Math.sqrt(i) - Math.floor(Math.sqrt(i))) == 0)
            {
                squares.add(i);
            }
        }
//        return "4 9 16";
        return formatArrayList(squares);
    }

    private static String formatArrayList(List<Integer> arrayList){
        StringBuilder sb = new StringBuilder();
        for (Integer i : arrayList){
            sb.append(i.toString() + ' ');
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
