public class C {
	private D d;
	
	void f(B b) {
		b.call()
		g();
		d.call();
	}
	
	void g() {
		A a = new A();
		a.call()
	}
}

// D, B, A 클래스에 대해서 호출 가능한 이유

// 1. D는 C 클래스 내부의 변수이기 때문에 호출 가능하다
// 2. B는 C 클래스 메서드가 매개변수로 가져온 객체이기 때문에 호출 가능하다
// 3. A는 C 클래스 메서드에서 새로 생성한 객체이기 때문에 호출 가능하다