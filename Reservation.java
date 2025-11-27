public class Reservation {
    private String pnr;
    private String name;
    private int age;
    private String flightNo;
    private String seatNo;

    public Reservation(String pnr, String name, int age, String flightNo, String seatNo) {
        this.pnr = pnr;
        this.name = name;
        this.age = age;
        this.flightNo = flightNo;
        this.seatNo = seatNo;
    }

    public String getPnr() { return pnr; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getFlightNo() { return flightNo; }
    public String getSeatNo() { return seatNo; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setFlightNo(String flightNo) { this.flightNo = flightNo; }
    public void setSeatNo(String seatNo) { this.seatNo = seatNo; }
}