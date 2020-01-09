/**
 * SimpleSingleton implements Singleton pattern.
 * Static instance is initialized eagerly that's why thread safety guaranteed.
 */
public final class SimpleSingleton {
    /**
     * This is private constructor. Nobody can make instance of class.
     */
    private SimpleSingleton() {}

    /**
     * Static final instance of class.
     */
    private static final SimpleSingleton INSTANCE = new SimpleSingleton();

    /**
     * This method is used for getting instance of class by users.
     *
     * @return instance of the SimpleSingleton.
     */
    public static SimpleSingleton getInstance() { return INSTANCE; }
}
