//import java.util.Scanner;
//public class main2 {
//    public static void main (String[]args){
//        Scanner sc = new Scanner (System.in);
//
//        System.out.print ("Enter integer:");
//        int a=sc.nextInt();
//
//
//        System.out.print ("Enter double:");
//        double b = sc.nextDouble();
//
//        System.out.print ("Enter single words:");
//        String c=sc.next();
//
//        sc.nextLine();
//
//        System.out.print("Enter full line");
//        String d = sc.nextLine();
//
//        System.out.println("Integer:"+a);
//        System.out.println("Double:"+b);
//        System.out.println("Word:"+c);
//        System.out.println("Line:+d");
//
//
//
//    }
//}



//string-1
//class main2{
//    public static void main(String[]args){
//        String str="hello";
//        for(int i=0;i<str.length();i++){
//            System.out.println(str.charAt(i));
//        }
//    }
//}



//string-2
class main2{
    public static void main(String[]args){
        String str="hello";
        for(int i=str.length()-1;i>=0;i--){
            System.out.println(str.charAt(i));
        }
    }
}



