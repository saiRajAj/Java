/*
class Animal{
    void bark(){
        System.out.println("Barking...!");
    }
}
*/
/*
// Inheritence
class demo{
    void add(){
        System.out.println(10+20);
    }
}
class demo1 extends demo{
    void mul(){
        System.out.println(10*20);
    }
}
*/
/*
// Compile time ppolymorphism
// Method overloading
class demo{
    void print(int n){
        System.out.println(n);
    }
    void print(int n, float f){
        System.out.println(n+" "+f);
    }
    void print(int n, double d){
        System.out.println(n+" "+d);
    }
    void print(float f,double d){
        System.out.println(f+" "+d);
    }
    void print(double d, int n){
        System.out.println(d+" "+n);
    }
    void print(int n, float f, double d){
        System.out.println(n+" "+f+" "+d);
    }
    void print(int n, int f){
        System.out.println(n+" "+f);
    }
    void print(float f,float n){
        System.out.println(f+" "+n);
    }
    void print(double d,double n){
        System.out.println(d+" "+n);
    }
}
*/
/*
//Method Overriding
class vehicle{
    public void drive(){
        System.out.println("Vehicle is running....!");
    }
}
class car extends vehicle{ 
    public void drive(){
        System.out.println("Car is running....!");
    }
}

class bike extends car{
    public void drive(){
        System.out.println("Bike is Running..!");
    }
}
*/
public class June27{
    public static void main(String[] args) {
        /*
        int day = 1;
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Please, Enter valid Day...!");
        }
        */
       //int a =5;
       //int b = 7;
       //Bitwise AND, OR
       /*
       System.out.println("A & B : " + (a&b)); //5
       System.out.println("A | B : " + (a|b)); //7
       */
       // X-OR
       //System.out.println("A ^ B : " + (a^b)); //2
       // Bitwise complement operator
       //System.out.println("A ~ B : " + (~b)); //-8
       /*
       for (int i = 0; i < 10; i++) {
        if(i==4){
            continue;
        }
           System.out.println("Hello"+i);
           //break;
       }
       */
        // ------------------------------ OOP's------------------------------
        //object creation
        //Animal dog = new Animal();
        // method calling, behaviour
        //dog.bark();
        /*
        // calling overloaded method
        demo d1 = new demo();
        d1.print(10 , 20.5);
        */
       /*
       // Calling inherited class
       demo1 d1 = new demo1();
       d1.add();
       d1.mul();
       */
      /*
      // calling overriden method
      bike c = new bike();
      c.drive();
      */
    }
}