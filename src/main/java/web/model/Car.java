package web.model;

public class Car {
    private int id;
    private String brend;
    private String seria;
    private String generation;

    public Car(int id, String brend, String seria, String generation) {
        this.id = id;
        this.brend = brend;
        this.seria = seria;
        this.generation = generation;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getBrend() {
        return brend;
    }

    public String getSeria() {
        return seria;
    }

    public String getGeneration() {
        return generation;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public void setSeria(String seria) {
        this.seria = seria;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public String toString() {
        return brend + " " + seria + " " + generation;
    }
}