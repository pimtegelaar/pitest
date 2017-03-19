package org.pitest.coverage;

import java.util.List;

public class IncludeInCoverageFilter {

    private final List<String> mainClasses;

    private final List<String> testClasses;

    public IncludeInCoverageFilter(List<String> mainClasses, List<String> testClasses) {
        this.mainClasses = mainClasses;
        this.testClasses = testClasses;
    }

    public List<String> getMainClasses() {
        return mainClasses;
    }

    public List<String> getTestClasses() {
        return testClasses;
    }
}
