import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class SortMountains {
    LinkedList<Mountain> mth = new LinkedList<Mountain>();
    class NameCompare implements Comparator <Mountain>{
        public int compare(Mountain one, Mountain two) {
            return one.name.compareTo(two.name);
        }
    }
    class HeightCompare implements Comparator <Mountain>{
        public int compare(Mountain one, Mountain two) {
            return (one.height- two.height);
        }
    }

    public static void main(String[] args) {
        new SortMountains().go();
    }
    public void go(){
        mth.add(new Mountain("Лонг-Рейндж",14255));
        mth.add(new Mountain("Эльберт",14433));
        mth.add(new Mountain("Марун",14156));
        mth.add(new Mountain("Касл",14265));
        System.out.println("В порядке добавления: \n" + mth);
        NameCompare nc = new NameCompare();
        Collections.sort(mth, nc);
        System.out.println("По названию: \n" + mth);
        HeightCompare hc = new HeightCompare();
        Collections.sort(mth,hc);
        System.out.println("По высоте: \n" + mth);
    }

}
class Mountain {
    String name;
    int height;

    public Mountain(String name, int height){
        this.name = name;
        this.height = height;
    }
    public String toString(){
        return name + " " + height;
    }

}