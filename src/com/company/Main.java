package com.company;

import java.util.Scanner;

import static java.lang.System.out;
//import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    //public static void main(String[] args) throws IOException {

	/*
         write your code here
        System.out.println("Hello world");
        I
2	II
3	III
4	IV
5	V
6	VI
7	VII
8	VIII
9	IX
10	X
        */
        //out.println(IX+X); //не работает
        //X+9;
        //1;
        //out.println("IX"); только так работает
        out.println("Калькулятор");
        out.println("Введите числа:");
        //InputStream inputStream=System.in;//считывает байты
        //Reader inputStreamReader=new InputStreamReader(inputStream);//считывает символы
        //BufferedReader bufferedReader=new BufferedReader(inputStreamReader); //считывает строку
        //out.println("Результат:"+inputStreamReader); not work
        //out.println("Результат:"+bufferedReader.readLine());

        // данные в 1 строку

        int intResult;
        String strResult;


        Scanner inputData=new Scanner(System.in);
        while (inputData.hasNextLine()) {//что бы программа незаканчивалась
            //Scanner inputData=new Scanner(System.in);
            String dataStr = inputData.nextLine();//считываем строку 1 раз


            //inputData.close();
            //System.out.println("dataStr =" + dataStr);
            Scanner oneStrData = new Scanner(dataStr);//считываем строку сканером


            //DataControl cleanArray=new DataControl(inputData);
            try {
                DataControl cleanArray = new DataControl(oneStrData);

                int token1 = cleanArray.getToken1();
            /*
            if (inputData.hasNextLine()) { //not work
                System.out.println("2ая строка сущесвует (Enter нажат)");
                throw new Exception("Ошибка: данные вводятся в 1 строку");
            }*/
                String token2 = cleanArray.getToken2();
                int token3 = cleanArray.getToken3();
                //if (inputData.hasNextLine() && inputData.nextLine().isEmpty()) {

            /*if (!inputData.nextLine().isEmpty()) { //not work
            //if (inputData.hasNextLine()) {
                System.out.println("2ая строка сущесвует (Enter нажат)");
                //throw new Exception("Ошибка: данные вводятся в 1 строку");
            }*/
                //String token2=cleanArray.getToken2();
                //out.println("token1 = " + token1);
                //out.println("token2 = " + token2);
                //out.println("token3 = " + token3);

                //String rim = new ArabicToRims(18).getRimNumber();
                //out.println("ArabicToRims = " + rim);

                if ((token1 < 1) || (token1 > 10) || (token3 > 10) || (token3 < 1)) {
                    //out.println("token1 not in [1..10]");
                    throw new Exception("Диапазон входных данных от 1 до 10 включительно");
                }

                switch (token2) {
                    case "+":
                        intResult = (token1 + token3);
                        break;
                    case "-":
                        intResult = (token1 - token3);
                        break;
                    case "/":
                        intResult = (token1 / token3);
                        break;
                    case "*":
                        intResult = (token1 * token3);
                        break;
                    default:
                        //out.println("Введены некорректные данные");
                        throw new Exception("Допустимы только следующие операции: + - * /");
                        //break;
                }
                //конвертируем если вводили римские
                if (cleanArray.needConvert) {
                    out.println("Результат: " + new ArabicToRims(intResult).getRimNumber());
                } else {
                    out.println("Результат: " + intResult);
                }


            /*switch (token2) {
            case "+":
                out.println("Результат сложения:"+(int)(token1+token3));
                break;
            case "-":
                out.println("Результат вычитания:"+(int)(token1-token3));
                break;
            case "/":
                out.println("Результат деления:"+(int)(token1/token3));
                break;
            case "*":
                out.println("Результат умножения:"+(int)(token1*token3));
                break;
            default:
                //out.println("Введены некорректные данные");
                throw new Exception("Допустимы только следующие операции: + - * /");
                //break;
        }*/

            } catch (Exception e) {
                out.println("Обработка исключения");
                out.println(e.getMessage());
                break;//что бы было завершение работы программы
            }





        /*out.println(tokensArray[2]);

        //out.println(tokenArray.getTokenArray()[1]);//что бы опять 3 раза не вызывать ввод
        //out.println(tokenArray.getTokenArray()[2]);
        //out.println("Результат:"+inputData.nextLine());
        //int token1=Integer.parseInt(inputData.next());//Первый токен преобразуем в чмсло
        int token1=Integer.parseInt(tokensArray[0]);
        out.println("token1 = "+token1);*/

        /*
        int token1=inputData.nextInt();//Первый токен
        //out.println("Первый токен:"+token1);
        if (inputData.hasNextLine()) { //
            out.println("2ая строка сущесвует (Enter нажат)");
        }

        String token2=inputData.next();
        /*if (inputData.hasNextLine()) { // избыточно и так работает
            out.println("3ая строка сущесвует");
        }*/
        /*
        //token1 = "2"; work
        if (token2 == null) { // not work
            out.println("token2 = nill");
        }
        */

/*
        if (token1 == 2) {
            out.println("Первый токен = 2");
        }
        //String token2=inputData.next();

        out.println("Второй токен:"+token2);
        //if ((token2 == "+") && (token2 == "+ ")) { //не работает
        //if (inputData.hasNext("+")) { не работает
        if (token2.contains("+") && (token2.length() == 1)) {
            out.println("Второй токен содержит + и длинна равна 1");
        } else {
            out.println("Второй токен != +");
        }
        */

            //int token3=inputData.nextInt();//третий токен
            //out.println("Третий токен:"+token3);
        /*
        switch (tokensArray[1]) {
            case "+":
                out.println("Результат сложения:"+(tokensArray[0]+tokensArray[2]));
                break;/*
            case "-":
                out.println("Результат вычитания:"+(int)(token1-token3));
                break;
            case "/":
                out.println("Результат деления:"+(int)(token1/token3));
                break;
            case "*":
                out.println("Результат умножения:"+(int)(token1*token3));
                break;
            default:
                out.println("Введены некорректные данные");
                break;
        }
        */
        /*
        try {
            if ((token1 < 1) || (token1 > 10)) {
                out.println("token1 not in [1..10]");
                throw new Exception("token1 Exception");
            }
        } catch (Exception e){
            out.println("Обработка исключения");
            out.println(e.getMessage());
        }
        */


            //inputData.close();
            oneStrData.close();
            //inputData.close();
        }
        //oneStrData.close();
        inputData.close();
        //RimToArabic arabicResult=new RimToArabic("X"); //классы доллжны быть в 1 папке
        //out.println(arabicResult.getArabicNumber());








    }


}
