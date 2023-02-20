package json;

import com.alibaba.fastjson.JSON;

import java.util.List;
import java.util.Set;


public class FastjsonTest {


    public static void main(String[] args) {

        //创建一个对象
        User user1 = new User("sdf", 3, "男");

        System.out.println("==============Fastjson : Bean to Json===============");
        // 将对象转换成格式化的json
        String userJson1=  JSON.toJSONString(user1, true);
        // 将对象转换成非格式化的json
        String userJson2= JSON.toJSONString(user1, false);

        System.out.println("==============Fastjson : Json to Bean===============");
        User user2 = JSON.parseObject(userJson1, User.class);


    }
}