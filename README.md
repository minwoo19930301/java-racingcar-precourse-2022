# 자동차 경주 게임 구현 리스트

- [x]  Launcher로 구분하고 게임 생성 후 시작
- [ ]  표준으로 써야할 값들은 상수로 두기 ex) 입력값, 출력값, 5자 제한, 0~9 숫자 제한, 전진 최소 기준 (4), 쉼표
- [ ]  자동차에는 이름, 현재 포지션이라는 값을 원시값 포장하기 
- [ ]  입력 오류 시 IllegalArguementException 던져 error 메시지 던지는 로직
- [ ]  자동차 대수 및 이름을 입력 로직, 자동차 생성 후 현황 판에 저장
- [ ]  시도할 횟수 저장하는 입력 로직
- [ ]  자동차 랜덤숫자 후 실제 이동
- [ ]  시도 횟수 끝에 현황보드에서 최종 우승자 출력 시스템 작성


신경써야할 점들

- Java8 로 실행 가능토록 신경 쓸 것. - ex)모르고 11에서 돌릴 때 while 문 시 Console.readLine() 함수가 오류를 냄
- 들여쓰기 2 넘지 않도록 구현 (google style을 예전에 파일 받아서 아예 intelliJ preferences에 4로 고정해서 회사에서 쓰고 있어서 2로 고쳤다가 회사 업무 하는 데에 번거로움이 있어 4로 다시 설정했습니다..)
- Stream 사용하지 않기
- else나 switch 사용하지 않고 if return  식으로 구현
- function은 10 줄 이상 지양 + 1 가지 일만 하도록 지향 - 커밋 단위로도 활용
- 단위테스트 시 assert 활용
- 이미 있는 Test Case는 모두 성공해야 함.
- `일급 컬렉션 (컬렉션 인스턴스 변수로 놓은 전용 클래스 만들기)`
- `원시값 포장(한개의 primitive를 직접 wrapping 하는 클래스 따로따로 만들기)`