## 기능 목록

- [X] 게임 시작 문구를 출력한다.
    - [X] Output : "다리 건너기 게임을 시작합니다."
- [ ] 다리 길이를 입력 받는다.
    - [ ] Output : "다리의 길이를 입력해주세요."
    - [ ] 3 이상 20 이하의 숫자를 입력할 수 있다.
    - [ ] 올바른 값이 아니면 예외가 발생한다.
- [ ] 다리를 생성한다.
    - [ ] 위 칸과 아래 칸 중 건널 수 있는 칸은 0과 1중 무작위 값을 이용해서 정한다.
    - [ ] 0이면 아래 칸이 건널 수 있는 칸이 되고, 1이면 위 칸이 건널 수 있는 칸이 된다.
    - [ ] 아래 칸이 건널 수 있는 경우 D, 위 칸을 건널 수 있는 경우 U로 나타낸다.
- [ ] 이동할 칸을 입력 받는다.
    - [ ] Output : "이동할 칸을 선택해주세요. (위: U, 아래: D)"
    - [ ] U(위 칸), D(아래 칸) 중 하나의 문자를 입력할 수 있다.
    - [ ] U와 D는 대문자만 허용한다.
    - [ ] 올바른 값이 아니면 예외가 발생한다.
- [ ] 이동한 칸을 출력한다.
    - [ ] 이동할 수 있는 칸을 선택한 경우 O, 이동할 수 없는 칸을 선택한 경우 X로 표시한다.
    - [ ] 선택하지 않은 나머지 칸은 공백으로 출력한다.
    - [ ] 다리의 시작은 [ , 끝은 ] 으로 표시한다.
    - [ ] 다리의 구분은 | 문자로 구분한다.
    - [ ] 현재까지 건넌 다리를 출력한다.
    ```
    // 예시
    [ O |   |   ]
    [   | O | O ]
    ```
- [ ] 게임 실패 시 다시 시도할지 여부를 입력 받는다.
    - [ ] Output: "게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)"
    - [ ] R 입력 시 다리 정보는 그대로, 첫 칸부터 게임을 시작한다.
    - [ ] Q 입력 시 게임 결과를 출력한다.
    ```
    최종 게임 결과
    [ O | X ]
    [   |   ]
    ```
- [ ] 게임이 종료되면 성공 여부와 시도 횟수를 출력한다.
    ```
    게임 성공 여부: 실패
    총 시도한 횟수: 1
    ```
    
### 추가된 요구 사항

- 함수(또는 메서드)의 길이가 10라인을 넘어가지 않도록 구현한다.
  - 함수(또는 메서드)가 한 가지 일만 잘하도록 구현한다.
- 메서드의 파라미터 개수는 최대 3개까지만 허용한다.
- 아래 있는 `InputView`, `OutputView`, `BridgeGame`, `BridgeMaker`, `BridgeRandomNumberGenerator` 클래스의 요구사항을 참고하여 구현한다.
  - 각 클래스의 제약 사항은 아래 클래스별 세부 설명을 참고한다.
  - 이외 필요한 클래스(또는 객체)와 메서드는 자유롭게 구현할 수 있다.
  - `InputView` 클래스에서만 `camp.nextstep.edu.missionutils.Console` 의 `readLine()` 메서드를 이용해 사용자의 입력을 받을 수 있다.
  - `BridgeGame` 클래스에서 `InputView`, `OutputView` 를 사용하지 않는다.

### InputView 클래스
- 제공된 `InputView` 클래스를 활용해 구현해야 한다.
- `InputView`의 패키지는 변경할 수 있다.
- `InputView`의 메서드의 시그니처(인자, 이름)와 반환 타입은 변경할 수 있다.
- 사용자 값 입력을 위해 필요한 메서드를 추가할 수 있다.
```java
public class InputView {

    public int readBridgeSize() {
        return 0;
    }

    public String readMoving() {
        return null;
    }

    public String readGameCommand() {
        return null;
    }
}
```
### OutputView 클래스
- 제공된 `OutputView` 클래스를 활용해 구현해야 한다.
- `OutputView`의 패키지는 변경할 수 있다.
- `OutputView`의 메서드의 이름은 변경할 수 없고, 인자와 반환 타입은 필요에 따라 추가하거나 변경할 수 있다.
- 값 출력을 위해 필요한 메서드를 추가할 수 있다.
```java
public class OutputView {

    public void printMap() {
    }

    public void printResult() {
    }
}
```

### BridgeGame 클래스
- 제공된 `BridgeGame` 클래스를 활용해 구현해야 한다.
- `BridgeGame`에 필드(인스턴스 변수)를 추가할 수 있다.
- `BridgeGame`의 패키지는 변경할 수 있다.
- `BridgeGame`의 메서드의 이름은 변경할 수 없고, 인자와 반환 타입은 필요에 따라 추가하거나 변경할 수 있다.
- 게임 진행을 위해 필요한 메서드를 추가 하거나 변경할 수 있다.

```java
public class BridgeGame {

    public void move() {
    }

    public void retry() {
    }
}
```

### BridgeMaker 클래스
- 제공된 `BridgeMaker` 클래스를 활용해 구현해야 한다.
- `BridgeMaker`의 필드(인스턴스 변수)를 변경할 수 없다.
- `BridgeMaker`의 메서드의 시그니처(인자, 이름)와 반환 타입은 변경할 수 없다.
```java
public class BridgeMaker {

    public List<String> makeBridge(int size) {
        return null;
    }
}
```

### BridgeRandomNumberGenerator 클래스

- Random 값 추출은 제공된 `bridge.BridgeRandomNumberGenerator`의 `generate()`를 활용한다.
- `BridgeRandomNumberGenerator`, `BridgeNumberGenerator` 클래스의 코드는 변경할 수 없다.

#### 사용 예시

- 다리 칸을 생성하기 위한 Random 값은 아래와 같이 추출한다.

```java
int number = bridgeNumberGenerator.generate();
``` 

### 라이브러리

- [`camp.nextstep.edu.missionutils`](https://github.com/woowacourse-projects/mission-utils)에서 제공하는 `Console` API를 사용하여 구현해야 한다.
  - 사용자가 입력하는 값은 `camp.nextstep.edu.missionutils.Console`의 `readLine()`을 활용한다.

