package ml.anon.resource;

import ml.anon.exception.BadRequestException;

/**
 * Created by mirco on 16.08.17.
 */
public interface Delete {

  void delete(String id) throws BadRequestException;

}
