package ch07.ex06.case06;

// A������ ��� ���ҿ� ���� generic type���� �����ȴ�.
public class Cabinet<T extends A> {
	public T getLastVal(T[] arr) {
		return arr[arr.length - 1];
	}
	
	//C������ ���ҿ����� generic type
	public <S extends C> S getFinalVal(S[] arr){
		return arr[arr.length - 1];		
	}
}
