/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import org.junit.Test;
import static org.junit.Assert.*;

public class JSLinterTest {
    @Test public void testAppHasAGreeting() {
        JSLinter classUnderTest = new JSLinter();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

    @Test public void  lint(){
        lint();

    }
}
