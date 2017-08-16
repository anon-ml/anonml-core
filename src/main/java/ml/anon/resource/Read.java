package ml.anon.resource;

import java.util.List;

/**
 * Created by mirco on 16.08.17.
 */
public interface Read<T> {

  T findById(String id);

  List<T> findAll();

}
