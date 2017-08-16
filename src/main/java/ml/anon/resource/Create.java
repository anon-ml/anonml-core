package ml.anon.resource;

/**
 * Created by mirco on 16.08.17.
 */
public interface Create<T> {

  /**
   * Creates a new instance and returns it
   */
  T create(T instance);

}
