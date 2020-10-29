package DataStructure;

//import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class UseHashMap {
    public static void main(String[] args) {
//        Map<String, String> mapp = new HashMap<String, String>();
//            //syntax for hashmap
//        mapp.put("LBJ", "LAL");
//        mapp.put("PG13", "LAC");
//        mapp.put("KP", "MAV");
//        mapp.put("FVV", "TOR");
//        for(Map.Entry<String, String> nba:mapp.entrySet()){
//            System.out.println(nba.getKey() + " --> " + nba.getValue());
//            //Syntax for print not in order forEachLoop
//        }

        Map<String, String> lhmap = new LinkedHashMap<String, String>();
        //syntax for hashmap to be in order
        lhmap.put("LBJ", "LAL");
        lhmap.put("PG13", "LAC");
        lhmap.put("KP", "MAV");
        lhmap.put("FVV", "TOR");

        for(Map.Entry<String, String> nba:lhmap.entrySet()){
            System.out.println(nba.getKey() + " --> " + nba.getValue());
                //Syntax for println in order forEachLoop
           }

        }

    }
