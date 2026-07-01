import java.util.function.Consumer;

public class Ordercordinator{
    private NotificationService notificationService;
    private PaymentService paymentService;
    private InventoryService inventoryService;

    // TODO: Coordinator bauen und 3x "book" bestellen (2x ok, 1x out of stock)
    public Ordercordinator(NotificationService notificationService, PaymentService paymentService, InventoryService inventoryService) {
        this.notificationService = notificationService;
        this.paymentService = paymentService;
        this.inventoryService = inventoryService;
    }

    public Ordercordinator() {
        notificationService = new NotificationService();
        paymentService = new PaymentService();
        inventoryService = new InventoryService();
    }

    public void bookBook(Book item){
        boolean reserviert = inventoryService.reserve(item);
        if(!reserviert) {
            System.out.println(item + " konnte nicht reserviert werden! 67");
            return;
        }
        paymentService.charge(inventoryService.getPrice(item));
        notificationService.confirm(item);
    }

}
