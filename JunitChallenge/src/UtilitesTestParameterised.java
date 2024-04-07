import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UtilitesTestParameterised {




    @ParameterizedTest
    @ValueSource(strings = {"AABCDDEFF", "ABCABDEF"})

    void removePairs_parameterised(String input) {


    }


}
