public class Driving {
    private String carName;
    private int totalCost = 0;
    private int totalKm;
    private int runningKm = 0;
    private int runningTime;
    private int trafficCount = 0;
    private int tireChangeCount = 0;
    private Tire tire;
    private double rand = Math.random();


    public Driving() {
        this.tire = new BridgestoneTire();
    }

    public void startDriving() {
        if(this.totalKm == 0) {
            System.out.println("주행거리를 입력해주세요");
        }
        else {
            while(this.runningKm < this.totalKm ) {
                //타이어 마모 체크
                if(this.tire.getHp()==0) {
                    chagneTire();
                }

                //교통정체 
                double rand = Math.random();
                int is_traffic = (((int)(rand * 5) + 1 ) == 1) ? 1 : 0;
                if(is_traffic==1) {
                    this.runningTime +=2;
                    this.trafficCount +=1;
                    System.out.println( "자동차가 너무 많습니다. 도착 시간까지 지연됩니다.");
                }
    
                //초속 20KM으로 이동
                this.runningTime +=1;
                this.runningKm +=20;

                //타이어 마모
                this.tire.minusHp();
                
            }
        }
    }

    public void getDrivingInfo() {
        System.out.println("차 이름 : " + this.carName);
        System.out.println("총 소요비용 : " + this.totalCost);
        System.out.println("총 소요시간 : " + this.runningTime);
        System.out.println("총 주행거리 : " + this.totalKm);
        System.out.println("총 막힌횟수 : " + this.trafficCount);
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

    public void chagneTire() {
        double rand = Math.random();
        int tireIndex = ((int)(rand * 3) );
        switch(tireIndex) {
            case 0 : 
                this.tire = new MichelinTire();
                break;
            case 1 : 
                this.tire = new ContinentalTire();
                break;
            case 2 : 
                this.tire = new BridgestoneTire();
                break;
        }
        this.totalCost += this.tire.getPrice();
        this.tireChangeCount += 1;
    }
}