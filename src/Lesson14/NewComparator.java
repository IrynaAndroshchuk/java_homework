package Lesson14;

import java.util.Comparator;

public class NewComparator implements Comparator<Deputy> {
    public int compare(Deputy dep1, Deputy dep2) {

        return -Integer.compare(dep1.getSizeOfBribes(), dep2.getSizeOfBribes());
    }
}
