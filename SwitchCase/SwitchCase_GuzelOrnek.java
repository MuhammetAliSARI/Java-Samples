package horonaga.Metodhs.SwitchCase;

public class SwitchCase_GuzelOrnek {
    public static void main(String[] args) {

        double shirt = 100;

        discount ("student",shirt);
        System.out.println(shirt); //100

        double studentShirtPrice = discount ("student",shirt);
        System.out.println(studentShirtPrice); //90

        double veterantShirtPrice = discount ("veteran",shirt);
        System.out.println(veterantShirtPrice); //80

        double seniortShirtPrice = discount ("senior",shirt);
        System.out.println(seniortShirtPrice); //95
    }
    public static double discount(String state, double price){

        switch (state){

            case "student":
                price = price*0.90;
                break;

            case "veteran":
                price = price*0.80;
                break;

            case "senior":
                price = price*0.95;
                break;

            default:
                price = price;
        }

        return price;
    }
}
