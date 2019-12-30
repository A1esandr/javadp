public final class SimpleSingleton {
    private SimpleSingleton() {}

    private static final SimpleSingleton INSTANCE = new SimpleSingleton();

    public static SimpleSingleton getInstance() { return INSTANCE; }
}
