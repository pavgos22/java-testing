package com.functional.stream;


import com.functional.stream.formUser.FormUser;
import com.functional.stream.formUser.Forum;

import java.text.Normalizer;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Map<Integer, String> usersMap = Forum.getUserList().stream().filter(user -> user.getSex() == 'M' && Period.between(user.getBirthDate(), LocalDate.now()).getYears() > 20 && user.getNumberOfPosts() >= 1).collect(Collectors.toMap(FormUser::getId, FormUser::getUserName));

        Iterator<Map.Entry<Integer, String>> itr = usersMap.entrySet().iterator();

        while(itr.hasNext())
        {
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }
    }
}
