package io.damithn;

/**
 * @author DAMITH SAMARAKOON on 8/8/2020
 */
public class TypeInferenceExample {
    public static void main(String[] args) {
        // [1]
       // StringLenghtLamda myLamda = (String s) -> s.length();

        // [2] removed data type
       // StringLenghtLamda myLamda = (s) -> s.length();

        // [3]removed parenththis
//        StringLenghtLamda myLamda = s -> s.length();

//        System.out.println(myLamda.getLenght("hello"));

        printLamda(s -> s.length());
    }

    public static void printLamda(StringLenghtLamda l){
        System.out.println(l.getLenght("hello"));
    }

    interface StringLenghtLamda{
        int getLenght(String s);
    }
}
