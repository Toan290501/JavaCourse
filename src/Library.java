import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Item> items;

    public List<Item> getItems() {
        return items;
    }

    public Library() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }
}
