package entities;

public class Parts {
    private Integer code;
    private Double price;
    private Integer quantity;
    private Double grossPrice; // Add a field to store gross price

    public Parts(Integer code, Double price, Integer quantity) {
        this.code = code;
        this.price = price;
        this.quantity = quantity;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    // Modify the method to calculate and set the gross price
    public void grossPrice(Double IPI) {
        this.grossPrice = this.price * this.quantity * (IPI / 100 + 1);
    }

    // Add a getter for the gross price
    public Double getGrossPrice() {
        return grossPrice;
    }

    @Override
    public String toString() {
        return String.format("Parts: %nCode: %d%nPrice: %.2f%nQuantity: %d%nGross Price: %.2f",
                code, price, quantity, grossPrice);
    }
}
