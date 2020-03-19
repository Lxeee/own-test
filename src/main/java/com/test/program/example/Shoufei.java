package com.test.program.example;

import java.util.Scanner;

interface Shoufei {

    abstract Float sqfy();

    public void Bus();

    public void Car();

    abstract class dd implements Shoufei{

        @Override
        public void Bus() {
            Float a;
            System.out.println("公共汽车一元每张");

        }

        Float sqfy(Float a) {
            return (float)a;
        }

        @Override
        public void Car() {
            System.out.println("出租车1。6");

        }

        public Float sqfy(Float b, Float c) {
            return (float)b * 3 + b * c;
        }
    }

    public class qiche{
        public static void main(String[] args) {
            System.out.println("您需支付公共汽车的车票为：");
            System.out.println("请输入：");
            Scanner y = new Scanner(System.in);
            Float c = y.nextFloat();

            if (c >= 3) {
                System.out.println();
            } else {
                System.out.println();
            }
        }
    }

}
