package ml.anon.anonymization.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import ml.anon.anonymization.model.Label;

/**
 * Created by mirco on 18.08.17.
 */
@Data
@Builder
@EqualsAndHashCode()
public class Replacement {

  private String original;
  private String replacement;
  private Label label;

}
