import java.util.Scanner;

public class Check {
    public static String[] IncludeString(){
        String[] string;
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Введите выражение: ");
            String expression = in.nextLine().toUpperCase();
            string = expression.split(" ");
            boolean rimCheck1 = false;
            boolean rimCheck2 = false;
            if (string.length != 3) {
                System.err.println("Введенное выражение неверно. Попробуйте еще раз");
                continue;
            }
            //проверка Римских значений
            try {
                Roman.valueOf(string[0]).toInt();
                rimCheck1 = true;
            } catch (IllegalArgumentException e) {
            }
            try {
                Roman.valueOf(string[2]).toInt();
                rimCheck2 = true;
            } catch (IllegalArgumentException e) {
            }

            if(rimCheck1!=rimCheck2){
                System.err.println("Параметры должны быть только арабские, либо только римские!");
                continue;
            }
            else if (rimCheck1 && rimCheck2)break;
            else{
                //проверка арабских значений
                try {
                    Integer a = new Integer(string[0]);
                    Integer b = new Integer(string[2]);
                    if(a>10 || b>10) {
                        System.err.println("Максимально вводимое значение 10");
                        continue;
                    }
                }catch (NumberFormatException e) {
                    System.err.println("Введены неверные параметры");
                    continue;
                }
                break;
            }
        }
        return string;
    }
}

