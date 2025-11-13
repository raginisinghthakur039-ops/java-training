//multi level
class Animal{
    void eat(){
        System.out.println("pizza");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("hehe");
    }
}
class Puppy extends Dog{
    void sleep(){
        System.out.println("koi kam nhi hai");
    }
}
class inheritance {
    public static void main(String[]args){
//        Dog s1=new Dog();
//        s1.eat();
        Puppy s1=new Puppy();
        s1.sleep();
        s1.eat();


    }
}
