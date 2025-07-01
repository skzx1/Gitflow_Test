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
        // ทดสอบ Wallet
        System.out.println("=== Test Wallet ===");
        Wallet wallet = new Wallet();
        wallet.topUp(500); // เติมเงิน
        System.out.println("Wallet: " + wallet.getAmount());

        wallet.purchase(120); // ใช้จ่าย
        System.out.println("Amount: " + wallet.getAmount());
        System.out.println("Total: " + wallet.getCumulativePurchase());
        System.out.println("Point: " + wallet.getPoint());

        wallet.usePoint(1); // ใช้แต้ม
        System.out.println("PointAfterUse: " + wallet.getPoint());

        // ทดสอบ Passenger
        System.out.println("\n=== Test Passenger ===");
        Passenger passenger = new Passenger("Korn");

        passenger.addMoney(200); // เติมเงิน
        System.out.println(passenger.getName() + "'s wallet amount: " + passenger.getMoney());

        passenger.useMoney(100); // ใช้เงิน
        System.out.println(passenger.getName() + "'s wallet amount: " + passenger.getMoney());

        // ทดสอบ Bus
        System.out.println("\n=== Test Bus ===");
        String[] stations = {"A", "B", "C", "D", "E"};
        Bus bus = new Bus("Bus01", stations, 10); // ราคา 10 ต่อสถานี

        // ขึ้นจาก A ไป E (4 สถานี = 40)
        bus.pickUp(passenger, "A", "E");

        System.out.println("totalPassengers: " + bus.getTotalPassengers());
        System.out.println(passenger.getName() + " Amount: " + passenger.getMoney());

    }
}