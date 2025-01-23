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