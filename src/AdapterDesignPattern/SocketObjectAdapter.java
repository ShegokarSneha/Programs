package AdapterDesignPattern;

public class SocketObjectAdapter implements SocketAdapter{
	
	//Using Composition for adapter pattern
	private Socket sock = new Socket();
			
	@Override
	public Volt getVolt120() {
		return sock.getVolt();
		}

	@Override
	public Volt getVolt12() {
		Volt V = sock.getVolt();
		return convertVolt(V, 10);
		}

	@Override
	public Volt getVolt3() {
		Volt V = sock.getVolt();
		return convertVolt(V, 40);
		}
			
	private Volt convertVolt(Volt V, int i) {
		return new Volt(V.getVolts()/i);
		}

}
