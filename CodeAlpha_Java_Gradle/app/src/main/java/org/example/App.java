
package org.example;
import org.apache.commons.lang3.StringUtils;

public class App {

    public String getGreeting() {
        return "Welcome to CodeAlpha!";
    }

    public String getProjectInfo() {
        return "Java Application built using Gradle.";
    }

    public static void main(String[] args) {
        App app = new App();

        System.out.println("================================");
        System.out.println("   CODEALPHA DEVOPS PROJECT");
        System.out.println("================================");
        System.out.println(app.getGreeting());
        System.out.println(app.getProjectInfo());
        System.out.println("Build automation: Gradle");
        System.out.println("Java Version: 21");
        System.out.println("Is project name blank? " + StringUtils.isBlank("CodeAlpha"));
        System.out.println("================================");
    }
}
