package mypackage;
import mypackage.ImprovedTokenizer;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
ErrorTest_it0_livello1_it1_livello2.class,
ErrorTest_it1_livello2.class,
RegressionTest_it0_livello1_it1_livello2.class,
RegressionTest_it1_livello2.class
})
public class RegressionTest{ }
