public class Player implements Comparable<Player>{
    private String name;
    private String lName;
    private int age;
    private int ranking;
    private int points;

    @Override
    public String toString() {
        return name + " "+ lName + "; " + age + "; " + ranking + "; " + points + "\n";
    }

    @Override
    public int compareTo(Player c) {
        return this.name.compareTo(c.name);
    }
    public Player(String name, String lName, int age, int ranking, int points) {
        this.name = name;
        this.lName = lName;
        this.age = age;
        this.ranking = ranking;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
