package pjt1;

import java.util.Scanner;

public class MainUi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            showMainMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    showVideoInfoMenu(scanner);
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 시도하세요.");
            }
        }
        scanner.close();
    }

    public static void showMainMenu() {
        System.out.println("자바로 구현하는 SSAFIT");
        System.out.println("-----------------------");
        System.out.println("1. 영상정보");
        System.out.println("0. 종료");
        System.out.println("-----------------------");
        System.out.print("메뉴를 선택하세요: ");
    }

    public static void showVideoInfoMenu(Scanner scanner) {
        boolean back = false;

        while (!back) {
            System.out.println("-----------------------");
            System.out.println("1. 영상목록");
            System.out.println("0. 이전으로");
            System.out.println("-----------------------");
            System.out.print("메뉴를 선택하세요: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    showVideoList();
                    break;
                case 0:
                    back = true;
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 시도하세요.");
            }
        }
    }

    public static void showVideoList() {
        // 영상목록 화면을 구현합니다.
        System.out.println("영상목록 화면입니다.");
        System.out.println("목록을 추가하세요...");
    }
}

