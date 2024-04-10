// EventStatistics.java

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EventStatistics {

    public BigDecimal calculateAverageCost(List<Event> events) {
        return events.stream()
                .map(Event::getCost)
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .divide(BigDecimal.valueOf(events.size()), RoundingMode.HALF_UP);
    }

    public Event getMostExpensiveEvent(List<Event> events) {
        return events.stream()
                .max(Comparator.comparing(Event::getCost))
                .orElse(null);
    }

    public Event getLeastExpensiveEvent(List<Event> events) {
        return events.stream()
                .min(Comparator.comparing(Event::getCost))
                .orElse(null);
    }

    public List<Event> getUpcomingEvents(List<Event> events, LocalDateTime now) {
        return events.stream()
                .filter(e -> e.getDateTime().isAfter(now))
                .sorted(Comparator.comparing(Event::getDateTime))
                .collect(Collectors.toList());
    }
}
