
public class AdapterImpl implements Adapter {

//	Math math;
	
	@Override
	public Float twiceOf(Float f) {

		return (float) Math.twoTime(f.doubleValue());
//		return Math.triple(f.doubleValue()).floatValue();	
		// 데이터 타입이 다른 경우 || different data type
	}

	@Override
	public Float halfOf(Float f) {
		
		System.out.println("start halfof()");
		// 로그 같은 경우는 사용하는 곳에 찍어야함. 라이브러리에 찍으면 나 이외의 사람도 로그가 찍힘

		return (float) Math.half(f.doubleValue());
	}

}
