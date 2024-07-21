# 1️⃣ 과제안내
> 당신은 우주 탐사 관리 시스템을 개발하는 소프트웨어 개발자로 고용되었습니다. 탐사선과 탐사 대원들을 관리하는 시스템을 구현하는 것이 당신의 첫 번째 과제입니다. 다음 요구사항을 충족하는 클래스를 작성하세요.
>

<br>

## 기능 요구사항
- [ ] 탐사선은 탐사 대원을 가질 수 있습니다.
- [ ] 탐사선은 다음과 같은 속성을 가집니다.
  - 이름, 모델, 탐사 임무, 연료 수준
- [ ] 탐사선의 연료을 충전할 수 있습니다.
- [ ] 탐사선의 연료를 소모할 수 있습니다.
- [ ] 탐사선의 정보를 확인할 수 있습니다.
- [ ] 탐사 대원은 여러대의 탐사선에 탑승할 수 있습니다.
- [ ] 탐사 대원은 탐사선에서 내릴 수 있습니다.
- [ ] 탐사 대원은 다음과 같은 속성을 가집니다.
  - 이름, 대원 ID, 소속된 탐사선 목록
- [ ] 탐사 대원의 정보를 확인할 수 있습니다.

## 제한 사항
- [ ] 연료가 모두 충전되면 연료를 충전할 수 없습니다.
- [ ] 연료가 모두 소모되면 연료를 소모할 수 없습니다.
- [ ] 연료는 양으로 충전할 수도 있고, 퍼센트로 충전할 수도 있습니다.
- [ ] 연료는 양으로 소모할 수도 있고, 퍼센트로 소모할 수도 있습니다.

## 코드 작성 시 유의사항
- [ ] 클래스별로 파일을 구분해야 합니다.
- [ ] 패키지, 변수, 메서드 작성시에는 꼭 그에 알맞는 네이밍 컨벤션을 따라야 합니다.

<br>

# 2️⃣ 과제 제출 방법
  1. 이 레포지토리를 포크합니다.
  2. 본인의 이름으로 브랜치를 생성합니다.
  3. 모두 완료한 후 Pull Request를 보내주세요.

<br>

## 3️⃣ 커밋 메시지 규칙

다음 명령어를 사용하면 커밋 템플릿을 통해 커밋 메시지를 작성할 수 있습니다.

```bash
git commit
```

### 형식

커밋 메시지는 머리글, 본문, 바닥글로 구성합니다.

```html
<머리글>
<!-- 빈 줄 -->
<본문>
<!-- 빈 줄 -->
<바닥글>
```

### 머리글(필수)

```
<유형>: <짧은 요약>
  │         │
  │         └─⫸ 현재, 명령형으로 작성. 마침표 금지.
  │
  └─⫸ 커밋 유형: feat|fix|perf|refactor
```

#### 유형

| 유형     | 설명                                                     |
|----------|----------------------------------------------------------|
| feat     | 새로운 기능 추가                                          |
| fix      | 버그 수정                                                 |
| perf     | 성능 개선                                                 |
| refactor | 버그를 수정하거나 기능을 추가하지 않은 코드 리팩토링       |

#### 요약

변경사항이 "**무엇**"인지 작성합니다.

- 명령형, 현재 시제 사용: "변경함", "변경했음"이 아닌 "변경"으로 작성
- 끝에 마침표(.) 금지
- 한글 사용 권장
- 50자 이내로 작성

### 본문

- 한글 사용 권장
- 한 줄에 72자가 넘지 않도록 주의
- 어떻게 보다는 "무엇"을 "왜" 변경했는지 작성
- 자유 형식

### 바닥글(선택 사항)

참고 사항이나 추가로 할 말이 있을 떄 작성합니다.

### 명령어 예시
```bash
git commit -m "feat :: 우주선 객체
- ~~ 구체적인 설명
"