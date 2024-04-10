// EventService.java

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EventService {
    private List<Event> events;

    public EventService() {
        this.events = new ArrayList<>();
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public void removeEvent(Event event) {
        events.remove(event);
    }

    public List<Event> getEvents() {
        return events;
    }

    public Optional<Event> getEventByName(String name) {
        return events.stream()
                .filter(e -> e.getName().equalsIgnoreCase(name))
                .findFirst();
    }

    public List<Event> getEventsByLocation(String location) {
        return events.stream()
                .filter(e -> e.getLocation().equalsIgnoreCase(location))
                .collect(Collectors.toList());
    }

    public void updateEvent(Event oldEvent, Event newEvent) {
        int index = events.indexOf(oldEvent);
        if (index != -1) {
            events.set(index, newEvent);
        }
    }

    public List<Event> getSortedEventsByDate() {
        return events.stream()
                .sorted(Comparator.comparing(Event::getDateTime))
                .collect(Collectors.toList());
    }
}
