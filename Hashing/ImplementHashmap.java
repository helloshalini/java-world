import java.util.*;

// import javax.sound.sampled.LineListener;

public class ImplementHashmap {
    static class HashMap <K, V>{
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.n = 0;
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i = 0 ;i<4 ; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;

            for(int i = 0 ; i<ll.size() ; i++){
                Node node = ll.get(i);
                if(node.key == key){
                    return di;
                }
                di++;
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node> oldBuck[] = buckets;
            buckets = new LinkedList[N*2];
            N = 2*N;
            for(int i = 0 ; i<buckets.length ;i++) {
                buckets[i] = new LinkedList<>();
            }

            // node -> add in bucket
            for(int i = 0 ; i<oldBuck.length ; i++){
                LinkedList<Node> ll = oldBuck[i];
                for(int j = 0 ; j<ll.size() ; j++){
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }

        }

        public void put(K key, V value) {
            int bi = hashFunction(key); // 0 to 3
            int di = searchInLL(key, bi);

            if(di != -1){
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (double)n/N;
            if(lambda > 2.0) {
                rehash();
            }
        }

        public boolean conatinsKey(K key) {
            int bi = hashFunction(key); // 0 to 3
            int di = searchInLL(key, bi);

            if(di != -1){
                return true;
            } else {
                return false;
            }
        }

        public V remove(K key) {
            int bi = hashFunction(key); // 0 to 3
            int di = searchInLL(key, bi);

            if(di != -1){
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            } else {
                return null;
            }
        }

        public V get(K key) {
            int bi = hashFunction(key); // 0 to 3
            int di = searchInLL(key, bi);

            if(di != -1){
                Node node = buckets[bi].get(di);
                return node.value;
            } else {
                return null;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for(int i = 0 ; i<buckets.length ; i++) {
                LinkedList<Node> ll = buckets[i];
                for(Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n == 0;
        }

    }
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 98);
        hm.put("US", 90);
        hm.put("Uk", 200);
        hm.put("Korea", 100);

        ArrayList<String> keys = hm.keySet();
        for(String key : keys) {
            System.out.println(key);
        }

        System.out.println(hm.get("India"));
        System.out.println(hm.remove("India"));
        System.out.println(hm.get("India"));

    }
}
