public interface Netzteil{ 

	public void Start(float spannung, boolean turnon);
	public void Stop(boolean turnoff);
}