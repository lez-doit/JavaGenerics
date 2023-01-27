import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        MyGenericClass<Integer> myInt = new MyGenericClass<>(1);
        MyGenericClass<Double> myDouble = new MyGenericClass<>(3.14);
        MyGenericClass<Character> myChar = new MyGenericClass<>('@');
        MyGenericClass<String> myString = new MyGenericClass<>("Hello");

        MyBoundedClass<Integer> myBounded = new MyBoundedClass<>(1); //can be only numbers

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());
    }
}