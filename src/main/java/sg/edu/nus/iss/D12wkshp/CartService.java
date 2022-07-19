package sg.edu.nus.iss.D12wkshp;

import java.util.List;
import java.util.ArrayList;

public class CartService {

    public List<Item> getShoppingItems() {

        List<Item> lstItems = new Arraylist<>();

        Item itm = new Item();
        itm.setItemName("Prada Bag");
        itm.setQuantity(5);
        lstItems.add(itm);

        itm = new Item();
        itm.setItemName("Chanel Bag");
        itm.setQuantity(3);
        lstItems.add(itm);

        itm = new Item();
        itm.setItemName("Playstation 5");
        itm.setQuantity(6);
        lstItems.add(itm);

        itm = new Item();
        itm.setItemName("Nintendo Switch");
        itm.setQuantity(4);
        lstItems.add(itm);

        return lstItems;

    }
    
}
