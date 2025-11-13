//public class main7 {
//    main7(int a){
//        System.out.println(a);
//
//    }
//}
//class car{
//    public static void main(String[]args){
//        main7 s1=new main7(5);
//        main7 s2=new main7(6);
//    }
//
//}


public class main7 {
    int a;
    String name;
    main7(int a,String name){
        this.a=a;
        this.name=name;
        System.out.println("name"+ "+name");
        System.out.println("a"+" "+a);

    }
}
class car {
    public static void main(String[] args) {
        main7 s1 = new main7(5,"jain");
        main7 s2 = new main7(6,"mishra");
        main7 s3 = new main7(7,"Dubey");
    }
}
