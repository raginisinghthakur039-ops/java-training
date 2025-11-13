public class Parent {
    int x =10;
    Parent(){
        System.out.println("Parent constructor: x="+ x);

    }
}
class child extends Parent {
    int x =20;
    child(){
        //this.x refers to child x
        System.out.println("child this.x="+ this.x);
        //super.x refers to Parent x
        System.out.println("child super.x =" + super.x);
    }
     void show(){
        int x =30;
        System.out.println("local x ="+ x);
         System.out.println("this.x ="+ this.x);
         System.out.println(" super.x ="+ super.x);
     }
     public static void main(String[]args){
        child c=new child();//calls parent then child constructor
        c.show();
     }

}

