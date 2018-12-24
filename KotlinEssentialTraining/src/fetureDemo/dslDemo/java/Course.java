package fetureDemo.dslDemo.java;

import javax.validation.constraints.NotNull;

public class Course {
    private String id;
    private String name;
    private int credit;
    private int cost;

    public Course() {
    }

    public Course(String id, String name, int credit, int cost) {
        this.id = id;
        this.name = name;
        this.credit = credit;
        this.cost = cost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
