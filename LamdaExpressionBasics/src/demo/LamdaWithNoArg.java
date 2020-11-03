package demo;

@FunctionalInterface
interface Cab {
    public void bookCab();
}

//class Uber implements Cab {
//    @Override
//    public void bookCab() {
//        System.out.println("Uber cab is Booked !");
//    }
//}

public class LamdaWithNoArg {
    public static void main(String[] args) {
        //Uber uber = new Uber();
        //Cab uber = new Uber();
        Cab cab = () -> System.out.println("Uber cab is Booked !");
        cab.bookCab();

    }
}
