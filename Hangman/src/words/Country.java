package words;



public class Country extends Word{

    private Type type;
    public Country() {
        this.type = Type.COUNTRY;
    }

    public Country(String name, Level level,Type type) {
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
