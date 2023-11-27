// Q6.	Develop the following using the concept of inheritance and polymorphism:

// Scenario: An advertising campaign consists of a set of advertisements. Adverts can be of several types, for example, a roadside Hoarding, a Newspaper ad, TV commercial, or Poster. Each type of advert has a cost associated with it: a fixed fee to cover materials, production staff and media costs, and
 

// variable costs for buying advertising time and space. An advertising campaign consists of one or more advert events:
// •	A Hoarding for a poster is hired for a number of days. The standard cost is £H per hoarding. An additional surcharge of 50% is charged for prime locations.
// •	Newspaper: The cost is £N per column cm.
// •	TV commercial: Air time is sold by the seconds. The standard cost is £T per second, which doubles at peak times.

class Advertisement {
    protected String type;
    protected double cost;

    public Advertisement(String type, double cost) {
        this.type = type;
        this.cost = cost;
    }

    public double calculateCost() {
        return cost;
    }

    public String getType() {
        return type;
    }

    public String toString() {
        return "Type: " + type + ", Cost: £" + calculateCost();
    }
}

class HoardingAdvertisement extends Advertisement {
    int numberOfDays;
    boolean primeLocation;

    public HoardingAdvertisement(double baseCost, int numberOfDays, boolean primeLocation) {
        super("Hoarding", baseCost);
        this.numberOfDays = numberOfDays;
        this.primeLocation = primeLocation;
    }

    public double calculateCost() {
        double totalCost = super.calculateCost() * numberOfDays;
        if (primeLocation) {
            totalCost *= 1.5; // 50% surcharge for prime locations
        }
        return totalCost;
    }
}

class NewspaperAdvertisement extends Advertisement {
    double columnCm;

    public NewspaperAdvertisement(double costPerColumnCm, double columnCm) {
        super("Newspaper", costPerColumnCm);
        this.columnCm = columnCm;
    }

    public double calculateCost() {
        return super.calculateCost() * columnCm;
    }
}

class TVAdvertisement extends Advertisement {
    private double seconds;
    private boolean isPeakTime;

    public TVAdvertisement(double costPerSecond, double seconds, boolean isPeakTime) {
        super("TV Commercial", costPerSecond);
        this.seconds = seconds;
        this.isPeakTime = isPeakTime;
    }

    public double calculateCost() {
        double totalCost = super.calculateCost() * seconds;
        if (isPeakTime) {
            totalCost *= 2; // Double the cost at peak times
        }
        return totalCost;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Advertisement hoardingAd = new HoardingAdvertisement(100, 7, true);
        Advertisement newspaperAd = new NewspaperAdvertisement(5, 200);
        Advertisement tvAd = new TVAdvertisement(2, 60, true);

        System.out.println(hoardingAd);
        System.out.println(newspaperAd);
        System.out.println(tvAd);
    }
}

// Output 
// Type: Hoarding, Cost: ?£1050.0
// Type: Newspaper, Cost: ?£1000.0   
// Type: TV Commercial, Cost: ?£240.0