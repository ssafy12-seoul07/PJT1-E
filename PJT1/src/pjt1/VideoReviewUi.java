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
        
        showDetail();

        while (!back) {
//            showDetail(); //반복문 안에 넣으면 영상의 정보가 2번씩 출력되는 문제가 생김
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

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

    private void showDetail() {
        Video video = VideoUi.getInstance().getVideoDao().getVideoById(videoNo);
        //이 부분이 있으면 두번씩 출력되는 문제 발생.
//        if (video != null) {
//            System.out.println("번호: " + video.getNo());
//            System.out.println("제목: " + video.getTitle());
//            System.out.println("카테고리: " + video.getPart());
//            System.out.println("영상 URL: " + video.getUrl());
//        }

        List<VideoReview> reviews = videoReviewDao.getReviewsByVideoId(videoNo);
        System.out.println("-----------------------");
        System.out.println("영상리뷰: " + reviews.size() + "개");
        System.out.println("-----------------------");
        for (int i = 0; i < reviews.size(); i++) {
            VideoReview review = reviews.get(i);
            System.out.println(" " +(i + 1) + " " + review.getNickname() + ": " + review.getContent());
        }
    }

    private void showMenu() {
        System.out.println("-----------------------");
        System.out.println("1. 리뷰등록");
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
        scanner.nextLine();

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
        
        //showDetail();
    }
}
