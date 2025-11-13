//class Bus{
//    public static void main(String[]args){
//        main8 s1=new main8();
//        main8 s2=new main8(5);
//        main8 s3=new main8(5,6);
//    }
//}
//
//public class main8 {
//    public main8(){
//        System.out.println("hello");
//    }
//    public main8(int a){
//        System.out.println(a);
//    }
//    public main8(int a,int b){
//        System.out.println(a);
//        System.out.println(b);
//    }
//
//}



class Bus{
    public static void main(String[]args){
        main8 s1=new main8();
//        main8 s2=new main8(5);
//        main8 s3=new main8(5,6);
    }
}



public class main8 {
    public main8() {
        this(5);
        System.out.println("hello");
    }

    public main8(int a) {
        this(5,6);
        System.out.println(a);
    }

    public main8(int a, int b) {
        System.out.println("a" + " "+a + "b" + b);

    }

}





