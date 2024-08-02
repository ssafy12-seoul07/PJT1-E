package pjt1;

import java.util.List;
import java.util.Scanner;

public class VideoUi {
    private static VideoUi instance = new VideoUi();
    private boolean back;
    private VideoDao videoDao;

    private VideoUi() {
        videoDao = new VideoDaoImpl();
    }

    public static VideoUi getInstance() {
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
                    listVideo();
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
        System.out.println("1. 영상목록");
        System.out.println("0. 이전으로");
        System.out.println("-----------------------");
        System.out.print("메뉴를 선택하세요: ");
    }

    private void listVideo() {
        List<Video> videos = videoDao.getAllVideos();

        System.out.println("전체 " + videos.size() + "개");
        for (Video video : videos) {
            System.out.println(video.getNo() + ". " + video.getTitle() + " [" + video.getPart() + "]");
        }
        
        System.out.println("1. 영상상세");
        System.out.println("0. 이전으로");
        System.out.print("메뉴를 선택하세요: ");
        
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        if (choice == 1) {
            System.out.print("영상번호를 입력하세요: ");
            int videoNo = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            detailVideo(videoNo);
        }
    }

    private void detailVideo(int videoNo) {
        Video video = videoDao.getVideoById(videoNo);
        if (video != null) {
            System.out.println("번호: " + video.getNo());
            System.out.println("제목: " + video.getTitle());
            System.out.println("운동 부위: " + video.getPart());
            System.out.println("영상 URL: " + video.getUrl());

            VideoReviewUi videoReviewUI = VideoReviewUi.getInstance(videoNo);
            videoReviewUI.service();
        } else {
            System.out.println("해당 번호의 영상을 찾을 수 없습니다.");
        }
    }
}
