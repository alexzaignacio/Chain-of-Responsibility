public class OrganicWasteHandler extends WasteHandler {
    public OrganicWasteHandler(WasteHandler successor) {
        super(successor);
    }

    @Override
    public void handle(WasteContainer container) {
        if (container.getWasteType() == WasteType.ORGANIC) {
            System.out.println("OrganicWasteHandler: Disposing " + container + " - Sent to composting facility.");
            // Additional disposal logic can be added here
        } else if (successor != null) {
            successor.handle(container);
        } else {
            System.out.println("No handler found for " + container);
        }
    }
}