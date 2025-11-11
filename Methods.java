/*public class Methods {
    static void Sum(){
        System.out.println("hello");
    }
    public static void main (String [] args) {
        Methods obj = new Methods ();
        obj.Sum();
    }
}*/


// WE CAN CREATE MANY CLAASES IN JAVA //

public class Methods{
    static String name = "hello";
    void sum (){
        System.out.println(name);
    }
}
class Main {
    public static void main(String[] args) {
        Methods obj = new Methods();
        obj.sum();
    }
}