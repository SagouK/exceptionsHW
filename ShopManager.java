import java.util.List;

public class ShopManager {

    private ProductDataBase db;

    

    public ShopManager(ProductDataBase db) {
        this.db = db;
    }

    public double purchaseProduct(int productId, int quantity) throws ShopManagerException, ProductDataBaseException {

        Product product = db.getProduct(productId);
        if (product.getAvailableQuantity() < quantity) {
            throw new ShopManagerException("Not enough products in stock.");
        }
        double totalPrice = product.getPrice() * quantity;
        db.reduceProductQuantity(product, quantity);
        return totalPrice;
    }

    public List<Product> getAllProducts(){
        return db.getListOfProducts();
    }
}
