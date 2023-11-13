// WarehouseProxy.java
public class WarehouseProxy implements Warehouse {
    private RealWarehouse realWarehouse;
    private String location;

    public WarehouseProxy(String location) {
        this.location = location;
    }

    private RealWarehouse getRealWarehouse() {
        if (realWarehouse == null) {
            realWarehouse = new RealWarehouse();
        }
        return realWarehouse;
    }

    @Override
    public void shipProduct(String product, String destination) {
        System.out.println("Warehouse Proxy handling the request.");
        System.out.println("Checking inventory at " + location);

        // Additional proxy logic can be added here, such as logging, access control, etc.

        getRealWarehouse().shipProduct(product, destination);
    }
}
