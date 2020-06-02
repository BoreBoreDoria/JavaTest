public class StringConverter {
    static String RomToArab(int num){
        String romanResult="";
        int s=num/10;
        int d=num%10;
        switch (s){
            case 4:
                romanResult="XL"+dConv(d);
                break;
            case 9:
                romanResult="XC"+dConv(d);
                break;
            case 0:
                romanResult=dConv(d);
                break;
            case 1:
            case 2:
            case 3:
                romanResult=sConv(s)+dConv(d);
                break;
            case 5:
                romanResult="L"+dConv(d);
                break;
            case 6:
            case 7:
            case 8:
                romanResult="L"+sConv(s)+dConv(d);
                break;
            case 10:
                romanResult="C";
                break;
        }
        return romanResult;
    }
    private static  String dConv(int d){
        String string="";
        switch (d){
            case 1:string+="I";break;
            case 2:string+="II";break;
            case 3:string+="III";break;
            case 4:string+="IV";break;
            case 5:string+="V";break;
            case 6:string+="VI";break;
            case 7:string+="VII";break;
            case 8:string+="VIII";break;
            case 9:string+="IX";break;
            default:string+="";break;
        }
        return string;
    }
    private static  String sConv(int s){
        String string="";
        while (s>0){
            string+="X";
            s--;
        }
        return string;
    }
    public static int CountingExpression(int a, String symbol, int b) {
        switch (symbol) {
            case "/":
                return a / b;
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            default:
                System.out.println("Невозможно произвести действие");
        }
        return 0;
    }
}
