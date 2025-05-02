package java8;

public class Main {

    public static void main(String[] args) {

        // lambda expression

        MakeMyTrip trip=()->{
            System.out.println("trip has been start from mumbai to thane ");
        };

        trip.MumbaiToThane();

        BookMyShow bookMyShow=(persion)->{
            float ticketPrice=200;
            float totalPtice=persion*ticketPrice;
            return totalPtice;
        };

        System.out.println(bookMyShow.priceOfTicket(4));
    }
}
