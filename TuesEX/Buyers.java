package week2.Tuesday;

public class Buyers {
    private String buyer;
    private String city;
    private double money;
    private String education;

    public Buyers(String buyer, String city, double money, String education) {

        this.buyer = buyer;
        this.city = city;
        this.money = money;
        this.education = education;
    }

    public String getBuyer() {
        return buyer;
    }

    public String getCity() {
        return city;
    }

    public double getMoney() {
        return money;
    }

    public String getEducation() {
        return education;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String toString(){
        return "Buyer name:"+buyer + "\n he/she is located in "+ city+ "\n the customer education is "+education+
                "\n and the customer willing to pay "+ money +" to build the PC";
    }
}
