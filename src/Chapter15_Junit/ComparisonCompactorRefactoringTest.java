package Chapter15_Junit;

import junit.framework.ComparisonCompactor;
import junit.framework.TestCase;

public class ComparisonCompactorRefactoringTest extends TestCase {
    public void testMessage() {
        String failure = new ComparisonCompactor(0 , "b" , "c")
                .compact("a");
        assertTrue("a expected:<[b]> but was:<[c]>".equals(failure));
    }

    public void testStartSame() {
        String failure = new ComparisonCompactor(1 , "ba" , "bc")
                .compact(null);
        assertEquals("expected:<b[a]> but was:<b[c]>" , failure);
    }

    public void testEndSame() {
        String failure = new ComparisonCompactor(1 , "ab" , "cb")
                .compact(null);
        assertEquals("expected:<[a]b> but was:<[c]b>" , failure);
    }
}
