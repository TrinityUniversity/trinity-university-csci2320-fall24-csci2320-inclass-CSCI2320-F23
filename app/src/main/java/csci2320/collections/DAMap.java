package csci2320.collections;

import java.util.function.Function;

public interface DAMap<K, V> extends Iterable<DATuple<K, V>> {
  // Basic Methods
  V get(K key);
  void set(K key, V value);
  void remove(K key);
  int size();

  // Higher-Order Methods
  <A> DASeq<A> map(Function<DATuple<K, V>, A> f);
  <A> DAMap<K, A> mapValues(Function<V, A> f);
  DAMap<K, V> filter(Function<DATuple<K, V>, Boolean> f);
}
