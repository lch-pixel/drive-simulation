public class Driving {
    private String carName;
    private int totalCost;
    private int totalKm;
    private int runningTime;
    private int tireChangeCount;
    private String tire;

    public Driving() {
        this.tire = "브릿지 스톤";
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

}