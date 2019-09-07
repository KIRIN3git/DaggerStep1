package jp.kirin3.daggerstep1;

import java.util.HashMap;
import java.util.Map;

public class PostClient {

    Map<Integer, String> post_map = new HashMap<Integer, String>() {
        {
            put(101, "神田郵便局");
            put(102, "麹町郵便局");
            put(103, "日本橋郵便局");
        }
    };

    public PostClient(){

    }

    public String GetPostOffice(int post_no){

        // 通信処理
        for (Integer key : post_map.keySet()) {
            if(post_no == key) return post_map.get(key);
        }

        return null;
    }

}
