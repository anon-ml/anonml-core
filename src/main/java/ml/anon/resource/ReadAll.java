package ml.anon.resource;

import ml.anon.exception.BadRequestException;

import java.util.List;

public interface ReadAll<T> {
    List<T> findAll(int page) throws BadRequestException;
}
