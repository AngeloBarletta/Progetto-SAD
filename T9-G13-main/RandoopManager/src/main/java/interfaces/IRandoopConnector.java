package interfaces;

import exceptions.RandoopException;

public interface IRandoopConnector {
    public void generateRandoopTest(String className, int maxNumberLevel, IObserver o) throws RandoopException;

}
