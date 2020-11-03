package demo;

public class LamdaWithArg {

    @FunctionalInterface
    interface Cab {
        public void bookCab(String from, String to);
    }

//    static class Uber implements Cab{
//        @Override
//        public void bookCab(String from, String to) {
//            System.out.println("Uber Cab Booked From "+from+" To "+to );
//        }
//    }

    public static void main(String[] args) {
//        Cab cab = new Uber();
        Cab cab = (from, to) -> System.out.println("Uber Cab Booked From " + from + " To " + to);
        cab.bookCab("colombo", "kelaniya");
    }
}
