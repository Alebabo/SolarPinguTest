import java.util.function.Consumer;

public class NotificationService implements L02Hard.Notifier {
        public void confirm(Book item){
            System.out.println("accepted " + item.getName());
        }
    }
