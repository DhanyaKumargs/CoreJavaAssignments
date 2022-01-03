package abstractclassAndInterface;

public class TV implements RemoteControl{
	private boolean ison =false; 
	private final int Minvol=0;
	private final int Maxvol=50;
	private int vol=0;
	private boolean isMute=false;
	@Override
	public boolean powerOnOff() {
		// TODO Auto-generated method stub
		if(ison){
			ison=false;
			return false;
		}
		else{
			ison=true;
			return true;
		}
	}

	@Override
	public int volumeUp(int increment) {
		// TODO Auto-generated method stub
		if(vol==Maxvol){
			return 50;
		}
		else{
			vol++;
			return vol;
		}
	}

	@Override
	public int volumeDown(int decrement) {
		// TODO Auto-generated method stub
		if(vol==Minvol){
			return 0;
		}
		else{
			vol--;
			return vol;
		}
	}

	@Override
	public void mute() {
		// TODO Auto-generated method stub
		if(isMute){
			isMute=false;
			
		}
		else{
			isMute=true;
			
		}
	}
}
