package other;

/**
 * @author sauce
 * @since 2019-04-16
 */
public final class HMap<K, V> {
    private Node<K, V>[] table;
    public void put(K key, V value) {
        int h = hash(key);
        Node<K, V> newNode;
//        初始化 数组
        if (table == null || table.length == 0) {
            resize();
        }
        Node<K, V> tmp = table[h];
        newNode = new Node<>(key, value, null);
        if (tmp == null) {
            table[h] = newNode;
        } else {
            Node<K, V> last = tmp;
            do {
                if (last.next.key.equals(key)) {
                    last.next.value = value;
                    break;
                }
                last = last.next;

            } while (last.next != null);

            last.next = newNode;
        }

    }

    public V get(K key) {
        int h = hash(key);
        Node<K, V> tmp = table[h];
        if (tmp != null) {

        }
        return null;
    }

    private void resize() {

    }

    //总之 能尽量保证唯一性就OK了
    private static int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }

    private class Node<K, V> {
        private K key;
        private V value;
        private Node<K, V> next;

        public Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public Node<K, V> getNext() {
            return next;
        }

        public void setNext(Node<K, V> next) {
            this.next = next;
        }
    }
}
