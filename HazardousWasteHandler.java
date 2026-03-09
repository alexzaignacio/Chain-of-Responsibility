public class HazardousWasteHandler extends WasteHandler {
    public HazardousWasteHandler(WasteHandler successor) {
        super(successor);
    }

    @Override
    public void handle(WasteContainer container) {
        if (container.getWasteType() == WasteType.HAZARDOUS) {
            System.out.println("HazardousWasteHandler: Disposing " + container + " - Sent to specialized treatment center.");
            // Additional disposal logic can be added here
        } else if (successor != null) {
            successor.handle(container);
        } else {
            System.out.println("No handler found for " + container);
        }
    }
}