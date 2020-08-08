package io.damithn;

/**
 * @author DAMITH SAMARAKOON on 8/8/2020
 */
public class Greeter {

//    public void greet(){
//        System.out.println("hello world");
//    }

    public void greet(Greeting greeting){
        greeting.perform();
    }


    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        greeter.greet(helloWorldGreeting);

//       GreetinhType greetingFunction = () -> System.out.println("hello world");

         Greeting greetingFunction = () -> System.out.println("hello world");

    }

//    interface GreetinhType {
//        void foo();
//    }

}
