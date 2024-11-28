import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class hashmap {
    public static void main(String[] args) {
        
        HashMap<String, String> enemyMap = new HashMap<>();       //hashmapを作成
        enemyMap.put("C","monster");
        enemyMap.put("B", "Dragon");                    //データを格納
        //enemyMap.put("B", "Got");                               //Bの内容を上書き

        System.out.println(enemyMap.get("B"));                //出力する

        HashMap<Integer,ArrayList<String>> testHashMap = new HashMap<>();  //ArrayLst格納用のhashmapを作成し内容の型をArraylistの要素に指定

        ArrayList<String> test1 = new ArrayList<>();
        test1.add("12");
        test1.add("58");
        test1.add("589");
        testHashMap.put(1, test1);                            //hashmapに格納し内容は要素を指定

        ArrayList<String> test2 = new ArrayList<>();
        test2.add("test");
        test2.add("こんにちは");
        testHashMap.put(2, test2);

        for (Map.Entry<Integer,ArrayList<String>> entry : testHashMap.entrySet()) {
            System.out.println("key:"+entry.getKey()+" "+entry.getValue());
        }
    }
}
