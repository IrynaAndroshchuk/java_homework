package Lesson18_Core_Inner_classes;

public class Collection {
    Integer[] number;

    public Collection(Integer[] number) {
        this.number = number;
    }

    class FirstIterator implements Iterator {
        int index = -1;

        @Override
        public boolean hasNext() {
            return number.length > index + 1;
        }

        @Override
        public int next() {
            index++;
            if (index % 2 != 0) {
                return 0;
            }

            return number[index];
        }
    }

    public void print() {
        Collection.FirstIterator numbers = this.new FirstIterator();
        while (numbers.hasNext()) {
            int number = numbers.next();
            System.out.println(number);
        }
    }

    class SecondIterator implements Iterator {
        int index = -2;

        @Override
        public boolean hasNext() {
            return number.length > index + 2;
        }

        @Override
        public int next() {
            index += 2;
            return number[index];
        }
    }

    public void printTask2() {
        Collection.SecondIterator numbers = this.new SecondIterator();
        for (int start = 0, end = number.length - 1;
             start <= end;
             start++, end--) {
            int temp = number[start];
            number[start] = number[end];
            number[end] = temp;
        }

        while (numbers.hasNext()) {
            int number = numbers.next();
            System.out.println(number);
        }
    }
}