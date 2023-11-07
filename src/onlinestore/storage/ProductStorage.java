package onlinestore.storage;

import onlinestore.exception.OutOfStockException;
import onlinestore.product.Product;


import java.io.Serializable;
import java.util.regex.Pattern;

public class ProductStorage implements Serializable {

    private Product[] products = new Product[100];
    private int size;

    public void add(Product product) {
        for (int i = 0; i < size; i++) {
            if(size == products.length ){
                extend();
            }
            products[size++] = product;
        }
    }

    private void extend() {
        Product[] tmp = new Product[10];
        System.arraycopy(products, 0, tmp, 0, products.length);
        products = tmp;
    }

    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(products[i]);
        }
    }


    public Product getById(String productId){
        for (int i =0; i <size; i++){
            if(products[i].getId().equals(productId)){
                return products[i];
            }
        }
        return null;
    }

    public double costOfTheProduct (Product currentProduct, double count, Product product) throws OutOfStockException {
        for (int i = 0; i <= size; i++) {
            if (products[i] instanceof Product ) {
                if (product.equals(currentProduct)) {
                    if (product.getStockQty() < count || product.getStockQty() == 0) {
                        throw new OutOfStockException("stock is empty");
                    }
                    return product.getPrice() * count;
                }
            }
        }
        throw new OutOfStockException("Stock doesn't exist");
    }

    public void removeProductById(String productId, Product product ) {
        for (int i = 0; i < size; i++) {
            if (products[i] instanceof Product) {
                if (products[i].getId().equals(productId)) {
                    continue;
                    //for (int j = i; j <= size; j++) {
                    // products[j] = products[j + 1];
                }
                products[size] = null;
                size--;
                break;
            }
        }
    }

    public double costOfTheProduct() {
        double totalCost = 0.0;
        for (int i = 0; i < products.length; i++) {
            totalCost += products[i].getPrice();
        }
        return totalCost;
    }


    public Object getProductById(String productId) {
        for (int i = 0; i < size; i++) {
            if(products[i].getId().equals(productId)){
                return products[i];
            }
        }
        return null;
    }
}