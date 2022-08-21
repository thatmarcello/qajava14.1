public class Ticket implements Comparable<Ticket> {
    private int id;
    private int price;
    private String arriveAirport;
    private String departureAirport;
    private int travelTime;

    public Ticket(int id, int cost, String arriveAirport, String departureAirport, int travelTime) {
        this.id = id;
        this.price = cost;
        this.arriveAirport = arriveAirport;
        this.departureAirport = departureAirport;
        this.travelTime = travelTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCost() {
        return price;
    }

    public void setCost(int cost) {
        this.price = cost;
    }

    public String getArriveAirport() {
        return arriveAirport;
    }

    public void setArriveAirport(String arriveAirport) {
        this.arriveAirport = arriveAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }

    @Override
    public int compareTo(Ticket o) {
        if (this.price < o.price) {
            return -1;
        } else if (this.price > o.price) {
            return 1;
        } else {
            return 0;
        }
    }
}
