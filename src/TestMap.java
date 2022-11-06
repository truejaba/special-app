import java.util.HashMap;

public class TestMap {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<String, Integer>();
        scores.put("Роман",29);
        scores.put("Маша",27);
        scores.put("Женя",30);
        System.out.println(scores);
        System.out.println(scores.get("Женя"));
    }
}
