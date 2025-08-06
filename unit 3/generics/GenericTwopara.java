class Pair<K, V> {
    private K key;
    private V value;

    // Constructor
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // Getter for key
    public K getKey() {
        return key;
    }

    // Getter for value
    public V getValue() {
        return value;
    }
}

public class GenericTwopara {
    public static void main(String[] args) {
        // Pair of String and Integer
        Pair<String, Integer> agePair = new Pair<>("Alice", 25);
        System.out.println("Key: " + agePair.getKey() + ", Value: " + agePair.getValue());

        // Pair of Integer and Double
        Pair<Integer, Double> pointPair = new Pair<>(1, 99.9);
        System.out.println("Key: " + pointPair.getKey() + ", Value: " + pointPair.getValue());
    }
}