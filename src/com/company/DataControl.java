package com.company;

import java.util.Scanner;

//класс проверяет поток ввода. На выходе ошибка или массив из 3х токенов
public class DataControl {
    private Scanner inputData;
    private String token2;
    private int token1;
    private int token3;
    private boolean token1IsString;
    public boolean needConvert=false;
    //private String[] tokenArray;

    public DataControl (Scanner inputData) {
        //int[] digitTokens= new int[2];//1 и 3ий токен будем сканировать как цифры
        this.inputData=inputData;
        if (inputData.hasNextInt()){
            token1=inputData.nextInt();//Первый токен
        } else {//проверяем является ли токен 1 строкой
            token1IsString = true;
            //token1=inputData.next();//Первый токен считываем как строку
            token1=new RimToArabic(inputData.next()).getArabicNumber();
        }
        /*
        if (inputData.hasNextLine()) { //not work
            //System.out.println("2ая строка сущесвует (Enter нажат)");
            throw new Exception("Ошибка: данные вводятся в 1 строку");
        }*/

        //digitTokens[1]=inputData.nextInt(); not work


    }
    //1 и 3ий токен будем сканировать как цифры
    public int getToken1()  {
        /*if (inputData.hasNextLine()) { //not work
            //System.out.println("2ая строка сущесвует (Enter нажат)");
            throw new Exception("Ошибка: данные вводятся в 1 строку");
        }*/
        return token1;
    }

    //сканируем 2ой токен как строку
    public String getToken2() throws Exception {
        if (inputData.hasNext()) { // проверка наличия 2 токена
            token2=inputData.next();
        } else {
            //System.out.println("2ая строка сущесвует (Enter нажат)");
            throw new Exception("Ошибка: данные вводятся в 1 строку");
        }
        //token2=inputData.next();
        /*if (inputData.hasNextLine()) { //not work
            //System.out.println("2ая строка сущесвует (Enter нажат)");
            throw new Exception("Ошибка: данные вводятся в 1 строку");
        }*/
        //return inputData.next();
        return token2;
    }

    public int getToken3() throws Exception {
        if (inputData.hasNextInt()) { // проверка наличия 3 токена как цифры
            token3=inputData.nextInt();
            if (token1IsString) {//если 1 токен строка а 3ой число - исключение
                //System.out.println("1 токен строка, а 3ой число");
                throw new Exception("Разноформатные данные");
            }
        } else {
            if (!inputData.hasNext()) {// проверка наличия 3 токена в любом виде
                //System.out.println("2ая строка сущесвует (Enter нажат)");
                throw new Exception("Ошибка: данные вводятся в 1 строку");
            } else { //токен3 = строка
                if (!token1IsString) {//если 1 токен число а 3ой строка - исключение
                    //System.out.println("1 токен число, а 3ой строка");
                    throw new Exception("Разноформатные данные");
                } else { //читаем 3 токен как строку и конвертируем в арабсике
                    token3=new RimToArabic(inputData.next()).getArabicNumber();
                    needConvert=true; //нужна будет конвертация в римские

                }
            }

        }
        /*if (inputData.hasNextLine()) { //not work
            //System.out.println("2ая строка сущесвует (Enter нажат)");
            throw new Exception("Ошибка: данные вводятся в 1 строку");
        }*/



        return token3;
    }

    /*public String[] getTokenArray() {
        //this.token1=inputData.next();
        //this.tokenArray[0]=inputData.next();
        //this.tokenArray[1]="test";
        //this.tokenArray="test"; not work
        //token1=inputData.next();
        //String token1=inputData.next();//Первый токен
        //return this.tokenArray;
        //return this.inputData.next();
        //return this.token1;
        //return this.tokenArray;
        String[] tokenArray= new String[3];
        //test[0]="test"; //работает
        tokenArray[0]=inputData.next();//Первый токен
        tokenArray[1]=inputData.next();
        tokenArray[2]=inputData.next();
        RimToArabic arabicResult=new RimToArabic(tokenArray[0]);
        RimToArabic arabicResult2=new RimToArabic(tokenArray[2]);
        //проверка диапазона входных данных
        if ((arabicResult.getArabicNumber() < 1) || (arabicResult.getArabicNumber() > 10) || (arabicResult2.getArabicNumber() < 1) || (arabicResult2.getArabicNumber() > 10)) {
            //out.println("token1 not in [1..10]");
            //throw new Exception("token1 Exception");
        }


        tokenArray[0]=arabicResult.toString();
        tokenArray[2]=arabicResult2.toString();

        return tokenArray;
    }*/
}
