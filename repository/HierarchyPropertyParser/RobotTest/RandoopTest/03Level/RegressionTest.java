package mypackage;
import mypackage.HierarchyPropertyParser;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
ErrorTest_it0_livello1_it2_livello2_it6_livello3.class,
ErrorTest_it2_livello2_it6_livello3.class,
ErrorTest_it6_livello3.class,
RegressionTest_it0_livello1_it2_livello2_it6_livello3.class,
RegressionTest_it2_livello2_it6_livello3.class,
RegressionTest_it6_livello3.class
})
public class RegressionTest{ }
