/**
 * Secure way for creating lazy initialized singleton object in Java.
 */
public final class InitializeOnDemand {
    private InitializeOnDemand() {}

    public static InitializeOnDemand getInstance() {
        return Holder.INSTANCE;
    }

    /**
     * Keeps and provides lazy-loaded instance of singleton
     */
    private static class Holder {
        private static final InitializeOnDemand INSTANCE = new InitializeOnDemand();
    }
}
