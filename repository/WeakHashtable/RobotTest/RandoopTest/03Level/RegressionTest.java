package mypackage;
import mypackage.WeakHashtable;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
RegressionTest_it0_livello1_it2_livello2_it3_livello3.class,
RegressionTest_it2_livello2_it3_livello3.class,
RegressionTest_it3_livello3.class
})
public class RegressionTest{ }
