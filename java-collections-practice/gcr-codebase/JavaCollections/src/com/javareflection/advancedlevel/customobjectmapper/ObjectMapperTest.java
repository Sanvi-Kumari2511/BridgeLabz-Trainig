package com.javareflection.advancedlevel.customobjectmapper;

import java.util.HashMap;
import java.util.Map;

public class ObjectMapperTest {
	public static void main(String[] args) {

        Map<String, Object> data = new HashMap<>();
        data.put("id", 156);
        data.put("name", "Sanvi");
        data.put("email", "sanvi@123gmail.com");

        //Convert map to User object
        User user = UserCustomObjectMapper.toObject(User.class, data);

        System.out.println(user);
    }
}
