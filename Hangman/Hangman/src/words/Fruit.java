package words;


public class Fruit extends Word{

    private Type type;

    public Fruit() {
        this.type = Type.FRUIT;
    }

    @Override
    public Type getClassType() {
        return getType();
    }

    public Fruit(String name, Level level, Type type) {
        super(name, level);
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
