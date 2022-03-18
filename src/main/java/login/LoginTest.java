package login;

import org.junit.Test;

import java.util.HashMap;

public class LoginTest {


    public static AxiosResult findAll() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("name", "大可乐");
        return AxiosResult.success(hashMap);
    }

    public static void main(String[] args) {
        AxiosResult all = findAll();

        System.out.println(all.getCode());
        System.out.println(all.getData());
        System.out.println(all.getMessage());

    }
}
