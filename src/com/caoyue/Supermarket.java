package com.caoyue;
/*
 * 创建一个超市类
 *
 * */
public class Supermarket {

    //水果名
    private String Fruitname;
    //价格
    private int Price;

    public Supermarket() {

    }
    public Supermarket(String fruitname, int price) {
        super();
        Fruitname = fruitname;
        Price = price;
    }
    public String getFruitname() {
        return Fruitname;
    }
    public void setFruitname(String fruitname) {
        Fruitname = fruitname;

    }
    public int getPrice() {
        return Price;
    }
    public void setPrice(int price) {
        Price = price;
    }



}
