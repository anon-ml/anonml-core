package ml.anon.exception;

import org.apache.uima.UIMAException;

/**
 * Created by mirco on 20.05.17.
 */
public class AnnotationException extends Exception {
    public AnnotationException(UIMAException e) {
        initCause(e);
    }
}
