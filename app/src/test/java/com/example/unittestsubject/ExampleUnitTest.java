package com.example.unittestsubject;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }


    @Test
    public void testIsFIOValid() {
        String testLogin = "hghgksvh";
        String testPassword = "ADSF123456@";
        String testFIO = "jhgjhg jhjg jhjhg";
        String testEmail = "Bkjhh@mail.ru";

        Assert.assertThat(String.format("Невалиден логин %s",testLogin), Utilits.Login(testLogin), is(true));
        Assert.assertThat(String.format("Невалиден пароль %s",testPassword), Utilits.Password(testPassword), is(true));
        Assert.assertThat(String.format("Невалидено ФИО %s",testFIO), Utilits.checkFIOValidity(testFIO), is(true));
        Assert.assertThat(String.format("Невалиден email %s",testEmail), Utilits.checkEmailForValidity(testEmail), is(true));
    }
}