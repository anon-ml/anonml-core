import com.google.common.collect.Lists;
import ml.anon.annotation.Chunker;
import ml.anon.exception.AnnotationException;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by mirco on 20.05.17.
 */
public class ChunkerTest {

    Chunker chunker = new Chunker();

    @Test
    public void simple() throws AnnotationException {
        String input = "IM NAMEN DES VOLKES";
        List<String> expected = Lists.newArrayList("IM", "NAMEN", "DES", "VOLKES");
        List<String> tokenize = chunker.chunk(input);

        assertThat(tokenize, is(expected));
    }

    @Test
    public void paragraph() throws AnnotationException {
        String input = "Die Kostenentscheidung folgt dem Unterliegen der Kläger in dem Maße, dass bezüglich zweier von drei angegriffenen Verwaltungsakten die Klage keinen Erfolg hatte.";
        List<String> expected = Lists.newArrayList("Die", "Kostenentscheidung", "folgt", "dem", "Unterliegen", "der", "Kläger", "in",
                "dem", "Maße", ",", "dass", "bezüglich", "zweier", "von", "drei", "angegriffenen", "Verwaltungsakten", "die", "Klage", "keinen", "Erfolg", "hatte", ".");
        List<String> tokenize = chunker.chunk(input);
        assertThat(tokenize, is(expected));
    }
}
