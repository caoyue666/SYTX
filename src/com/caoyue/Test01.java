package com.caoyue;
/*
 *
 * 测试类
 *
 *
 * */
public class Test01 {

    public static void main(String[] args) {

        Supermarket sm = new Supermarket();
        sm.setFruitname("苹果");
        sm.setPrice(8);

        Supermarket sm1 = new Supermarket();
        sm1.setFruitname("草莓");
        sm1.setPrice(13);

        Supermarket sm2 = new Supermarket();
        sm2.setFruitname("芒果");
        sm2.setPrice(20);

        //按照顾客全部各个水果买10斤开始测试
        //第一题测试
        //A购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
        int total1A = Test01.total1A(10,10, sm, sm1);
        System.out.println("A顾客一共花了"+total1A+"元");


        //第二题测试
        //B 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
        int total1B = Test01.total1B(10,10,10, sm, sm1,sm2);
        System.out.println("B顾客一共花了"+total1B+"元");

        //第三题测试
        // C 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
        int total1C = Test01.total1C(10,10,10, sm, sm1,sm2);
        System.out.println("C顾客一共花了"+total1C+"元");

        //第四题测试
        // D 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
        int total1D = Test01.total1D(0,0,10, sm, sm1,sm2);
        System.out.println("D顾客一共花了"+total1D+"元");


    }
    //顾客 A购买水果的方法，参数内需要传入苹果和草莓的斤数
    public static  int total1A(int i,int b,Supermarket sm,Supermarket sm1){

        return ((i*sm.getPrice())+(sm1.getPrice()*b)) ;

    }
    //顾客 B购买水果的方法，参数内需要传入苹果和草莓和芒果的斤数
    public static  int total1B(int i,int b,int c,Supermarket sm,Supermarket sm1,Supermarket sm2){

        return ((i*sm.getPrice())+(sm1.getPrice()*b)+(sm2.getPrice()*c)) ;

    }
    //顾客 C购买水果的方法，参数内需要传入苹果和草莓和芒果的斤数，苹果并且打八折
    public static  int total1C(int i,int b,int c,Supermarket sm,Supermarket sm1,Supermarket sm2){

        return (int) ((i*sm.getPrice()*0.8)+(sm1.getPrice()*b)+(sm2.getPrice()*c)) ;

    }
    //顾客 C购买水果的方法，参数内需要传入苹果和草莓和芒果的斤数，苹果并且打八折
    public static  int total1D(int i,int b,int c,Supermarket sm,Supermarket sm1,Supermarket sm2){

        int a = (int) ((i*sm.getPrice()*0.8)+(sm1.getPrice()*b)+(sm2.getPrice()*c)) ;

        if(a>=200){
            a= (int)(a*0.85);
        } else{
            a=a-10;
        };
        return a;
    }

}