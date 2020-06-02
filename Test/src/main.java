import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String[] splitEx;
        System.out.println("Калькулятор умеет выполнять арифметические действия с числами от 1 до 10.\n" +
                "Вводить разрешено как арабские, так и римские числа.\n" +
                "Арифметические действия * / + - \n" +
                "Вводить через пробел. Например: 4 + 5 или III * IV");
        //Вводим выражение, пока оно не будет удовлетворять условиям
        splitEx=Check.IncludeString();
        //Проверка на правильность ввода Римских и Арабских чисел
        boolean rimCheck1 = false;
        boolean rimCheck2 = false;
        try {
            Roman.valueOf(splitEx[0]).toInt();
            rimCheck1 = true;
        } catch (IllegalArgumentException e) {
        }
        try {
            Roman.valueOf(splitEx[2]).toInt();
            rimCheck2 = true;
        } catch (IllegalArgumentException e) {
        } finally {
            if (rimCheck1 && rimCheck2) {
                //код с римскими
                int a= Roman.valueOf(splitEx[0]).toInt();
                int b= Roman.valueOf(splitEx[2]).toInt();
                int res=StringConverter.CountingExpression(a,splitEx[1],b);
                String RomRes=StringConverter.RomToArab(res);
                System.out.println("Результат: "+RomRes);
            }
            else if (!rimCheck1 && !rimCheck2) {
                //код с арабскими
                    Integer a = new Integer(splitEx[0]);
                    Integer b = new Integer(splitEx[2]);
                    int res = StringConverter.CountingExpression(a, splitEx[1], b);
                    System.out.println("Результат: " + res);
            }
        }
    }
}
