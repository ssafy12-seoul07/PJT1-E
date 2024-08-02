package pjt1;

import java.util.List;
import java.util.Scanner;

public class VideoReviewUi {
    private static VideoReviewUi instance;
    private int videoNo;
    private boolean back;
    private VideoReviewDao videoReviewDao;

    private VideoReviewUi(int videoNo) {
        this.videoNo = videoNo;
        this.videoReviewDao = new VideoReviewDaoImpl();
    }

    public static VideoReviewUi getInstance(int videoNo) {
        if (instance == null || instance.videoNo != videoNo) {
            instance = new VideoReviewUi(videoNo);
        }
        return instance;
    }

    public void service() {
        Scanner scanner = new Scanner(System.in);
        back = false;

        while (!back) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    listReview();
                    break;
                case 0:
                    back = true;
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 시도하세요.");
            }
        }
    }

    private void showMenu() {
        System.out.println("-----------------------");
        System.out.println("1. 리뷰목록");
        System.out.println("0. 이전으로");
        System.out.println("-----------------------");
        System.out.print("메뉴를 선택하세요: ");
    }

    private void listReview() {
        List<VideoReview> reviews = videoReviewDao.getReviewsByVideoId(videoNo);

        for (VideoReview review : reviews) {
            System.out.println(review.getNickname() + ": " + review.getContent());
        }

        System.out.println("1. 리뷰등록");
        System.out.println("0. 이전으로");
        System.out.print("메뉴를 선택하세요: ");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (choice == 1) {
            registerReview(scanner);
        }
    }

    private void registerReview(Scanner scanner) {
        System.out.print("닉네임을 입력하세요: ");
        String nickname = scanner.nextLine();
        System.out.print("내용을 입력하세요: ");
        String content = scanner.nextLine();

        VideoReview review = new VideoReview(nickname, content);
        videoReviewDao.addReview(videoNo, review);
        System.out.println("리뷰가 등록되었습니다: " + nickname + " - " + content);
    }
}
