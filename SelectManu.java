import java.util.Scanner;

class Manu {
    private Scanner sc = new Scanner(System.in);

    //메뉴 고르기
    void mainManu() {
        int manuNum = 0;

        do {
            clearScreen();
            System.out.println("1. 자동차 고르기");
            System.out.println("2. 자동차 이름 정하기");
            System.out.println("3. 타이어 고르기");
            System.out.println("4. 정보 보기");
            
            manuNum = sc.nextInt();
            switch(manuNum) {
                case 1 : 
                    String abc = choisCarManu();
                    System.out.println(abc);
                    break;
                case 2 : 
                    //selectNum = 2;
                    break;
                case 3 : 
                    //selectNum = 3;
                    break;
                case 4 : 
                    //selectNum = 4;
                    break;
                default :
                    System.out.println("올바른 메뉴를 선택해 주세요.");
                    manuNum = 0;
            }
        }
        while(manuNum==0);
    }

    //자동차 고르기
     public String choisCarManu() {
        int carNum = 0;
        String[] carList = new String[3];
        carList[0] = "람보르기니";
        carList[1] = "포르쉐";
        carList[2] = "제타";

        String carName = "";
        do {
            clearScreen();
            System.out.println("1. " + carList[0]);
            System.out.println("2. " + carList[1]);
            System.out.println("3. " + carList[2]);
            
            carNum = sc.nextInt();
            switch(--carNum) {
                case 0 : 
                    carName = carList[0];
                    break;
                case 1 : 
                    carName = carList[1];
                    break;
                case 2 : 
                    carName = carList[2];
                    break;
                default :
                     System.out.println("올바른 자동차를 선택해 주세요.");
                     carNum = -1;
            }
        }
        while(carNum==-1);
        return carName;
    } 

    public static void clearScreen() {
        for (int i = 0; i < 80; i++)
          System.out.println("");
      }
}