package BeatBox;

import javax.sound.midi.*;

public class MusicTest1 {
	public void play () { 
		try {
			Sequencer sequencer = MidiSystem.getSequencer();
			System.out.println("������� �������� ����������");
		} catch(MidiUnavailableException ex) {
			System.out.println("�������");
		}
		
	} //��������� play
		
	public static void main(String[] args) {
		MusicTest1 mt = new MusicTest1();
		mt.play() ;
		} //��������� main
} //��������� �����