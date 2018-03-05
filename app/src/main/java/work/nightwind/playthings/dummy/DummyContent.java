package work.nightwind.playthings.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import work.nightwind.playthings.Shoe;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<Shoe> ITEMS = new ArrayList<Shoe>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, Shoe> ITEM_MAP = new HashMap<String, Shoe>();

    public static void addItem(Shoe item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.name, item);
    }

    public static Shoe getShoe(int position) {
        return ITEMS.get(position);
    }
}
