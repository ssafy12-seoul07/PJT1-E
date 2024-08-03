# Team : 보성, 현수

### 검수 전

SsafitApplication
-----------------
com.ssafy.fit.test
-----------------
- \+ main(args: String[]): void

MainUi
------
com.ssafy.fit.ui
----------------
- \+ service(): void
- \- exit(): void

SsafitUtil
----------
com.ssafy.fit.util
------------------
- \- sc: Scanner
- \- SsafitUtil()
- \+ input(msg: String): String
- \+ inputInt(msg: String): int
- \+ printLine(): void
- \+ printLine(ch: char): void
- \+ printLine(ch: char, len: int): void
- \+ screenClear(): void

VideoDao
--------
com.ssafy.fit.model.dao
-----------------------
- \~ selectVideo(): List<Video>
- \~ selectVideoByNO(no: int): Video

VideoDaoImpl
------------
com.ssafy.fit.model.dao
-----------------------
- \- list: List<Video>
- \- instance: VideoDaoImpl
- \- VideoDaoImpl()
- \+ getInstance(): VideoDaoImpl
- \+ selectVideo(): List<Video>
- \+ selectVideoByNo(no: int): Video

Video
-----
com.ssafy.fit.model
-------------------
- \- no: int
- \- title: String
- \- part: String
- \- url: String
- \+ getNo(): int
- \+ setNo(no: int): void
- \+ getTitle(): String
- \+ setTitle(title: String): void
- \+ getPart(): String
- \+ setPart(part: String): void
- \+ getUrl(): String
- \+ setUrl(url: String): void
- \+ toString(): String

VideoUi
-------
com.ssafy.fit.ui
----------------
- \- videoDao: VideoDao
- \- instance: VideoUi
- \- VideoUi()
- \+ getInstance(): VideoUi
- \+ service(): void
- \- listVideo(): void
- \- detailVideo(): void

VideoReviewDao
--------------
com.ssafy.fit.model.dao
-----------------------
- \~ insertReview(videoReview: VideoReview): int
- \~ selectReview(videoNo: int): List<VideoReview>

VideoReviewDaoImpl
------------------
com.ssafy.fit.model.dao
-----------------------
- \- reviewNo: int
- \- videoReviewDb: Map<Integer, List<VideoReview>>
- \- instance: VideoReviewDaoImpl
- \- VideoReviewDaoImpl()
- \+ getInstance(): VideoReviewDaoImpl
- \+ insertReview(videoReview: VideoReview): int
- \+ selectReview(videoNo: int): List<VideoReview>

VideoReview
-----------
com.ssafy.fit.model
-------------------
- \- videoNo: int
- \- reviewNo: int
- \- nickName: String
- \- content: String
- \+ getVideoNo(): int
- \+ setVideoNo(videoNo: int): void
- \+ getReviewNo(): int
- \+ setReviewNo(reviewNo: int): void
- \+ getNickName(): String
- \+ setNickName(nickName: String): void
- \+ getContent(): String
- \+ setContent(content: String): void

VideoReviewUi
-------------
com.ssafy.fit.ui
----------------
- \- videoReviewDao: VideoReviewDao
- \- instance: VideoReviewUi
- \- videoNo: int
- \- VideoReviewUi(videoNo: int)
- \+ getInstance(videoNo: int): VideoReviewUi
- \+ service(): void
- \- listReview(): void
- \- registReview(): void
----------------------------------------------------------------

### 검수 후

SsafitApplication
-----------------
pjt1
----
- \+ main(args: String[]): void

MainUi
------
pjt1
----
- \- exit: boolean
- \+ service(): void
- \- showMenu(): void
- \- exit(): void

VideoDao
--------
pjt1
----
- \~ getAllVideos(): List<Video>
- \~ getVideoById(id: int): Video

VideoDaoImpl
------------
pjt1
----
- \- videos: List<Video>
- \+ VideoDaoImpl()
- \- loadVideos(): void
- \+ getAllVideos(): List<Video>
- \+ getVideoById(id: int): Video

Video
-----
pjt1
----
- \- no: int
- \- title: String
- \- part: String
- \- url: String
- \+ getNo(): int
- \+ setNo(no: int): void
- \+ getTitle(): String
- \+ setTitle(title: String): void
- \+ getPart(): String
- \+ setPart(part: String): void
- \+ getUrl(): String
- \+ setUrl(url: String): void
- \+ toString(): String

VideoUi
-------
pjt1
----
- \- instance: VideoUi
- \- back: boolean
- \- videoDao: VideoDao
- \- VideoUi()
- \+ getInstance(): VideoUi
- \+ service(): void
- \- showMenu(): void
- \- listVideo(): void
- \- detailVideo(videoNo: int): void
- \+ getVideoDao(): VideoDao

VideoReviewDao
--------------
pjt1
----
- \~ getReviewsByVideoId(videoId: int): List<VideoReview>
- \~ addReview(videoId: int, review: VideoReview): void

VideoReviewDaoImpl
------------------
pjt1
----
- \- reviewMap: Map<Integer, List<VideoReview>>
- \+ VideoReviewDaoImpl()
- \+ getReviewsByVideoId(videoId: int): List<VideoReview>
- \+ addReview(videoId: int, review: VideoReview): void

VideoReview
-----------
pjt1
----
- \- nickName: String
- \- content: String
- \+ getNickName(): String
- \+ setNickName(nickName: String): void
- \+ getContent(): String
- \+ setContent(content: String): void

VideoReviewUi
-------------
pjt1
----
- \- instance: VideoReviewUi
- \- videoNo: int
- \- back: boolean
- \- videoReviewDao: VideoReviewDao
- \- VideoReviewUi(videoNo: int)
- \+ getInstance(videoNo: int): VideoReviewUi
- \+ service(): void
- \- showDetail(): void
- \- showMenu(): void
- \- listReview(): void
- \- registerReview(scanner: Scanner): void
-------------------------------------------------------

### 개선된 사항

###### 1. 기본 기능을 구현하기 위한 메소드, 변수 추가
- showMenu()
- exit
- loadVideos()
- back
- getVideoDao()
- showDetail()
###### 2. 메소드, 변수 이름 변경
- selectVideo() &rarr; getAllVideos()
- selectVideoByNO() &rarr; getVideoById()
- selectReview() &rarr; getReviewsByVideoId()
- insertReview() &rarr; addReview()
----------------------------------------------------------

### 검토 전, 후의 다이어그램
- 검토 전
![검토 전 다이어그램](./img/class diagram(검토 전).png)
- 검토 후
![검토 후 다이어그램](./img/class diagram(검토 후).png)
