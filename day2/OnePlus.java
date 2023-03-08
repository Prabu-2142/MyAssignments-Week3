package week3.day2;

public class OnePlus extends AndroidTv{

	public void playVideo() {
		
		System.out.println("Play the video");
	}
	
public static void main(String[] args) {
		
        OnePlus obj = new OnePlus();
        obj.OpenApp();
        obj.playVideo();
	}
}
