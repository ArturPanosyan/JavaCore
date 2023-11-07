package onlinestore.order;

public enum OrderStatus {

    NEW, DELIVERED, CANCELED;

    private  String Status;
    

    OrderStatus(String orderStatus) {
        this.Status = orderStatus;
    }

    OrderStatus() {
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
