package ml.anon.model.anonymization;

import lombok.Builder;
import lombok.Data;

/**
 * Created by mirco on 20.05.17.
 */
@Data
@Builder
public class Anonymization {

    private long id;
    private String original;
    private String replacement;
    private Label label;
    private Producer producer;
}
