public interface Collection<T extends Object>  {

    void add(T element);

    T remove(int index);

    T get(int index);
}
