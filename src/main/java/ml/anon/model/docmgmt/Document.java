package ml.anon.model.docmgmt;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import ml.anon.model.anonymization.Anonymization;
import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * Representation of a document.
 *
 * @author mirco
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@org.springframework.data.mongodb.core.mapping.Document(collection = "documents")
public class Document {

    private final static int MB_5 = 1024 * 1024 * 5;

    @Id
    private String id;


    private String text;

    @JsonIgnore

    private byte[] file;

    @NonNull

    private List<String> tokenized;
    @NonNull

    private List<Anonymization> anonymizations;


}
