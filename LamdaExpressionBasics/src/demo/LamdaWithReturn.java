package demo;

public class LamdaWithReturn {
    interface Cab {
        public String bookCab(String from, String to);
    }

//    class Uber implements Cab{
//        @Override
//        public String bookCab(String from, String to) {
//            return ("price 100/=");
//        }
//    }

    public static void main(String[] args) {
        Cab cab = (from, to) -> {
            System.out.println("Uber Cab Booked From " + from + " To " + to);
            return ("price 100/=");
        };
        System.out.println(cab.bookCab("colombo", "kelaniya"));
    }
}
