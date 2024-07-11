package csci2320.collections;

public class DATuple<A, B> {
  private final A a;
  private final B b;

  DATuple(A a, B b) {
    this.a = a;
    this.b = b;
  }

  public A first() {
    return a;
  }

  public B second() {
    return b;
  }
}
