package csci2320.collections;

public interface DAPriorityQueue<A> {
  void enqueue(A a);
  A dequeue();
  A peek();
  boolean isEmpty();
}
