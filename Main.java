public class Main {
    public static void main(String[] args) {
        // Initialize the chain: Organic -> Recyclable -> Hazardous (no successor for last)
        WasteHandler handlerChain = new OrganicWasteHandler(
            new RecyclableWasteHandler(
                new HazardousWasteHandler(null)
            )
        );

        // Test containers
        WasteContainer organicContainer = new WasteContainer(50.0, WasteType.ORGANIC);
        WasteContainer recyclableContainer = new WasteContainer(30.0, WasteType.RECYCLABLE);
        WasteContainer hazardousContainer = new WasteContainer(10.0, WasteType.HAZARDOUS);

        System.out.println("Processing organic container:");
        handlerChain.handle(organicContainer);

        System.out.println("\nProcessing recyclable container:");
        handlerChain.handle(recyclableContainer);

        System.out.println("\nProcessing hazardous container:");
        handlerChain.handle(hazardousContainer);

        // Validation: If no handler (simulate by a container that doesn't match any, but since all types are covered, no "no handler" should trigger.
        // To test fallback, you could add a new WasteType, but for demo, it's covered.
    }
}