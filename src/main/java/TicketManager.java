import java.util.Arrays;

public class TicketManager {
    private TicketRepository repo;

    public TicketManager(TicketRepository repo) {
        this.repo = repo;
    }

    public void add(Ticket ticket) {
        repo.save(ticket);
    }

    public Ticket[] searchByAirport(String from, String to) {
        Ticket[] result = new Ticket[0]; // тут будем хранить подошедшие запросу продукты
        for (Ticket ticket : repo.findAll(from, to)) {
            if (matchesFrom(ticket, from) && matchesTo(ticket, to)) {
                Ticket[] tmp = new Ticket[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[tmp.length - 1] = ticket;
                result = tmp;
            }
        }
        Arrays.sort(result);
        return result;
    }

    // метод определения соответствия товара product запросу search
    public boolean matchesFrom(Ticket ticket, String search) {
        if (ticket.getArriveAirport().contains(search)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean matchesTo(Ticket ticket, String search) {
        if (ticket.getDepartureAirport().contains(search)) {
            return true;
        } else {
            return false;
        }
    }
}
