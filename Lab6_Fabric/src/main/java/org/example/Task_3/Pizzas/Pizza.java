package org.example.Task_3.Pizzas;

public class Pizza {
    private String name;

    public Pizza(String name) {
        this.name = name;
    }
    public void prepare() {
        System.out.println(name + " pizza is being prepared");
    }

    public void bake(){
        System.out.println(name + " pizza is in the oven right now");
    }

    public void cut() {
        System.out.println(name + " pizza if being sliced");
    }

    public void box() {
        System.out.println(name + " pizza is being packed");
    }
}
