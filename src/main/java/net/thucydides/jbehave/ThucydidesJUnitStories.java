package net.thucydides.jbehave;

import net.serenitybdd.jbehave.SerenityStories;
import net.serenitybdd.jbehave.runners.SerenityReportingRunner;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.webdriver.DriverConfiguration;
import org.junit.runner.RunWith;

/**
 * @deprecated Use SerenityStories instead
 *
 * A JUnit-runnable test case designed to run a set of ThucydidesWebdriverIntegration-enabled JBehave stories in a given package.
 * By default, it will look for *.story files on the classpath, and steps in or underneath the current package.
 * You can redefine these constraints as follows:
 */
@Deprecated
@RunWith(SerenityReportingRunner.class)
public class ThucydidesJUnitStories extends SerenityStories {

    public ThucydidesJUnitStories() {
        super();
    }

    protected ThucydidesJUnitStories(EnvironmentVariables environmentVariables) {
        super(environmentVariables);
    }

    protected ThucydidesJUnitStories(DriverConfiguration configuration) {
        super(configuration);
    }

    public ThucydidesConfigurationBuilder runThucydides() {
        return super.runSerenity();
    }
}
