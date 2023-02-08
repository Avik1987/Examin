public class Model {
    private String model;
    private String country;
    private int year;
    private int hours;
    private boolean military;
    private int weigth;
    private int wingspan;
    private int topSpeed;
    private int seats;
    private float cost;

    public int getYear() {

        return year;
    }

    public void setYear(int year) {
        if (year > 1903 && year < 2022)
            this.year = year;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        if (weigth > 10000 && weigth < 160000) {
            this.weigth = weigth;
        }
    }


    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        if (topSpeed > 0) {

            this.topSpeed = topSpeed;
        }
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if (seats > 0) this.seats = seats;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours > 0 && 10000 > hours) {
            this.hours = hours;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isMilitary() {
        return military;
    }

    public void setMilitary(boolean military) {
        this.military = military;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        if (cost > 0) {
            this.cost = cost;
        }
    }

    public int getWingspan() {
        return wingspan;
    }

    public Model(String model, String country, int year, int hours, boolean military, int weigth, int wingspan, int topSpeed, int seats, float cost) {
        this.model = model;
        this.country = country;
        this.year = year;
        this.hours = hours;
        this.military = military;
        this.weigth = weigth;
        this.wingspan = wingspan;
        this.topSpeed = topSpeed;
        this.seats = seats;
        this.cost = cost;
    }

    public void setWingspan(int wingspan) {
        if (wingspan > 10 && wingspan < 45)
            this.wingspan = wingspan;
    }

    public Model() {
    }

    public void printInfo() {
        System.out.println("Model is " + getModel() );
        System.out.println("Country is :" +getCountry());
        System.out.println("Year is: "+ getYear());
        System.out.println(" Fly hours: "+ getHours());
        System.out.println("Is military:"+ isMilitary());
        System.out.println("weigth is:"+ getWeigth());
        System.out.println("wingspane is:" +getWingspan());
        System.out.println("Seats is:"+getSeats());
        System.out.println("Coast is: "+getCost());
    }
}

