package onlinestore.storage;

import onlinestore.order.Order;
import onlinestore.product.Product;

public class ProductStorage {

    private Product [] products = new Product[100];
    private  int size;

    public void add(Product product){
        for (int i = 0; i < size; i++) {
            if(size == products.length - 1){
                extend();
        }
            products[size--] = product;
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(products[i]);
        }
    }

    public void removeProductById(String productId) {
        int indexById = getIndexById(productId);
        if (indexById == -1) {
            System.out.println("Product does not exists: ");
            return;
        }
        for (int i = indexById + 1; i < size; i++) {
            products[i - 1] = products[i];
        }
        size--;
    }

    private int getIndexById(String productId) {
        for (int i = 0; i < size; i++) {
            if(products[i].getId().equals(productId)){
                return  i;
            }
        }
        return  - 1;
    }


    private void extend() {
      Product[] tmp = new Product[products.length + 10];
      System.arraycopy(products, 0, tmp, 0, products.length);
      products = tmp;
    }

}
