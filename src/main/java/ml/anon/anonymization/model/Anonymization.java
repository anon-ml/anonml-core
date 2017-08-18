package ml.anon.anonymization.model;

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
@ToString(of = {"original", "data"})
@EqualsAndHashCode(of = {"original", "data", "label"})
public class Anonymization {

  @JsonIgnore
  private long id;
  private Replacement data;
  private Producer producer;
}
