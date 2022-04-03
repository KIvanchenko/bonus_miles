
public class Main {
    public static void main(String[] args) {
        int ticketPrice = 26711;
        int rubblesPer1Miles = 20;

        int bonusMiles = ticketPrice / rubblesPer1Miles;


        System.out.println("Бонус = " + bonusMiles + " миль");
    }
}