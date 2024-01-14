package generic13.sec02.exam02;

	// 타입 파라미터는 기본적으로 오브젝트로 간주된다.
public interface Rentable<P> {
	// 타입 파라미터 P를 리턴
	P rent();
}
