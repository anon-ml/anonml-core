package ml.anon.resource;

import ml.anon.exception.BadRequestException;

/**
 * Created by mirco on 16.08.17.
 */
public interface Update<T> {

  T update(String id, T instance) throws BadRequestException;

}
