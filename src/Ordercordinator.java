public class Ordercordinator{
    private NotificationService notificationService;
    private PaymentService paymentService;
    private InventoryService inventoryService;

    public Ordercordinator(NotificationService notificationService, PaymentService paymentService, InventoryService inventoryService) {
        this.notificationService = notificationService;
        this.paymentService = paymentService;
        this.inventoryService = inventoryService;
    }

}
