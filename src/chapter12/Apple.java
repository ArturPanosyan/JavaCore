package chapter12;

public enum Apple {
    JONATHAN(10), GOLDENDEL(9), REDDEL(12), WINESAP(15), CORTLAND(8);
     private int price;
    Apple(int p) {
        price = p;
    }

    Apple() {
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
