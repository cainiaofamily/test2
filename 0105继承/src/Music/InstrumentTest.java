package Music;

public class InstrumentTest {

	void testPlay1(Instrument i) {
		i.play();
	}

	public static void main(String[] args) {
		InstrumentTest i = new InstrumentTest();
		Instrument piano = new Piano();
		Instrument Violin = new Violin();
		i.testPlay1(piano);
		i.testPlay1(Violin);
	}
}