import java.util.EmptyStackException;

public class BaseStack<T extends Comparable<? super T>> {
    private int size = 0;
    private BaseStackNode<T> top;

    public void push(T num) {
        if (top == null) {
            createTop(num);
        } else {
            addNewTop(num);
        }
    }

    public T pop() {
        if (size == 0) throw new EmptyStackException();

        T topValue = top.getValue();
        top = top.getPrevious();
        size--;
        return topValue;
    }

    public T top() {
        if (size == 0) throw new EmptyStackException();

        return top.getValue();
    }

    public T min() {
        if (size == 0) throw new EmptyStackException();

        return top.getMinValue();
    }

    private void addNewTop(T num) {
        BaseStackNode<T> newTop = new BaseStackNode<>(num);
        if (newTop.getValue().compareTo(top.getMinValue()) > 0) {
            newTop.setMinValue(top.getMinValue());
        }
        if (newTop.getValue().compareTo(top.getMaxValue()) < 0) {
            newTop.setMaxValue(top.getMaxValue());
        }
        newTop.setPrevious(top);
        top = newTop;
        this.size++;
    }

    private void createTop(T num) {
        top = new BaseStackNode<>(num);
        this.size = 1;
    }

    public int size() {
        return this.size;
    }
}
