# PJT1 : SSAFIT Project
---
### 1. 프로젝트 목표
- 객체지향 개념과 Java 프로그램의 기본 구조 및 흐름을 이해하고 활용할 수 있다.
- Collection, IO API를 이용하여 데이터를 관리하는 프로그램을 작성할 수 있다.
- JSON 데이터를 이용한 파일 입출력을 프로그램에 적용할 수 있다.
- ChatGPT의 도움을 받아 클래스 다이어그램을 그릴 수 있다.
- MVC 구조를 이해하고 프로그램에 적용할 수 있다.

### 2. 진행과정

(1) 검수 전 Class Diagram 작성
- Class Diagram의 초안을 만들기 위해 pdf 파일에 있는 Class Diagram 예시 이미지를 캡처하여 GPT를 통해 plantUML 형식으로 작성함

(2) 역할 분담
- Class Diagram 초안 작성 후 java 파일 작성과 Class Diagram 수정으로 역할을 나눠 진행함
- java 파일 작성을 맡아 기초적인 파일 작성 후 기본 기능 구현이 어려워 역할을 바꿔 다음과정을 진행함

(3) Class Diagram 이미지 생성
- GPT를 통해 얻은 plantUML 형식의 파일을 통해 이미지를 생성하면 다음과 같이 클래스간의 관계를 제대로 나타내주지 못하거나 인터페이스를 클래스로 표현하는 등의 문제가 발생함
![잘못된 클래스 다이어그램](./img/wrong%20class%20diagram.png)
- plantUML 형식의 파일을 이미지로 만들어주는 planttext 사이트에서 관계를 수정하고 인터페이스를 정확히 표현해주기 위해 직접 코드를 수정하여 원하는 Class Diagram 이미지를 생성함
![검수 전 클래스 다이어그램](./img/class%20diagram(검수%20전).png)

(4) 기본 기능 구현 후 Class Diagram 수정
- 팀원이 기본 기능을 실행할 수 있는 코드를 성공적으로 구현함
- 코드를 구현하며 사용된 메소드명이 이전에 생성한 Class Diagram 이미지에 나와있는 메소드명과 다르거나 새롭게 추가된 메소드가 있어 Class Diagram을 수정함
![검수 후 클래스 다이어그램](./img/class%20diagram(검수%20후).png)

### 3. 프로젝트 후
- 같은 branch를 사용하면 충돌이 날 수 있어 팀원마다 다른 branch를 사용해보며 branch에 대한 이해를 쌓을 수 있었음
- 로컬에서 pull을 할 때 생긴 conflict를 해결하며 merge를 경험할 수 있었고 commit의 중요성에 대해 알게 됨
- 팀원과 역할을 나눠 프로젝트를 진행하는 과정에서 어려움이 생겨 역할을 조정한 후 프로젝트를 더 수월하게 진행할 수 있었음 &rarr; 서로의 장점을 파악하고 소통하는 과정이 중요함을 알게 됨