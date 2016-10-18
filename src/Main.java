/**
 * Created by Olivi on 06-10-2016.
 */
public class Main {

    public static void main(String[] args) {
        HashIntSet h = new HashIntSet();

        h.add(-2);
        h.add(3);
        h.add(5);
        h.add(6);
        h.add(8);

        HashIntSet newH = new HashIntSet();

        newH.add(2);
        newH.add(3);
        newH.add(6);
        newH.add(8);
        newH.add(11);

        //Ex1
        //System.out.println(h);
        //hIS.addAll(newH);
        //System.out.println(h);

        //Ex2
        //System.out.println(h.containsAll(newH));

        //Ex3
        //System.out.println(h.equals(newH));

        //Ex4
        //System.out.println(h);
        //h.removeAll(newH);
        //System.out.println(h);

        //Ex5
        //System.out.println(h);
        //h.retainAll(newH);
        //System.out.println(h);

        //Ex6 - VIRKER IKKE
        h.toArray();

        //Ex7
        //System.out.println(h.toStrings());

    }
}
