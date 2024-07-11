package csci2320.collections;

import java.util.function.Function;

public interface DASet<A> extends Iterable<A> {
  // Basic Methods
  boolean contains(int i);
  void add(A a);
  int size();

  // Higher-Order Methods
  DASet<A> map(Function<A, A> f);
  DASet<A> filter(Function<A, Boolean> f);
}
