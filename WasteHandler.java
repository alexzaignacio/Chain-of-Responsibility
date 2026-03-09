public abstract class WasteHandler {
    protected WasteHandler successor;

    public WasteHandler(WasteHandler successor) {
        this.successor = successor;
    }

    public abstract void handle(WasteContainer container);
}