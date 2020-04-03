public class Driving {
    private String carName;
    private int totalCost;
    private int totalKm;
    private int runningTime;
    private int tireChangeCount;
    private Tire tire;

    public Driving() {
        this.tire = new BridgestoneTire();
    }

    public void startDriving() {
        if(this.totalKm == 0) {
            System.out.println("주행거리를 입력해주세요");
        }
        else {
            
        }
    }

    public void getDrivingInfo() {
        System.out.println("차 이름 : " + this.carName);
        System.out.println("총 소요비용 : " + this.totalCost);
        System.out.println("총 소요시간 : " + this.totalKm);
        System.out.println("총 주행거리 : " + this.runningTime);
        System.out.println("타이어 교환 횟 수 : " + this.tireChangeCount);
        System.out.println("타이어 이름 : " + this.tire);
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void getCarName() {
        System.out.println(this.carName);
    }

    public void setTotalKm(int totalKm) {
        this.totalKm = totalKm;
    }

}