package composite;

public class LinkedList<T>{

      public class Node{
            public T data;
            public Node prev;
            public Node next;

            public Node(T data, Node next){
                  this.data = data;
                  this.next = next;
            }
      }

      private int size;
      public Node first;
      private Node last;

      public LinkedList(){
            size = 0;
            first = null;
            last = null;
      }

      public void add(T input){
            if (size != 0) {
                  last.next = new Node(input, null);
                  last = last.next;
            }
            else{
                  last = new Node(input, null);
                  first = last;
            }
            size++;
      }

      public boolean remove(T item){
            Node toDelete = search(item);
            if(toDelete != null){
                  if (toDelete == first) {
                        first = first.next;
                  }
                  else if(toDelete == last){
                        toDelete.prev.next = null;
                  }
                  else{
                        toDelete = toDelete.next;
                  }
                  size--;
                  return true;
            }
            else{
                  System.out.println("Item to remove in LinkedList not found!");
                  return false;
            }
      }

      private Node search(T input){
            Node curr = first;
            while(curr != null){
                  if(curr.data == input){
                        return curr;
                  }
                  else{
                        curr = curr.next;
                  }
            }
            return null;
      }
}
