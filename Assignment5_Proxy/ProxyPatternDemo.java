// ProxyPatternDemo.java
public class ProxyPatternDemo {
    public static void main(String[] args) {
        // Create a real warehouse
        RealWarehouse realWarehouse = new RealWarehouse();

        // Create a proxy warehouse
        WarehouseProxy warehouseProxy = new WarehouseProxy("Global Proxy Warehouse");

        // Set up an online retail store with the proxy warehouse
        OnlineRetailStore retailStore = new OnlineRetailStore(warehouseProxy);

        // Process orders through the retail store
        retailStore.processOrder("ProductA", "CustomerA");
        retailStore.processOrder("ProductB", "CustomerB");
    }
}
