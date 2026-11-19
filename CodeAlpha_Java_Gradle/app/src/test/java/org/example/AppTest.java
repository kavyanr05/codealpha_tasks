
package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void appHasAGreeting() {
        App app = new App();

        assertEquals("Welcome to CodeAlpha!", app.getGreeting());
    }

    @Test
    void appHasProjectInfo() {
        App app = new App();

        assertEquals(
            "Java Application built using Gradle.",
            app.getProjectInfo()
        );
    }
}
