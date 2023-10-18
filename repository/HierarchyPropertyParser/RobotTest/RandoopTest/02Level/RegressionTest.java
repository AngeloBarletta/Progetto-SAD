package mypackage;
import mypackage.HierarchyPropertyParser;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
ErrorTest_it0_livello1_it2_livello2.class,
ErrorTest_it2_livello2.class,
RegressionTest_it0_livello1_it2_livello2.class,
RegressionTest_it2_livello2.class
})
public class RegressionTest{ }
