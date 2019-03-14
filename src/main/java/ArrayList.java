public class ArrayList<T extends Object> implements Collection<T> {

    private static int DEFAULT_CAPACITY = 10;

    private int size = 0;

    private Object[] elements;

    ArrayList() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    public int size() {
        return this.size;
    }

    public void add(T element) {
        this.elements[size++] = element;
    }

    public T remove(int index) {
        rangeCheck(index);

        T element = this.get(index);
        this.elements[index] = null;
        this.size--;

        return element;
    }

    public T get(int index) {
        rangeCheck(index);

        return (T) this.elements[index];
    }

    private void rangeCheck(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    private void grow() {
    }

}
