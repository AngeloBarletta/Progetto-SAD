package mypackage;
import mypackage.FTPFile;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
RegressionTest_it0_livello1_it1_livello2.class,
RegressionTest_it1_livello2.class
})
public class RegressionTest{ }
