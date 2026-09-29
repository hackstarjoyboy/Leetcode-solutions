class LRUCache {
class Node{
    int key;
    int value;
    Node prev;
    Node next;
    public Node(int key,int value){
        this.key=key;
        this.value=value;
    }
}

private int capacity;
private Map<Integer,Node>cache;
private Node head;
private Node tail;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        this.cache=new HashMap<>();

        this.head=new Node(-1,-1);
        this.tail=new Node(-1,-1);
        this.head.next=this.tail;
        this.tail.prev=this.head;
    }
    
    public int get(int key) {
        if(!cache.containsKey(key)){
            return -1;
        }
        Node node=cache.get(key);
        removeNode(node);
        addNodeToHead(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            Node node=cache.get(key);
            node.value=value;
            removeNode(node);
            addNodeToHead(node);
        }else{
            if(cache.size()==capacity){
                Node lru=tail.prev;
                cache.remove(lru.key);
                removeNode(lru);
            }
            Node newNode=new Node(key,value);
            cache.put(key,newNode);
            addNodeToHead(newNode);
        }

    }
    private void removeNode(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    private void addNodeToHead(Node node){
        node.next=head.next;
        node.prev=head;
        head.next.prev=node;
        head.next=node;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */