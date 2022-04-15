package com.example.homepage;

public class Item {
    private String time;
    private String matter;
    private String plan;
    public Item() {}
    public Item(String time,String matter,String plan) {
        this.time = time;
        this.matter = matter;
        this.plan = plan;
    }
    public String getTime() {
        return time;
    }
    public String getMatter() {
        return matter;
    }
    public String getPlan() {
        return plan;
    }
}
