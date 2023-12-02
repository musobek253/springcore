package org.example.task.model2.task2.tk1;

public class City {
    private String name;
    private int numberOfPeople;
    private double size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", numberOfPeople=" + numberOfPeople +
                ", size=" + size +
                '}';
    }
}
