package com.service.mytest.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestMytest {

        MytestDelegate mytestDelegate = new MytestDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = mytestDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}