package fi.csc.virta.julkaisut.factory;

import org.glassfish.hk2.api.Factory;

/**
 * Mock instance factory for api tests.
 */
public class MockInstanceFactory<T> implements Factory<T> {

    private T instance;

    public MockInstanceFactory(T instance) {
        this.instance = instance;
    }

    @Override
    public T provide() {
        return instance;
    }

    @Override
    public void dispose(T t) {
        instance = null;
    }
}
