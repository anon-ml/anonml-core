package ml.anon.resource;

import ml.anon.exception.BadRequestException;

/**
 * Created by mirco on 16.08.17.
 */
public interface Create<T> {

  /**
   * Creates a new instance and returns it
   */
  T create(T instance) throws BadRequestException;

}
