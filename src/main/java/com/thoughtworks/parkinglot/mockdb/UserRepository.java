package com.thoughtworks.parkinglot.mockdb;

import java.util.Arrays;
import java.util.List;

public class UserRepository {

    public static List<User> getAllUsers() {
        return Arrays.asList(new User("Tom", "67a5c47845d0f602208d1e06869c7e52"), // 1qaz2wsx3ed
                new User("Jenny", "e7fc9076f177f136e3fa6840b31d9296"), // 12345zxcvb
                new User("Jim", "25d55ad283aa400af464c76d713c07ad"), // 12345678
                new User("Cristina", "97db1846570837fce6ff62a408f1c26a"), // 1q2w3e4r5t
                new User("Bob Wang", "e26990fe1a31670153def24480c444df"), // 6y7u8i9o0p
                new User("Jason Zhong", "c63a13181ded40299d1de8cb34f8f9f8"), // asdfghjklz
                new User("David", "a95a2fc0750ad3eaab24c5580322cb24"), // zxcvbnmgh
                new User("Honghe Li", "76b1f076c43421da8ff70477027267ec"), // 4567fgh
                new User("Zhizhi Wang", "c98dabbd8fd28d587dff3e80bdf6ea44"), // cvbn7yg9i
                new User("XinLi", "a43a8e9a419e141be12967986ad63a35")); // xdrtcft6vgy
    }

}
