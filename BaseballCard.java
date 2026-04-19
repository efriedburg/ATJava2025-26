public class BaseballCard {
    String name;
    int year;

    public BaseballCard(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Baseball Card [Player = " + name + ", Year = " + year + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!(obj instanceof BaseballCard)) {
            return false;
        }

        BaseballCard other = (BaseballCard) obj;
        return this.name.equals(other.name) && this.year == other.year;
    }
}