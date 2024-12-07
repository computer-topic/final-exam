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