import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sample7 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String m = "男性";
        String w = "女性";
        list.add("千尋" + "は" + w);
        list.add("ハク" + "は" + m);
        list.add("湯婆婆" + "は" + w);
        list.add("釜爺" + "は" + m);
        list.add("リン" + "は" + w);
        System.out.println(list);
        Collections.sort(list);
        System.out.println("-----------あア亜のあいうえお順リスト------------");
        System.out.println(list);
    }
}
