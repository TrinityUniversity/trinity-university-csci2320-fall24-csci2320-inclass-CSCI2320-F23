package csci2320.collections;

public interface DAStack<A> {
  void push(A a);
  A pop();
  A peek();
  boolean isEmpty();
}
