package ml.anon.model.anonymization;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Created by mirco on 20.05.17.
 */
@Data
@Builder
@ToString(of = {"original", "replacement"})
@EqualsAndHashCode(of = {"original", "replacement", "label"})
public class Anonymization {

    @JsonIgnore
    private long id;
    private String original;
    private String replacement;
    private Label label;
    private Producer producer;
}
