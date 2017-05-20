package ml.anon.annotation;

import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;
import de.tudarmstadt.ukp.dkpro.core.opennlp.OpenNlpSegmenter;
import ml.anon.exception.AnnotationException;
import org.apache.uima.UIMAException;
import org.apache.uima.analysis_engine.AnalysisEngineDescription;
import org.apache.uima.fit.factory.JCasFactory;
import org.apache.uima.fit.pipeline.SimplePipeline;
import org.apache.uima.fit.util.JCasUtil;
import org.apache.uima.jcas.JCas;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.apache.uima.fit.factory.AnalysisEngineFactory.createEngineDescription;

/**
 * Created by mirco on 20.05.17.
 */
public class Chunker {

    public List<String> chunk(String input) throws AnnotationException {
        List<String> collect = Collections.emptyList();
        try {
            JCas jCas = null;
            jCas = JCasFactory.createJCas();
            jCas.setDocumentText(input);
            /* TODO improve with POS & Chunks */
            AnalysisEngineDescription tokenize = createEngineDescription(OpenNlpSegmenter.class, OpenNlpSegmenter.PARAM_LANGUAGE, "de");
            //          AnalysisEngineDescription pos = createEngineDescription(OpenNlpPosTagger.class, OpenNlpPosTagger.PARAM_LANGUAGE, "de");
            //         AnalysisEngineDescription chunk = createEngineDescription(TreeTaggerChunker.class, TreeTaggerChunker.PARAM_LANGUAGE, "de");

            SimplePipeline.runPipeline(jCas, tokenize);

            Collection<Token> select = JCasUtil.select(jCas, Token.class);

            collect = select.stream().map(t -> t.getCoveredText()).collect(Collectors.toList());
        } catch (UIMAException e) {
            throw new AnnotationException(e);
        }
        return collect;
    }
}
