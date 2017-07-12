package ml.anon.model.anonymization;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mirco on 20.05.17.
 */
public enum Label {
    PERSON, LOCATION, ORGANIZATION, MISC, LICENCE_PLATE, E_MAIL, TELEPHONE_NUMBER, URL, IP, BIRTHDATE, IBAN, CLIENT_NUMBER, UNKNOWN;

    public static Label getOrDefault(String label, Label def) {
        try {
            return Label.valueOf(label);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return def;
        }
    }

    public static List<Label> getAll() {
        return Arrays.asList(Label.values());
    }
}
