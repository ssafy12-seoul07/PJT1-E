### 검수 전
SsafitApplication
-----------------
com.ssafy.fit.test
-----------------
+ main(args: String[]): void

MainUi
------
com.ssafy.fit.ui
----------------
+ service(): void
+ exit(): void

SsafitUtil
----------
com.ssafy.fit.util
------------------
# sc: Scanner
+ SsafitUtil()
+ input(msg: String): String
+ inputInt(msg: String): int
+ inputLine(): void
+ printLine(ch: char): void
+ printLine(ch: char, len: int): void
+ screenClear(): void

VideoDao
--------
com.ssafy.fit.model.dao
-----------------------
+ selectVideo(): List<Video>
+ selectVideoByNO(no: int): Video

VideoDaoImpl
------------
com.ssafy.fit.model.dao
-----------------------
- list: List<Video>
- instance: VideoDaoImpl
+ getInstance(): VideoDaoImpl
+ selectVideo(): List<Video>
+ selectVideoByNo(no: int): Video

Video
-----
com.ssafy.fit.model
-------------------
- no: int
- title: String
- part: String
- url: String
+ getNo(): int
+ setNo(no: int): void
+ getTitle(): String
+ setTitle(title: String): void
+ getPart(): String
+ setPart(part: String): void
+ getUrl(): String
+ setUrl(url: String): void
+ toString(): String

VideoUi
-------
com.ssafy.fit.ui
----------------
- videoDao: VideoDao
- instance: VideoUi
+ getInstance(): VideoUi
+ service(): void
+ detailVideo(): void

VideoReviewDao
--------------
com.ssafy.fit.model.dao
-----------------------
+ insertReview(videoReview: VideoReview): int
+ selectReview(videoNo: int): List<VideoReview>

VideoReviewDaoImpl
------------------
com.ssafy.fit.model.dao
-----------------------
- reviewNo: int
- videoReviewDb: Map<Integer, List<VideoReview>>
- instance: VideoReviewDaoImpl
+ getInstance(): VideoReviewDaoImpl
+ insertReview(videoReview: VideoReview): int
+ selectReview(videoNo: int): List<VideoReview>

VideoReview
-----------
com.ssafy.fit.model
-------------------
- videoNo: int
- reviewNo: int
- nickName: String
- content: String
+ getVideoNo(): int
+ setVideoNo(videoNo: int): void
+ getReviewNo(): int
+ setReviewNo(reviewNo: int): void
+ getNickName(): String
+ setNickName(nickName: String): void
+ getContent(): String
+ setContent(content: String): void

VideoReviewUi
-------------
com.ssafy.fit.ui
----------------
- videoReviewDao: VideoReviewDao
- instance: VideoReviewUi
- videoNo: int
+ getInstance(videoNo: int): VideoReviewUi
+ service(): void
+ listReview(): void
+ registReview(): void
----------------------------------------------------------------
