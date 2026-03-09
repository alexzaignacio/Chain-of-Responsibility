public class RecyclableWasteHandler extends WasteHandler {
    public RecyclableWasteHandler(WasteHandler successor) {
        super(successor);
    }

    @Override
    public void handle(WasteContainer container) {
        if (container.getWasteType() == WasteType.RECYCLABLE) {
            System.out.println("RecyclableWasteHandler: Disposing " + container + " - Sent to recycling plant.");
            // Additional disposal logic can be added here
        } else if (successor != null) {
            successor.handle(container);
        } else {
            System.out.println("No handler found for " + container);
        }
    }
}