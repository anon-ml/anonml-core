package ml.anon.model.anonymization;

import lombok.Data;

/**
 * Created by mirco on 20.05.17.
 */
@Data
public class Anonymization {

    private long id;
    private String original;
    private String replacement;
    private Label label;
    private Producer producer;
}
