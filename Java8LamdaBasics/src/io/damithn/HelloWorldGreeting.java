package io.damithn;

/**
 * @author DAMITH SAMARAKOON on 8/8/2020
 */
public class HelloWorldGreeting implements Greeting{
    @Override
    public void perform() {
        System.out.println("Hello world");
    }

    //greetingFunction = () -> System.out.println("Hello world");

    //doubleNumberFuction = (int a) -> a*2;

    //addFunction = (int a , int b) -> a+b;

//    safeDivideFunction = (int a,int b) -> {
//        if (b==0) return 0;
//        return a/b;
//    }
//
//
//    stringLengthCount = (String s) -> s.length();
}
