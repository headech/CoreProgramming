import java.util.*;

public class ReservationService {

    private List<Reservation> reservations;

    public ReservationService() {
        reservations = CsvUtil.readFromCSV();
    }

    private String generatePNR() {
        return "PNR" + (100 + reservations.size() + 1);
    }

    public void addReservation(String name, int age, String flightNo, String seatNo) {
        String pnr = generatePNR();
        Reservation r = new Reservation(pnr, name, age, flightNo, seatNo);
        reservations.add(r);
        CsvUtil.writeToCSV(reservations);
        System.out.println("Reservation added! PNR: " + pnr);
    }

    public void viewAll() {
        for (Reservation r : reservations) {
            System.out.println(r.getPnr() + " | " + r.getName() + " | " +
                    r.getAge() + " | " + r.getFlightNo() + " | " + r.getSeatNo());
        }
    }

    public Reservation findByPNR(String pnr) {
        for (Reservation r : reservations) {
            if (r.getPnr().equalsIgnoreCase(pnr)) return r;
        }
        return null;
    }

    public void updateReservation(String pnr, String seatNo) {
        Reservation r = findByPNR(pnr);
        if (r == null) {
            System.out.println("PNR not found!");
            return;
        }
        r.setSeatNo(seatNo);
        CsvUtil.writeToCSV(reservations);
        System.out.println("Seat updated!");
    }

    public void deleteReservation(String pnr) {
        Reservation r = findByPNR(pnr);
        if (r == null) {
            System.out.println("PNR not found!");
            return;
        }
        reservations.remove(r);
        CsvUtil.writeToCSV(reservations);
        System.out.println("Reservation deleted!");
    }
}