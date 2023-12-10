import java.util.ArrayList;
import java.util.List;

public class ProductDataBase {
    
    private final List<Product> listOfProducts = new ArrayList<>();
    
    
    public List<Product> getListOfProducts() {
        return listOfProducts;
    }

    public ProductDataBase(){
        this.listOfProducts.add(new Product("Product 1", 10, 7.99));
        this.listOfProducts.add(new Product("Product 2", 20, 4.99));
        this.listOfProducts.add(new Product("Product 3", 5, 70.99));
        this.listOfProducts.add(new Product("Product 4", 30, 2.99));
        this.listOfProducts.add(new Product("Product 5", 2, 30.99));
    }

    public Product getProduct(int productId) throws ProductDataBaseException {
        if ((productId > 0) && (productId <= listOfProducts.size())){
            return listOfProducts.get(productId - 1);
        }
        throw new ProductDataBaseException("Product not found.");
    }

    public void reduceProductQuantity(Product product, int quantity) {
        product.setAvailableQuantity(product.getAvailableQuantity() - quantity);
    }
    
}
