import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ReservationService service = new ReservationService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- AIRPLANE RESERVATION SYSTEM ---");
            System.out.println("1. Add Reservation");
            System.out.println("2. View All Reservations");
            System.out.println("3. Search by PNR");
            System.out.println("4. Update Seat");
            System.out.println("5. Delete Reservation");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Flight No: ");
                    String flight = sc.nextLine();
                    System.out.print("Seat No: ");
                    String seat = sc.nextLine();
                    service.addReservation(name, age, flight, seat);
                    break;

                case 2:
                    service.viewAll();
                    break;

                case 3:
                    System.out.print("Enter PNR: ");
                    String pnr = sc.nextLine();
                    Reservation r = service.findByPNR(pnr);
                    if (r == null) System.out.println("PNR not found!");
                    else System.out.println(r.getPnr() + " | " + r.getName() + " | " + r.getAge() + " | " + r.getFlightNo() + " | " + r.getSeatNo());
                    break;

                case 4:
                    System.out.print("Enter PNR: ");
                    String p = sc.nextLine();
                    System.out.print("New Seat: ");
                    String s = sc.nextLine();
                    service.updateReservation(p, s);
                    break;

                case 5:
                    System.out.print("Enter PNR: ");
                    String del = sc.nextLine();
                    service.deleteReservation(del);
                    break;

                case 6:
                    System.exit(0);
            }
        }
    }
}