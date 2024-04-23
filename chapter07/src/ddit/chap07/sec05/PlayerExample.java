package ddit.chap07.sec05;

public class PlayerExample {

	public static void main(String[] args) {
		Gomplayer gplayer = new Gomplayer("mp3",17);
		System.out.println(gplayer);
		gplayer.play(10);
	}

}
