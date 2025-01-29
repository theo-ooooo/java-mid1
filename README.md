## 김영한의 실전 자바 - 중급 1편


### import 생략 가능
- java.lang은 자바 애플리케이션에 자동으로 임포트 된다. 

### Object 클래스
- 부모가 없으면 묵시적으로 Object 클래스를 상속 받는다.


```java
package lang.object;

// - 이게 묵시적.
// 부모가 없으면 묵시적으로 Object 클래스를 상속 받는다.
public class Parent { // extends Object 가 자동으로 들어간다.

    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}

```
```java
package lang.object;

// 이거 명시적.

public class Child extends Parent {

    public void childMethod() {
        System.out.println("Child.childMethod");
    }
}
```

### Object 다형성
- Object는 모두 클래스 객체에 부모이기 때문에 다 담을수 있다.

### Object 배열
- Object 배열은 모든 객체를 담은 수있다.

### toString()
- `Object` 가 제공하는 toString() 메서드는
```java
public String toString() {
    return getClass().getName() + "@" + Integer.toHexString(hashCode());
}
```
- println 과 toString() 이 같은 이유는 println() 실행시 toString() 을 호출한다.


### toString() 오버라이딩
- 오버라이딩 하니 오버라이딩한 메소드가 실행.


### equals()
- 동일성 (Identity) == 연산자를 사용하여 두객체에 메모리까지 같은지 확인
- 동등성 (Equality) equals() 메소드를 사용하여 두객체가 논리적으로 동등한지 확인

- user1 == user2 false
- user1.equals(user2) false
- 아래를 보면 똑같다.

```java
    public boolean equals(Object obj) {
        return (this == obj);
    }
```

- equals 메소드를 구현할떄 지켜야 하는 규칙
  1. 반사성
  2. 대칭성
  3. 추이성
  4. 일관성
  5. null의 대한 비교


### 기본형과 참조형의 공유
- 가본형은 절대로 값은 값을 공유하지 않는다.
- 참조형 변수는 하나의 인스턴스를 공유할 수 있다.

### String

```java
    String str = "hello"; // 아래로 자바에서 변경해준다.
    String str = new String("hello");
```

- 자바에서 문자열을 더할때 String 이 제공하는 concat() 을 사용해야하지만 특별히 + 연산도 된다.
```java
        String result1 = a.concat(b);
        String result2 = a + b;
```

- String은 불변객체이다.