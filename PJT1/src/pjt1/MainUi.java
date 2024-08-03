package pjt1;

import java.util.Scanner;

public class MainUi {
    private boolean exit;

    public void service() {
        Scanner scanner = new Scanner(System.in);

        while (!exit) {
            showMenu();
            int choice = scanner.nextInt();
            //다음의 nextLine을 해주지않으면 개행 문자가 소비가 안되는 문제 발생
            scanner.nextLine();

            switch (choice) {
                case 1:
                    VideoUi.getInstance().service();
                    break;
                case 0:
                    exit();
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 시도하세요.");
            }
        }
        scanner.close();
    }

    private void showMenu() {
        System.out.println("자바로 구현하는 SSAFIT");
        System.out.println("-----------------------");
        System.out.println("1. 영상정보");
        System.out.println("0. 종료");
        System.out.println("-----------------------");
        System.out.print("메뉴를 선택하세요: ");
    }

    private void exit() {
        System.out.println("프로그램을 종료합니다.");
        exit = true;
    }
}
