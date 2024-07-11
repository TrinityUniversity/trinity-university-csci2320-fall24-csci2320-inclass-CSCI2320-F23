package csci2320.collections;

public interface DAQueue<A> {
  void enqueue(A a);
  A dequeue();
  A peek();
  boolean isEmpty();
}
