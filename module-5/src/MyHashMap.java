import java.util.Iterator;
import java.util.LinkedList;

public class MyHashMap<K, V> {
    private LinkedList<Entry<K, V>>[] buckets;

    private static class Entry<K, V> {
        K key;
        V value;

        Entry(
                K key,
                V value
        ) {
            this.key = key;
            this.value = value;
        }
    }

    public MyHashMap() {
        this.buckets = (LinkedList<Entry<K, V>>[]) new LinkedList[8];
    }

    private int getBucketIndex(K key) {
        int index = key.hashCode() % buckets.length;
        if (index < 0) {
            return -index;
        }
        return index;
    }

    public void put(
            K key,
            V value
    ) {
        int index = getBucketIndex(key);

        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }

        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }

        buckets[index].add(new Entry<>(key, value));
    }

    public V get(K key) {
        int index = getBucketIndex(key);
        if (buckets[index] == null) {
            return null;
        }
        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    public void remove(K key) {
        int index = getBucketIndex(key);
        if (buckets[index] == null) {
            return;
        }
        Iterator<Entry<K, V>> iterator = buckets[index].iterator();
        while (iterator.hasNext()) {
            Entry<K, V> entry = iterator.next();
            if (entry.key.equals(key)) {
                iterator.remove();
                return;
            }
        }
    }

}
