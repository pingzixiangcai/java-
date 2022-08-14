package movie;

public class Movie {
//    1.定义成员变量
    private String name;
    private double scorces;
    private String actors;


//    3.定义构造器
    public Movie() {
    }

    public Movie(String name, double scorces, String actors) {
        this.name = name;
        this.scorces = scorces;
        this.actors = actors;
    }

    //    2. getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScorces() {
        return scorces;
    }

    public void setScorces(double scorces) {
        this.scorces = scorces;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }
}
