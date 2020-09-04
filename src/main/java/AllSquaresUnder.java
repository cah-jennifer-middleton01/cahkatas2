import java.util.ArrayList;
import java.util.List;

public class AllSquaresUnder {
    public static String findSquares(int left, int right) {
        List<String> squares = new ArrayList<>();
        for(int i = left; i <= right; i++) {
            if ((Math.sqrt(i) - Math.floor(Math.sqrt(i))) == 0)
            {
                squares.add(Integer.toString(i));
            }
        }
        return String.join(" ", squares);
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
