//overidding
public class Animal1 {
    void eat(){
        System.out.println("pizza");
    }
    void data(){
        System.out.println("hiii");
    }
}
class Cat extends Animal{
    void eat(){
        System.out.println("milk");
    }
    void sleep(){
        System.out.println("Zzz");
    }

        }
class overiding{
    public static void main(String[]args){

        //Animal1 s1=new Animal1();
        Cat s1=new Cat();
        s1.eat();
//        Cat s2=new Cat ();
//        s2.sleep();
        Cat s2=(Cat)s1;
    }


}
