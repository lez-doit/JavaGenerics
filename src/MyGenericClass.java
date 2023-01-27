public class MyGenericClass <T>{
    T value;

    MyGenericClass(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
