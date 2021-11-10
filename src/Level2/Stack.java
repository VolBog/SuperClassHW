package Level2;

public class Stack {
    private Object[] objects;


    public Stack(int number) {
        objects = new Object[number];
    }

    public void push(Object obj) {
        for (int i = objects.length - 1; i >= 0; i--) {
            if (objects[i] == null) {
                objects[i] = obj;
                break;
            }
        }
    }

    public Object pop() {
        Object obj = null;
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] != null) {
                obj = objects[i];
                objects[i] = null;
                break;
            }
        }
        return obj;
    }

    public Object peek() {
        Object obj = null;
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] != null) {
                obj = objects[i];
                break;
            }
        }
        return obj;
    }

}
