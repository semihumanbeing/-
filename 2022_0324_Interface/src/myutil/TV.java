package myutil;

public class TV implements RemoteControler {

	int volume = 10; // ������ ����
	int channel = 4; // ä�ΰ� ����

	boolean onOff = false; // ���� ����
	boolean silent = false; // ���ҰŻ���

	@Override
	public void volumeUp() {
		volume++;
		if (volume> Volume.MAX) {
			volume = Volume.MAX;
		}
		display();
	}

	@Override
	public void volumeDown() {
		volume--;
		if(volume < Volume.MIN) {
			volume = Volume.MIN;
		}
		display();
	}

	@Override
	public void silentMode() {
		silent = !silent;
		display();
	}

	@Override
	public void channelUp() {
		channel++;
		if (channel > Channel.MAX) {
			channel = Channel.MIN;
		}
		display();
	}

	@Override
	public void channelDown() {
		channel--;
		if (channel < Channel.MIN) {
			channel = Channel.MAX;
			
		}
		display();
			
	}

	@Override
	public void setChannel(int channel) {
		this.channel = channel;
		display();
	}

	@Override
	public void onOff() {
		// toggle ó��
		onOff = !onOff;
		display();

	}

	private void display() {
		if (onOff == true) {
			System.out.println("---TV: ����---");
			System.out.printf("ä��: %d��\n", channel);
			if (silent) {
				System.out.println("���Ұ�");
			} else {
				System.out.printf("����: %d\n", volume);
			}

		} else {
			System.out.println("---TV: ����---");
		}

	}

}
