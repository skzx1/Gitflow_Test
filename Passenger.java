public class Passenger {
		private String name;
		private double money;

		// Constructor
        public Passenger(String name, double money) {
                this.name = name;
                this.money = money;
        }
		public void addMoney(double money) {
				// เพิ่มเงินในกระเป๋าเงิน
                this.money += money;
		}
		
		public void useMoney(double money) {
				// ใช้เงินจากกระเป๋าเงิน
                if (this.money >= money) {
                        this.money -= money;
                } else {
                        System.out.println("Not enough money!");
                }
		}

		// getters
        public String getName() {
                return name;
        }
        public double getMoney() {
                return money;
        }
        // setters
        public void setName(String name) {
                this.name = name;
        }
}