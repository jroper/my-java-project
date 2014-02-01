package com.example;

import com.example.dao.FooDao;
import com.example.models.Foo;
import java.util.List;

public class SomeService {
    public static List<Foo> getAllFoos() {
        return new FooDao().findAll();
    }
}
