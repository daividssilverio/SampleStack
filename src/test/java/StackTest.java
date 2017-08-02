import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class StackTest {
    private final long seed = 123123;

    @Test
    public void push_creates_the_top_when_is_empty() {
        IntStack baseStack = new IntStack();
        baseStack.push(2);

        assertEquals(baseStack.min().intValue(), 2);
        assertEquals(baseStack.size(), 1);
    }

    @Test
    public void pop_removes_the_top_when_there_is_only_one_element() {
        IntStack baseStack = new IntStack();
        baseStack.push(2);
        int top = baseStack.pop();

        assertEquals(baseStack.size(), 0);
        assertEquals(top, 2);
    }

    @Test
    public void push_adds_to_the_top_of_the_stack() {
        Random random = new Random(seed);
        BaseStack baseStack = new BaseStack();

        for (int i = 0; i < 1000; i++) {
            int toStack = random.nextInt();
            baseStack.push(toStack);
            assertEquals(toStack, baseStack.top());
        }

        assertEquals(baseStack.size(), 1000);
    }

    @Test
    public void min_returns_the_minimum_value_of_the_stack() {
        IntStack baseStack = new IntStack();

        baseStack.push(0);
        baseStack.push(-100);
        baseStack.push(100);
        baseStack.push(1);
        baseStack.push(-150);
        baseStack.push(-500);
        baseStack.push(500);

        assertEquals(baseStack.min().intValue(), -500);

        baseStack.pop();
        baseStack.pop();
        assertEquals(baseStack.min().intValue(), -150);

        baseStack.pop();
        assertEquals(baseStack.min().intValue(), -100);

        baseStack.pop();
        baseStack.pop();
        baseStack.pop();

        assertEquals(baseStack.min().intValue(), 0);
    }

}
