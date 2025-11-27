import java.io.*;
import java.util.*;

public class CsvUtil {
    private static final String FILE_PATH = "reservations.csv";

    public static void writeToCSV(List<Reservation> data) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE_PATH))) {
            pw.println("PNR,Name,Age,Flight,Seat");

            for (Reservation r : data) {
                pw.println(r.getPnr() + "," + r.getName() + "," + r.getAge() + "," +
                        r.getFlightNo() + "," + r.getSeatNo());
            }
        } catch (Exception e) {
            System.out.println("Error writing CSV: " + e.getMessage());
        }
    }

    public static List<Reservation> readFromCSV() {
        List<Reservation> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            br.readLine();
            String line;

            while ((line = br.readLine()) != null) {
                String[] arr = line.split(",");

                Reservation r = new Reservation(
                        arr[0], arr[1],
                        Integer.parseInt(arr[2]),
                        arr[3], arr[4]
                );

                list.add(r);
            }
        } catch (Exception e) {
            System.out.println("CSV not found. Creating new file...");
        }

        return list;
    }
}