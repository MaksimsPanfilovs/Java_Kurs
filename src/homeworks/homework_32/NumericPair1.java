package homeworks.homework_32;

public class NumericPair1<T extends Number> {

    private T first;
    private T second;

    public NumericPair1(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public Double sum() {
        return first.doubleValue() + second.doubleValue();
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
}
