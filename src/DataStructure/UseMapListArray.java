package DataStructure;
import java.util.*;
public class UseMapListArray {

    public static void main(String[] args) {
        List<String> lal = new ArrayList<String>();
         //syntax for ArrayList
        lal.add("LBJ");
        lal.add("ADavis");
        lal.add("RRondo");
        lal.add("DHoward");

        List<String> lac = new ArrayList<String>();
        //syntax for ArrayList
        lac.add("KLeonard");
        lac.add("PG13");
        lac.add("Beverly");
        lac.add("Zubac");

        List<String> nyk = new ArrayList<String>();
        //syntax for ArrayList
        nyk.add("Barrett");
        nyk.add("Mitchell");
        nyk.add("DSmith");
        nyk.add("KKnox");

        Map<String, List<String>> key = new HashMap<String, List<String>>();
        //syntax for hashmap not in order
        key.put("LAL", lal);
        key.put("LAC", lac);
        key.put("NYK", nyk);

        for(Map.Entry<String, List<String>> variable: key.entrySet()){

            System.out.println(variable.getKey() + " --> " + variable.getValue());
        }
        //String is KEY List<String> is VALUE




    }
}
