package words;



public class City extends Word{

    private Type type;
    public City() {
        this.type = Type.CITY;
    }

    public City(String name, Level level,Type type) {
        super(name, level);
        this.type = type;
    }

    @Override
    public Type getClassType() {
        return getType();
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
