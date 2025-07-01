public class Main {
    public static void main(String[] args) {
        Passenger passenger = new Passenger("C", 0.0);
        //getname
        System.out.println("Name: " + passenger.getName());
        //getmoney
        System.out.println("Money now: " + passenger.getMoney());
        ///addMoney
        passenger.addMoney(100);
        System.out.println("Add: " + passenger.getMoney());
        //useMoney
        passenger.useMoney(30);
        System.out.println("Use: " + passenger.getMoney());
        passenger.useMoney(1000);
        System.out.println(passenger.getMoney());
    }
}