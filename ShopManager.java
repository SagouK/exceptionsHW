public class ShopManager {

    public static double purchaseProduct(int productId, int quantity) {
        Product product = ProductDataBase.getProduct(productId);
        double totalPrice = product.getPrice() * quantity;
        return totalPrice;
    }
}
