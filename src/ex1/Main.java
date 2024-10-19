package ex1;

public class Main {
    public static void main(String[] args) {
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        configManager.loadSettings("config.txt");

        String someSetting = configManager.getSetting("someKey");
        System.out.println("Setting someKey: " + someSetting);

        configManager.setSetting("someKey", "newValue");
        System.out.println("Updated someKey: " + configManager.getSetting("someKey"));

        configManager.saveSettings("config.txt");

        Runnable task = () -> {
            ConfigurationManager instance = ConfigurationManager.getInstance();
            String settingValue = instance.getSetting("someKey");
            System.out.println(Thread.currentThread().getName() + ": " + settingValue);
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
