package onlinestore.order;

import onlinestore.product.Product;
import onlinestore.user.User;
import onlinestore.user.UserType;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

    public class Order implements Serializable {

        private String id;
        private User user;
        private Product product;
        private Date date;
        private int price;
        private int qty;
        private PaymentMethod paymentMethod;
        private OrderStatus orderStatus;
        private String orderId;
        private UserType userType;
        private boolean isDelivered;
        private String currentLocation;


        public Order(String id, User user, Product product, Date date, int price, int qty, PaymentMethod paymentMethod, OrderStatus orderStatus, String orderId, UserType userType, boolean isDelivered, String currentLocation) {
            this.id = id;
            this.user = user;
            this.product = product;
            this.date = date;
            this.price = price;
            this.qty = qty;
            this.paymentMethod = paymentMethod;
            this.orderStatus = orderStatus;
            this.orderId = orderId;
            this.userType = userType;
            this.isDelivered = isDelivered;
            this.currentLocation = currentLocation;
        }

        public Order() {
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }

        public Product getProduct() {
            return product;
        }

        public void setProduct(Product product) {
            this.product = product;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getQty() {
            return qty;
        }

        public void setQty(int qty) {
            this.qty = qty;
        }

        public PaymentMethod getPaymentMethod() {
            return paymentMethod;
        }

        public void setPaymentMethod(PaymentMethod paymentMethod) {
            this.paymentMethod = paymentMethod;
        }

        public OrderStatus getOrderStatus() {
            return orderStatus;
        }

        public void setOrderStatus(OrderStatus orderStatus) {
            this.orderStatus = orderStatus;
        }

        public String getOrderId() {
            return orderId;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public boolean getUserType(UserType admin) {
            this.userType = userType;
            return true;
        }

        public void setUserType(UserType userType) {
            this.userType = userType;
        }

        public boolean isDelivered() {
            return isDelivered;
        }

        public void setDelivered(boolean delivered) {
            isDelivered = delivered;
        }

        public String getCurrentLocation() {
            return currentLocation;
        }

        public void setCurrentLocation(String currentLocation) {
            this.currentLocation = currentLocation;
        }

        @Override
        public String toString() {
            return "Order{" +
                    "id='" + id + '\'' +
                    ", user=" + user +
                    ", product=" + product +
                    ", date=" + date +
                    ", price=" + price +
                    ", qty=" + qty +
                    ", paymentMethod=" + paymentMethod +
                    ", orderStatus=" + orderStatus +
                    ", orderId='" + orderId + '\'' +
                    ", userType=" + userType +
                    ", isDelivered=" + isDelivered +
                    ", currentLocation='" + currentLocation + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) return true;
            if (object == null || getClass() != object.getClass()) return false;

            Order order = (Order) object;

            if (price != order.price) return false;
            if (qty != order.qty) return false;
            if (isDelivered != order.isDelivered) return false;
            if (!Objects.equals(id, order.id)) return false;
            if (!Objects.equals(user, order.user)) return false;
            if (!Objects.equals(product, order.product)) return false;
            if (!Objects.equals(date, order.date)) return false;
            if (paymentMethod != order.paymentMethod) return false;
            if (orderStatus != order.orderStatus) return false;
            if (!Objects.equals(orderId, order.orderId)) return false;
            if (userType != order.userType) return false;
            return Objects.equals(currentLocation, order.currentLocation);
        }

        @Override
        public int hashCode() {
            int result = id != null ? id.hashCode() : 0;
            result = 31 * result + (user != null ? user.hashCode() : 0);
            result = 31 * result + (product != null ? product.hashCode() : 0);
            result = 31 * result + (date != null ? date.hashCode() : 0);
            result = 31 * result + price;
            result = 31 * result + qty;
            result = 31 * result + (paymentMethod != null ? paymentMethod.hashCode() : 0);
            result = 31 * result + (orderStatus != null ? orderStatus.hashCode() : 0);
            result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
            result = 31 * result + (userType != null ? userType.hashCode() : 0);
            result = 31 * result + (isDelivered ? 1 : 0);
            result = 31 * result + (currentLocation != null ? currentLocation.hashCode() : 0);
            return result;
        }
    }

