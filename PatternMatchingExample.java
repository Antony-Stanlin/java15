public class PatternMatchingExample {

    public static void main(String[] args) {
        Object obj="Java";
        Object num=15;

        //Before java 15
        // if(obj instanceof String){
        //     String str=(String)obj;
        //     System.out.println(str);
        // }
        // if (num instanceof String) {
        //     String n=(String)num;
        //     System.out.println("String: "+n);
        // }
        // else if(num instanceof Integer){
        //     int n=(int)num;
        //     System.out.println("Integer: "+n);
        // }

        //In java 15
        if(obj instanceof String str)
            System.out.println(str);
        if(num instanceof String n)
            System.out.println("String: "+n);
        else if (num instanceof Integer n) {
            System.out.println("Integer: "+n);
        }

        
    }
}
