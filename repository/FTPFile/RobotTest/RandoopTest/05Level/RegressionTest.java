package mypackage;
import mypackage.FTPFile;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
RegressionTest_it0_livello1_it1_livello2_it3_livello3_it4_livello4_it6_livello5.class,
RegressionTest_it1_livello2_it3_livello3_it4_livello4_it6_livello5.class,
RegressionTest_it3_livello3_it4_livello4_it6_livello5.class,
RegressionTest_it4_livello4_it6_livello5.class,
RegressionTest_it6_livello5.class
})
public class RegressionTest{ }
