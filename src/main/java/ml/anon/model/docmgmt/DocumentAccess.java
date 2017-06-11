package ml.anon.model.docmgmt;

import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import ml.anon.model.anonymization.Anonymization;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public Document updateDocument(String id, List<Anonymization> anon) {
        Map<String, Object> params = new HashMap<>();
        params.put("anonymizations", anon);
        restTemplate.put(IP + "/document/" + id, Document.builder().anonymizations(anon).id(id).originalFileType(FileType.PDF).build(), params);

        return getDocument(id).getBody();
    }
}
