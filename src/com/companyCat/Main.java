package com.companyCat;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //HomeTask1();
        //HomeTask2();
        //HomeTask3();
        //HomeTask4();
        //HomeTask5();
        //HomeTask6();
        //HomeTask7();
        //HomeTask8();
        //HomeTask9();
        //HomeTask10();
        //HomeTask11();
    }

    private static void HomeTask11() {
        // Количество слов в строке
        // Вводится строка, состоящая из слов, разделенных пробелами.
        // Требуется посчитать количество слов в ней.
        Scanner scaner = new Scanner(System.in);
        System.out.println("введите фразу");
        String sentence = scaner.nextLine();
        sentence = sentence.strip();
        int count = 1;
        String letter;
        for (int i = 0; i < sentence.length(); i++) {
            letter = sentence.substring(i, i + 1);
            if (letter.equals(" ")) {
                count++;
            }
        }
        System.out.print("колличество слов в фразе = " + count);
    }

    private static void HomeTask10() {
        //Количество строчных и прописных букв в строке
        //Посчитать количество строчных (маленьких) и
        // прописных (больших) букв в введенной строке. Учитывать только английские буквы.
        Scanner scaner = new Scanner(System.in);
        System.out.println("введите фразу");
        String sentence = scaner.nextLine();
        sentence = sentence.strip();
        String letter, letter2;
        int count = 0, counT = 0;
        // такая проверка определит в любом языке))
        for (int i = 0; i < sentence.length(); i++) {
            letter = sentence.substring(i, i + 1);
            letter2 = letter.toLowerCase(Locale.ROOT);
            if (!letter.equals(" ")) {

                if (letter.equals(letter2)) {
                    count++;
                } else {
                    counT++;
                }
            }

        }
        System.out.println("в фразе строчных букв - " + count + "\n" + "прописных букв - " + counT);

    }

    private static void HomeTask9() {
        //Самое длинное слово в строке
        //Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на
        // экран. Случай, когда самых длинных слов может быть несколько, не обрабатывать.
        Scanner scaner = new Scanner(System.in);
        System.out.println("введите фразу");
        String sentence = scaner.nextLine();
        sentence = sentence.strip();
        String letter, word = "", wordMax = "";
        int max = 0;

        for (int i = 0; i <= sentence.length(); i++) {
            letter = (sentence + " ").substring(i, i + 1);
            letter = letter.strip();
            word = word.concat(letter);
            word = word.strip();
            if (letter.equals("")) {

                if (word.length() > max) {
                    max = word.length();
                    wordMax = word;
                }
                word = "";
            }
        }
        System.out.println("самое длинное слово в фразе - " + wordMax);
    }

    private static void HomeTask8() {
        //Самая длинная строка в массиве
        //Вводятся строки. Определить самую длинную строку и вывести ее номер на экран. 
        // Если самых длинных строк несколько, то вывести номера всех таких строк.
        int counter = 5;
        int max = 0;
        int[] count = new int[counter];
        int[] index = new int[counter];

        String[] matrix = new String[counter];
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите количество строк равное - " + counter);

        for (int i = 0; i < counter; i++) {
            matrix[i] = scanner.nextLine();
            count[i] = matrix[i].length();
            if (count[i] >= max) {
                max = count[i];
            }
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] == max) {
                index[i] = i;
            }
        }
        System.out.println(Arrays.toString(index));
    }

    private static void HomeTask7() {
        //Удаление лишних пробелов
        //Вводится ненормированная строка, у которой могут быть пробелы в начале, в конце и между словами
        // более одного пробела. Привести ее к нормированному виду, т.е. удалить все пробелы в начале и конце,
        // а между словами оставить только один пробел.
        Scanner scaner = new Scanner(System.in);
        System.out.println("введите фразу");
        String sentence = scaner.nextLine();
        sentence = sentence.strip();
        String[] sentence2 = new String[sentence.length()];
        String letter, word = "";
        for (int i = 0; i < sentence.length(); i++) {
            letter = sentence.substring(i, i + 1);
            sentence2[i] = letter;
        }
        for (int i = 0; i < sentence.length(); i++) {
            word = word.concat(sentence2[i]);

            if (sentence2[i].equals(" ") && sentence2[i + 1].equals(" ")) {
                word = word.strip();
            }
            if (sentence2[i].equals(" ") && (!sentence2[i + 1].equals(" "))) {
                word = word.strip();
                word += " ";
            }
    }
        word = word.strip();
        System.out.println("фраза после удаления лишних пробелов - "+word);
    }


    private static void HomeTask6() {
        //Удаление из строки повторяющихся символов
        //Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
        // Например, если было введено "abc cde def", то должно быть выведено "abcdef".
        Scanner scaner = new Scanner(System.in);
        System.out.println("введите фразу");
        String sentence = scaner.nextLine();
        sentence = sentence.strip();
        String sentence2="";
        String letter;

        for (int i = 0; i < sentence.length(); i++) {
            letter = sentence.substring(i, i + 1);
            letter = letter.strip();
               if (sentence2.contains(letter)) {
                letter = "";
            }
            sentence2 = sentence2.concat(letter);

        }
        System.out.println(sentence2);
    }

    private static void HomeTask5() {
        //Отфильтровать из строки числа
        //Вводится строка, содержащая буквы, целые неотрицательные числа и иные символы.
        // Требуется все числа, которые встречаются в строке, поместить в отдельный целочисленный массив.
        // Например, если дана строка "data 48 call 9 read13 blank0a", то в массиве должны оказаться числа
        // 48, 9, 13 и 0.
        Scanner scaner = new Scanner(System.in);
        System.out.println("введите строку");
        String sentence = scaner.nextLine();
        sentence = sentence.strip();
        String number = "";
        String letter, letter1;
        String numbers = "123456789";

        for (int i = 0; i < sentence.length(); i++) {
            letter = sentence.substring(i, i + 1);
            if (i != sentence.length() - 1) {
                letter1 = sentence.substring(i + 1, i + 2);
            }
            else{
                letter1 = "";
            }
            letter = letter.strip();
            if (numbers.contains(letter)) {
                number = number.concat(letter);
                if (numbers.contains(letter1)||(number.lastIndexOf(",")==number.length()-1)) {
                }
                else {
                    number += ",";
                }
            }
        }
        System.out.println("все числы  из введенной фразы: "+number);
    }


    private static void HomeTask4() {
        //Замена подстроки
        //Найти в строке указанную подстроку и заменить ее на новую.
        // Строку, ее подстроку для замены и новую подстроку вводит пользователь.
        String sentence, part,newPart;
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите строку");
        sentence = scanner.nextLine();
        System.out.println("какую подстроку заменить");
        part = scanner.nextLine();

        if (!sentence.contains(part)){
            System.out.println("такой подстроки в строке нет");
            }
        else {
            System.out.println("на что заменить подстроку");
            newPart = scanner.nextLine();
            sentence = sentence.replace(part, newPart);
            System.out.println("Готово - "+ sentence);
        }
    }

    private static void HomeTask3() {
        //Удалить из строки пробелы и определить, является ли она перевертышем
        //Вводится строка. Удалить из нее все пробелы. После этого определить, является ли
        //она палиндромом (перевертышем), т.е. одинаково пишется как с начала, так и с конца.
        Scanner scanner = new Scanner(System.in);
        String sentence, sentence1="", sentence2 = "", letter;
        System.out.println("введите строку для проверки на полиндром");
        sentence = scanner.nextLine();
        sentence = sentence.strip();

        for (int i = 0; i < sentence.length(); i++) {
            letter = sentence.substring(i, i+1);
            letter = letter.toLowerCase(Locale.ROOT);
            if (!letter.equals(" "))
                sentence1 = sentence1.concat(letter);
        }
        //System.out.println("без пробелов и регистров - "+sentence1);  - тест
        for (int j = sentence1.length() - 1; j >= 0; j--) {
                letter = sentence1.substring(j, j+1);
                sentence2 = sentence2.concat(letter);
            }

        //System.out.println("перевернули - "+sentence2);       - тест

        System.out.print("введенная фраза "+ sentence);
        if (sentence1.equals(sentence2)) {
            System.out.println(" - является  полиндромом");
        }
        else {
            System.out.println(" - не  полиндром");
        }
    }

    private static void HomeTask2() {
        // Является ли строка идентификатором
        //Определить, является ли введенное слово идентификатором, т.е. начинается ли оно
        // с английской буквы в любом регистре или знака подчеркивания и не содержит других символов,
        // кроме букв английского алфавита (в любом регистре), цифр и знака подчеркивания.
        int count;

        final String LETTERSUP = "QWERTYUIOPASDFGHJKLZXCVBNM";
        final String LETTERSDOWN = "qwertyuiopasdfghjklzxcvbnm";
        final String NUMERALS = "1234567890";
        String letter;
        do {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Введите идентификатор");
            String identify = scanner.nextLine();
            letter = identify.substring(0, 1);
            String word = letter;

            if (LETTERSDOWN.contains(letter) || (LETTERSUP.contains(letter)) || letter.equals("_")) {
                for (int i = 1; i < identify.length(); i++) {
                    letter = identify.substring(i , i+1);
                    if (LETTERSDOWN.contains(letter) || (LETTERSUP.contains(letter)) || letter.equals("_")
                            || NUMERALS.contains(letter)) {
                        word = word.concat(letter);
                    }
                }
                System.out.println(word); //тест
                if (identify.equals(word)){
                    System.out.println("Идентификатор введен верно");
                } else {
                    System.out.println("Идентификатор содержит запрещенные символы. попробуйте еще раз");
                }
            } else {
                System.out.println("Идентификатор может начинаться только с латинских букв или '_' попробуйте еще раз");
            }
            System.out.println("попробуете еще раз? 1 - да, 0 - нет");
            count = scanner.nextInt();
        }
        while (count == 1);
    }



    private static void HomeTask1() {
        //Составить из разных букв введенной строки слова
        // Вводится строка, состоящая из букв и пробелов. Составить из входящих в нее букв несколько любых
        // их сочетаний (слов) любой длины. Каждую букву строки можно использовать неограниченное количество раз


        int lv;
        String v, vv;
        final int min = 2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите фразу с пробелами");
        String s = scanner.nextLine();
        s = s.strip();
        final int ls = s.length();
        System.out.println("введите сколько слов составить");
        int count = scanner.nextInt();

        System.out.println("количество символов для игры"+ ls);
        //s = s.replace( " ",s.substring(0,1)); условие задачи позволяет и так избавиться от пробелов)))
        System.out.println("количество слов"+ count);

        for (int i = 1; i <= count; i ++) {
            lv = (int)(Math.random()*(ls - min))+min;
            System.out.println(i+ "длина слова"+ lv);
                vv="";
            for (int j = 0; j < lv; j++) {
                int randomSearch =(int)(Math.random()*(ls-1 - min))+min;
                    v = s.substring(randomSearch,randomSearch+1);
                    v = v.strip();
                     if (!v.equals("")){
                        vv = vv.concat(v);
                    }
                    else {
                        j--;
                    }
            }
            System.out.println(vv);
        }
    }
}
