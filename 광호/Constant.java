package firebasetest.kwangho.com.hackertone;

import org.json.JSONObject;

import java.util.HashMap;

/**
 * Created by nam on 2017-02-10.
 */

public class Constant {
    //레벨-경험치 해시
    static HashMap<Integer, Integer> levelMaxExpHash = new HashMap<Integer, Integer>(){{
        put(1, 20);
        put(2, 40);
        put(3, 70);
        put(4, 110);
        put(5, 160);
        put(6, 220);
        put(7, 290);
        put(8, 370);
        put(9, 460);
        put(10, 560);
    }};
}
