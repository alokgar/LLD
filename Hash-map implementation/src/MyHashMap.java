public class MyHashMap <K, V> {
    private static final int DEFAULT_SIZE = 1 << 4; // 16
    private static final int MAX_SIZE = 1 << 30;
    private int tableSize;

    private Entry[] hashList;
    private class Entry <K, V> {
        K key;
        V value;
        Entry next;
        Entry(K key, V value){
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    MyHashMap(int size){
        int optimalSize = getOptimalSizeFor(size);
        tableSize = optimalSize;
        hashList = new Entry[optimalSize];
    }

    // setter method for myHashMap
    private void set(K key, V value){
        int hashCodeIndex = getHashIndex(key);
        Entry currentNode = hashList[hashCodeIndex];
        if(currentNode == null){
            hashList[hashCodeIndex] = new Entry(key, value);
        }
        else{
            Entry previousNode = null;
            while(currentNode != null){
                if(currentNode.key.equals(key)){
                    currentNode.value = value;
                    return;
                }
                else{
                    previousNode = currentNode;
                    currentNode = currentNode.next;
                }
            }
            previousNode.next = new Entry(key, value);
        }
    }

    // getter method for myHashMap
    private V get(K key){
        int hashCodeIndex = getHashIndex(key);
        Entry currentNode = hashList[hashCodeIndex];
        while(currentNode != null){
            if(currentNode.key.equals(key)){
                return (V)currentNode.value;
            }
            else{
                currentNode = currentNode.next;
            }
        }
        return null;
    }

    // Helper functions
    private int getOptimalSizeFor(int size){
        size -= 1;
        size |= size >>> 1;
        size |= size >> 2;
        size |= size >> 4;
        size |= size >> 8;
        size |= size >> 16;
        return ( size < 0 ) ? 1 : ( ( size >= MAX_SIZE ) ? MAX_SIZE : size + 1 );
    }

    private int getHashIndex(K key){
        return key.hashCode() % tableSize;
    }

    public static void main(String[] args) {
        System.out.println("We are implementing Hash-map");
        MyHashMap<Integer, String> map = new MyHashMap<Integer, String>(20);
        map.set(1324, "Alok");
        map.set(2768, "Aman");
        map.set(4500, "Praveen");
        System.out.println(map.get(4500));
    }
}