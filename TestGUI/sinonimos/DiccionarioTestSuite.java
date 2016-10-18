package sinonimos;
/**
 * En este caso al Fixture lo incluimos en una clase aparte lo que nos permitiria
 * eventualmente tratar diferentes incializaciones desde dicha clase sin tocar los
 * testcases.
 *
 * */

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ diccionarioPR5Test2.class, diccionarioPR5Test1.class })
public class DiccionarioTestSuite
{
}
