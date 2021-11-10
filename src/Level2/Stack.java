package Level2;

import java.util.Arrays;

public class Stack {
    private Object[] objects = new Object[10];
    private int index = 0;

    public Stack() {
    }

    public Stack(int number) {
        objects = new Object[number];
    }

    public void push(Object obj) {
        objects[index] = obj;
        index++;
        if(index != objects.length){
            expand();
        }
    }

    public Object pop() {
        if(index == 0) {
            return null;
        }
        Object obj = objects[index - 1];
        objects[index - 1] = null;
        if(index != 0) {
            index--;
        }
        return obj;
    }

    public Object peek() {
        if(index == 0) {
            return null;
        }
        return objects[index - 1];
    }

    public void expand(){
        objects = Arrays.copyOf(objects, objects.length*2);
    }

}
