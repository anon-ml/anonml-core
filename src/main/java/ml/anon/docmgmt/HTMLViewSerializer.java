package ml.anon.docmgmt;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.util.Base64;

/**
 * Created by mirco on 20.05.17.
 */
public class HTMLViewSerializer extends JsonSerializer<String> {
    @Override
    public void serialize(String s, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
        System.err.println("HUHUJUJU");
        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField("htmlView", "wat" + Base64.getEncoder().encodeToString(s.getBytes()));
        jsonGenerator.writeEndObject();

    }
}
