// Event.java

import java.time.LocalDateTime;
import java.math.BigDecimal;

public class Event {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    private LocalDateTime dateTime;
    private String location;
    private BigDecimal cost;

    public Event(String name, LocalDateTime dateTime, String location, BigDecimal cost) {
        this.name = name;
        this.dateTime = dateTime;
        this.location = location;
        this.cost = cost;
    }


    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", dateTime=" + dateTime +
                ", location='" + location + '\'' +
                ", cost=" + cost +
                '}';
    }
}
