package com.example.unittestsubject;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilits {

    /*public static boolean LoginPasswordFIOEmail(String Login, String Password,String FIO,String Email)
    {
        boolean PASSWORD;
        boolean LOGIN;
        boolean fio;
        boolean email;
        LOGIN = Login(Login);
        PASSWORD = Password(Password);
        fio = checkFIOValidity(FIO);
        email = checkEmailForValidity(Email);
        if(LOGIN == true && PASSWORD == true) {
            System.out.println("Создан пользватель: Login: " + Login + "; Password: " + Password + "; ФИО: " + FIO + "; Email: " + Email);
            return true;
        }
        else{
            if(LOGIN == false){
                System.out.println("Такой логин уже есть!");
            }
            else if(PASSWORD == false){
                System.out.println("Пароль не соответствует требованиям");
            }
            else if(fio = false)
            {
                System.out.println("Некорректный ввод ФИО");
            }
            else if(email == false)
            {
                System.out.println("Некорректный ввод email");
            }
            else{
                System.out.println("Такой логин уже есть и пароль не соответствует требованиям1");
            }
            return false;
        }
    }*/

    public static boolean checkFIOValidity(String FIO){
        if(FIO.length() - FIO.replace(" ","").length() == 2 || FIO.length() - FIO.replace(" ","").length() == 3)
            return true;
        else
            return false;
    }


    public static boolean Password(String str)
    {
        boolean specFlag = false;
        if(str.matches(".*[;!@#$%^&*()_+=№%?*~`<>/|{}].*"))
        {
            specFlag = true;
        }

        char ch;
        boolean capitalFlag = false;
        boolean lowerCaseFlag = false;
        boolean numberFlag = false;
        boolean HowMutch = false;
        if(str.length() > 7)
            HowMutch = true;
        for(int i=0;i < str.length();i++) {
            ch = str.charAt(i);
            if( Character.isDigit(ch)) {
                numberFlag = true;
            }
            else if (Character.isUpperCase(ch)) {
                capitalFlag = true;
            } else if (Character.isLowerCase(ch)) {
                lowerCaseFlag = true;
            }
            if(numberFlag && capitalFlag && lowerCaseFlag && str.length() > 7 && specFlag == true && HowMutch == true)
                return true;
        }
        return false;

    }

    public static boolean Login(String a){


        if(a.length() > 5)
            return true;
        else
            return false;

    }

    private static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);



    public static boolean checkEmailForValidity(String email){
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
        return  matcher.find();
    }


}
