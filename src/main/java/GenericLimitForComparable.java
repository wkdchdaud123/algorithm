public class GenericLimitForComparable<T extends Comparable<T>> implements Comparable<String>{


    @Override
    public int compareTo(String o) {
        return 0;
    }
}
