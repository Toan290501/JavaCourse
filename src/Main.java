import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EventService eventService = new EventService();
        EventStatistics eventStatistics = new EventStatistics();

        // Create event
        eventService.addEvent(new Event("Java Conference", LocalDateTime.of(2024, 9, 15, 10, 0), "Convention Center", new BigDecimal("299.99")));
        eventService.addEvent(new Event("Tech Expo", LocalDateTime.of(2024, 10, 23, 9, 0), "Expo Park", new BigDecimal("199.99")));
        eventService.addEvent(new Event("Music Festival", LocalDateTime.of(2024, 8, 5, 16, 0), "Open Air", new BigDecimal("149.99")));

        // display event
        eventService.getSortedEventsByDate().forEach(System.out::println);

        // highest price
        System.out.println("Most Expensive Event: " + eventStatistics.getMostExpensiveEvent(eventService.getEvents()));

        // lowest price
        System.out.println("Least Expensive Event: " + eventStatistics.getLeastExpensiveEvent(eventService.getEvents()));

        // avarage price
        System.out.println("Average Cost of Events: " + eventStatistics.calculateAverageCost(eventService.getEvents()));

        // incomming
        eventStatistics.getUpcomingEvents(eventService.getEvents(), LocalDateTime.now()).forEach(e -> System.out.println("Upcoming Event: " + e));
    }
}