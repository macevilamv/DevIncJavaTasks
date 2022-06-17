package by.incubator.task5;

public class Monitoring {
    public static void main(String[] args) {

        MonitoringSystem indicators = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Monitoring of general indicators has started!");
            }
        };

        MonitoringSystem bugTracking = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Bug tracking monitoring has started!");
            }
        };

        MonitoringSystem security = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Security monitoring has started");
            }
        };

        indicators.startMonitoring();
        bugTracking.startMonitoring();
        security.startMonitoring();
    }
}

interface MonitoringSystem {
    void startMonitoring();
}