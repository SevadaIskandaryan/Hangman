package words;


public class Car extends Word{

    private Type type;
    public Car() {
        this.type = Type.CAR;
    }

    public Car(String name, Level level, Type type) {
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
