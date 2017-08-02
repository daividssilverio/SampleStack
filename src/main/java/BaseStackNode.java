public class BaseStackNode<T extends Comparable<? super T>> {
    private final T value;
    private T minValue;
    private T maxValue;

    private BaseStackNode previous;

    public BaseStackNode(T value) {
        this.value = value;
        this.minValue = value;
        this.maxValue = value;
    }

    public T getValue() {
        return value;
    }

    public BaseStackNode getPrevious() {
        return previous;
    }

    public void setPrevious(BaseStackNode previous) {
        this.previous = previous;
    }

    public T getMinValue() {
        return minValue;
    }

    public void setMinValue(T minValue) {
        this.minValue = minValue;
    }

    public T getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(T maxValue) {
        this.maxValue = maxValue;
    }
}
