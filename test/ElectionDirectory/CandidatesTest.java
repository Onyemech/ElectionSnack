package ElectionDirectory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CandidatesTest {
    @Test
    public void testThat_candidatesCanRegister() {
        Candidates candidate = new Candidates("Tinubu", "Adekayode", 79,"nsukka", "he_goat","APGA");
        assertEquals("Tinubu Adekayode", candidate.getCandidateFullName());
        assertEquals(79,candidate.getAge());
    }

    @Test
    public void testThat_candidate_with_invalid_ageCannotRegister() {
        Candidates candidate = new Candidates("Smith", "Adam",16,"california", "male", "iswell");
        assertThrows(IllegalArgumentException.class, () -> candidate.setAge(16));
    }

    @Test
    public void testThat_candidate_with_invalidGender_recievesValidError() {
        Candidates candidates = new Candidates("Juke","Gravive",27,"address", "female", "lp");
        assertThrows(IllegalArgumentException.class, () -> candidates.setGender("she-chicken"));
    }

    @Test
    public void testThat_candidatePartyNameCannotStartWithANumber() {
        Candidates candidates = new Candidates("OBI","peter",56,"arowojobe", "male", "lp");
        assertThrows(IllegalArgumentException.class,()-> candidates.setPartyName("12PDP"));
    }
}
