package words;



public class Animal extends Word{

    private Type type;
    public Animal() {
        this.type = Type.ANIMAL;
    }

    public Animal(String name, Level level, Type type) {
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
