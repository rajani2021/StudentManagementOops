package day05282022;

public class MainClass {

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl();
		rc.volume = 10;
		rc.status = "OFF";
		rc.buttons[0]="button1";
		rc.buttons[1]="button2";
		rc.buttons[2]="button3";
		rc.buttons[3]="button4";
		rc.buttons[4]="button5";
		rc.remoteButtons();
		rc.increaseDecreaseVolume();
		rc.turnOnOffButton();
	}
}

class RemoteControl {
	public String buttons[]=new String[5];
	public int volume;
	public String status;

	public void remoteButtons() {
		System.out.println("Buttons are : ");
		for (int i = 0; i < buttons.length; i++) {
			System.out.println(buttons[i]);
		}
	}

	public void increaseDecreaseVolume() {
		System.out.println("Increasing Volume to: " + (++volume));
	}

	public void turnOnOffButton() {
		status = "ON";
		System.out.println("Turn on TV: " + status);
	}
}
