package mymain;

import myutil.Channel;
import myutil.RemoteControler;
import myutil.TV;
import myutil.Volume;

public class MyMainTV {

	public static void main(String[] args) {
		//�Ŵ���                   ���赵
		RemoteControler remocon = new TV();
		
		remocon.onOff();
		remocon.volumeUp();
		remocon.volumeUp();
		
		remocon.setChannel(8);
		for(int i=0;i<10;i++) {
			remocon.channelDown();
			
		}
		
		//���������κ��� ��ɸ� ����
		Volume volume = remocon;
		Channel channel = remocon;
		volume.volumeUp();
		channel.setChannel(55);
		
	}

}
