package AdapterDesignPattern;

public class SocketClassAdapter extends Socket implements SocketAdapter{
	
	@Override
	public Volt getVolt120() {
		return getVolt();
	}

	@Override
	public Volt getVolt12() {
		Volt V = getVolt();
		return convertVolt(V,10);
	}

	@Override
	public Volt getVolt3() {
		Volt V = getVolt();
		return convertVolt(V, 40);
	}
	
	private Volt convertVolt(Volt V, int i) {
		return new Volt(V.getVolts()/i);
	}


}
