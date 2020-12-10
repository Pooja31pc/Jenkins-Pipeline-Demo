package com.jenkins.jenkinsSpringBootDemo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {

    private int id;
    private String pname;
    private String batchno;
    private double price;
    private int noofproduct;

    public Product() {
    }

    public Product(int id, String pname, String batchno, double price, int noofproduct) {
        this.id = id;
        this.pname = pname;
        this.batchno = batchno;
        this.price = price;
        this.noofproduct = noofproduct;
    }

}
