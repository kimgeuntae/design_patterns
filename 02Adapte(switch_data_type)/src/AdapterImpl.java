
public class AdapterImpl implements Adapter {

//	Math math;
	
	@Override
	public Float twiceOf(Float f) {

		return (float) Math.twoTime(f.doubleValue());
//		return Math.triple(f.doubleValue()).floatValue();	
		// ������ Ÿ���� �ٸ� ��� || different data type
	}

	@Override
	public Float halfOf(Float f) {
		
		System.out.println("start halfof()");
		// �α� ���� ���� ����ϴ� ���� ������. ���̺귯���� ������ �� �̿��� ����� �αװ� ����

		return (float) Math.half(f.doubleValue());
	}

}
