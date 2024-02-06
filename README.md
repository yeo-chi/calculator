# calculator

안녕하세요. 이번에 컨두잇에 지원한 여승현이라고 합니다.

과제로 전달받은 계산기 코딩을 진행 하였습니다.

에자일 방법론으로 첫 스프린트를 시작했다고 가정하고 코딩하였습니다.

이해한 내용

1. "3 + 4" 처럼 Operand Operation Operand 형식으로 클라이언트에서 데이터가 넘어온다.
2. 덧셈 뺄셈 곱셈 나눗셈에 대해서만 이번 스프린트에서 코딩을하고, 성공적으로 배포가 되면 다음 스프린트에 삼각함수 사인, 코사인 계산이 진행된다.

구현 내용

1. Client에서 String 형태의 request를 전달받고, split으로 숫자1, 숫자2, 연산자를 나누고 양호한 데이터인지 검증하도록 하였습니다.
2. strategy pattern을 사용하여 각 연산자별 기능을 구분하였고, 추후에 sin cos 에 관한 로직도 쉽게 확장할 수 있도록 구현.

TDD

1. TDD는 Client에서 전달받은 데이터가 양식에 맞는지 체크하는 QuestionValidTest, 로직을 검증하는 CalculatorTest로 나누었고, 테스트 코드부터 시작하여 로직을 구현하였습니다.

2. QuestionValidTest
    * 들어온 데이터를 3개로 나눌수 있는지
    * 들어온 데이터의 가운데 데이터가 연산자인지
    * 들어온 데이터의 첫번째 마지막 데이터가 숫자인지 
