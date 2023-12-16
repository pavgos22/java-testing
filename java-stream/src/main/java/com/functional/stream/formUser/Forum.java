package com.functional.stream.formUser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private static List<FormUser> users = new ArrayList<>();
    public static List<FormUser> getUserList() {
        users.add(new FormUser(173620, "adam75", 'M', LocalDate.parse("1994-12-11"), 3));
        users.add(new FormUser(100001, "janeDoe89", 'F', LocalDate.parse("1989-07-15"), 5));
        users.add(new FormUser(100002, "johnSmith92", 'M', LocalDate.parse("1992-01-20"), 10));
        users.add(new FormUser(100003, "aliceBlue", 'F', LocalDate.parse("1990-05-30"), 8));
        users.add(new FormUser(100004, "maxPower76", 'M', LocalDate.parse("1976-03-09"), 2));
        users.add(new FormUser(100005, "lilyGreen", 'F', LocalDate.parse("1985-11-22"), 7));
        users.add(new FormUser(100006, "daveRunner", 'M', LocalDate.parse("1993-08-17"), 4));
        users.add(new FormUser(100007, "sarahBright", 'F', LocalDate.parse("1991-02-05"), 9));
        users.add(new FormUser(100008, "mikeStorm", 'M', LocalDate.parse("1988-12-12"), 3));
        users.add(new FormUser(100009, "emmaLight", 'F', LocalDate.parse("1987-06-29"), 6));
        users.add(new FormUser(100010, "chrisRock", 'M', LocalDate.parse("1982-09-10"), 1));
        users.add(new FormUser(100011, "oliviaSky", 'F', LocalDate.parse("1995-04-18"), 11));
        users.add(new FormUser(100012, "tomDeep", 'M', LocalDate.parse("1979-10-23"), 12));

        return new ArrayList<>(users);
    }
}
