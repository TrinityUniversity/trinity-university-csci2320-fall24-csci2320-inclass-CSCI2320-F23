package csci2320.collections;

import java.util.function.Function;

public interface DASeq<A> extends Iterable<A> {
  // Basic Methods
  A get(int i);
  void set(int i, A a);
  void add(A a);
  void insert(int i, A a);
  void remove(int i);
  int size();

  // Higher-Order Methods
  DASeq<A> map(Function<A, A> f);
  DASeq<A> filter(Function<A, Boolean> f);
}
