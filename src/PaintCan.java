public class PaintCan {
    private String name;
    private double CanSizeInGallons;
    private double price;

    public PaintCan(String name, double CanSizeInGallons, double price) {
        this.name = name;
        this.CanSizeInGallons = CanSizeInGallons;
        this.price = price;
    }

    
    public String getName() {
        return name;
    }

    public double getCanSizeInGallons() {
        return CanSizeInGallons;
    }

    public double getPrice() {
        return price;
    }

    
    public double getPricePerGallon() {
        return price / CanSizeInGallons;
    }
}
