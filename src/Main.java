public class Main {
    public static void main(String[] args){
        String str1 = "HOLA MUNDO";
        TextProcessor tp = new TextProcessor(new LowerCaseStrategy());
        str1 = tp.ProcessString(str1);
        System.out.println(str1);

        tp.setTextStrategy(new UpperCaseStrategy());
        str1 = tp.ProcessString(str1);
        System.out.println(str1);

        tp.setTextStrategy(new RemoveSpacesStrategy());
        str1 = tp.ProcessString(str1);
        System.out.println(str1);
    }
}