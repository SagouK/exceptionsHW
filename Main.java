/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        ProductDataBase db = new ProductDataBase();
        ShopManager manager = new ShopManager(db);
        OnlineShopUI onlineShopUI = new OnlineShopUI(manager);
        onlineShopUI.run();
    }
}