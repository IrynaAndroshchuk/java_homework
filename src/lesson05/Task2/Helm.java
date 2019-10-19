package lesson05.Task2;

public class Helm {
    private int size;

    public Helm(int size) {
        this.size = size;
    }

    public void less(int times) {
        this.size = this.size / times;

    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Helm{" +
                "size=" + size +
                '}';
    }
}