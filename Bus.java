public class Bus {

    //ปรับ attribute เพื่อกำหนดราคาตามช่วงสถานีทั้งหมด
    private String busNumber;
    private String[] station;
    private double pricePerStation;
    private int totalPassengers;

    // Constructor **ปรับเพื่อให้รองรับ station, pricePerStation
    public Bus(String busNumber, String[] station, double pricePerStation ) {
        this.busNumber = busNumber;
        this.station = station;
        this.pricePerStation = pricePerStation;
        this.totalPassengers = 0; // เริ่มต้นที่ 0 ผู้โดยสาร
    }

    // Method เพิ่มยอดผู้โดยสาร **ปรับให้คำนวณราคาตั๋วโดยสาร ตามระยะทาง
    public void pickUp(Passenger passenger, String startStation, String endStation) {
        int startIndex = getStationIndex(startStation);
        int endIndex = getStationIndex(endStation);
        double ticketPrice = (endIndex - startIndex) * pricePerStation;


        if (startIndex == -1 || endIndex == -1) {
            System.out.println("Invalid station input.");
        }


        else if (endIndex <= startIndex) {
            System.out.println("End station must be after start station.");
        }
        else {
            passenger.useMoney(ticketPrice);
            totalPassengers++;
        }
    }

    // Method หาตำแหน่งของสถานีใน array
    private int getStationIndex(String station) {
        for (int i = 0; i < this.station.length; i++) {
            if (station.equals(this.station[i])) {
                return i;
            }
        }
        return -1;
    }

    // Getter หมายเลขสายการเดินรถ
    public String getBusNumber() {
        return this.busNumber;
    }

    // Getter สถานี
    public String[] getStation() {
        return this.station;
    }

    // Getter ราคาตั๋วโดยสารต่อสถานี
    public double getPricePerStation() {
        return this.pricePerStation;
    }

    // Getter จำนวนผู้โดยสาร (เพิ่มเติมเผื่อได้ใช้)
    public int getTotalPassengers() {
        return this.totalPassengers;
    }

}