package bean;

import java.io.Serializable;

public class Orde implements Serializable {
    private String id;
    private String goodsName;
    private Double price;
    private Integer amount;

    @Override
    public String toString() {
        return "Orde{" +
                "id='" + id + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }

    public Orde(String id, String goodsName, Double price, Integer amount) {
        this.id = id;
        this.goodsName = goodsName;
        this.price = price;
        this.amount = amount;
    }

    public Orde() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
