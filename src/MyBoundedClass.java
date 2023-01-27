public class MyBoundedClass <T extends Number> {
    T value;

    MyBoundedClass(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
