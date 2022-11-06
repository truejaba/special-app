import java.util.ArrayList;

public class Foo5 {
   Integer i;
   int j = 1;

    public static void main(String[] args) {
        Foo5 t = new Foo5();
        t.go();
    }
        public void go(){
            i=j;
            System.out.println(j);
            System.out.println(i);
        }
    }


