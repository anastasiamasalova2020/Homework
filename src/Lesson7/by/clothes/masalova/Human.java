package Lesson7.by.clothes.masalova;

public class Human {
    private String name;
    private Coat coat;
    private Trousers trousers;
    private Boots boots;

    public Human(String name, Coat coat, Trousers trousers, Boots boots) {
        this.name = name;
        this.coat = coat;
        this.trousers = trousers;
        this.boots = boots;
    }
    public void clothesUp() {
        System.out.println("Human : " + this.name);
        this.boots.putOn();
        this.coat.putOn();
        this.trousers.putOn();

    }

    public void clothesDown() {
        System.out.println("Human : " + this.name);
        this.boots.putOff();
        this.coat.putOff();
        this.trousers.putOff();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coat getCoat() {
        return coat;
    }

    public void setCoat(Coat coat) {
        this.coat = coat;
    }

    public Trousers getTrousers() {
        return trousers;
    }

    public void setTrousers(Trousers trousers) {
        this.trousers = trousers;
    }

    public Boots getBoots() {
        return boots;
    }

    public void setBoots(Boots boots) {
        this.boots = boots;
    }
}
