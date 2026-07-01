import java.util.function.Consumer;

public class NotificationService implements L02Hard.Notifier {
        public void confirm(String item, Consumer<String> consumer){
            consumer.accept(item);
        }
    }
