import java.util.Scanner;

class Manu {
    private Scanner sc = new Scanner(System.in);
    private Driving[] driving = new Driving[3];
    private int buyCarCount;
    private int choisCarNumber=-1;

    //메뉴 고르기
    void mainManu() {
        Tire tire = new BridgestoneTire();
        System.out.println(tire.getName());

        int manuNum = 0;

        do {
            System.out.println("1. 자동차 구매하기");
            System.out.println("2. 자동차 선택하기");
            System.out.println("3. 도착 지점 설정하기");
            System.out.println("4. 주행 시작");
            System.out.println("5. 결과보기");
            
            manuNum = sc.nextInt();
            switch(manuNum) {
                case 1 : 
                    if( this.buyCarCount >= 3) {
                        System.out.println("이미 자동차를 3개 사셨습니다.");
                        break;
                    }
                    buyCarManu();
                    break;
                case 2 : 
                    if( this.buyCarCount < 1) {
                        System.out.println("먼저 자동차를 구매해주세요.");
                        break;
                    }
                    selectCarManu();
                    break;
                case 3 : 
                    if(this.choisCarNumber < 0) {
                        System.out.println("자동차를 선택해주세요.");
                        break;
                    }
                    addTotalKm();
                    break;
                case 4 : 
                    if(this.choisCarNumber < 0) {
                        System.out.println("자동차를 선택해주세요.");
                        break;
                    }
                    this.driving[this.choisCarNumber].startDriving();
                    break;
                default :
                    this.driving[this.choisCarNumber].getDrivingInfo();
                    manuNum = 0;
            }
        }
        while(true);
    }

    //자동차 구매
    public void buyCarManu() {;
        System.out.println("자동차 이름을 입력해주세요.");
            
        String carName = sc.next();
        this.driving[this.buyCarCount] = new Driving();
        this.driving[this.buyCarCount].setCarName(carName);
        this.driving[this.buyCarCount].getDrivingInfo();
        this.buyCarCount++;
    } 

    //자동차 선택
    public void selectCarManu() {
        do {
            System.out.println("자동차를 선택해주세요.");
            for(int i=0; i<this.buyCarCount; i++) {
                System.out.print(i + " : ");
                this.driving[i].getCarName();
            }
            this.choisCarNumber= sc.nextInt();
       } while(this.choisCarNumber < 0 || this.choisCarNumber >= this.buyCarCount);
    } 

    //주행거리 입력
    public void addTotalKm() {
        int totalKm;
        do {
            System.out.println("주행거리를 입력해주세요.");
            totalKm = sc.nextInt();
       } while(totalKm % 20 != 0);
       this.driving[this.choisCarNumber].setTotalKm(totalKm);
    } 

    public static void clearScreen() {
        for (int i = 0; i < 80; i++)
          System.out.println("");
      }
}