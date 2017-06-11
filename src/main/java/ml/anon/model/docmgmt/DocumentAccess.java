package ml.anon.model.docmgmt;

import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Created by mirco on 11.06.17.
 */
@AllArgsConstructor
@Log
public class DocumentAccess {

    private final String IP = "http://127.0.0.1:9001";

    private RestTemplate restTemplate;

    public ResponseEntity<Document> getDocument(String id) {
        String url = IP + "/document/" + id;
        log.info(url);
        return restTemplate.getForEntity(url, Document.class, new Object[]{});
    }
}
