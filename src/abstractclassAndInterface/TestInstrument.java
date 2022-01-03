package abstractclassAndInterface;

public class TestInstrument {
	public static void main(String[] args) {
		Instrument i1 = new Piano();
		Instrument i2 = new Flute();
		Instrument i3 = new Guitar();
		Instrument i4 = new Piano();
		Instrument i5 = new Piano();
		Instrument i6 = new Flute();
		Instrument i7 = new Guitar();
		Instrument i8 = new Piano();
		Instrument i9 = new Flute();
		Instrument i10 = new Guitar();
		
		Instrument [] i = new Instrument[10];
		i[0]=i1;
		i[1]=i2;
		i[2]=i3;
		i[3]=i4;
		i[4]=i5;
		i[5]=i6;
		i[6]=i7;
		i[7]=i8;
		i[8]=i9;
		i[9]=i10;
		
		for(int j=0;j<i.length;j++ ){
			if(i[j] instanceof Piano ){
				Piano p = (Piano)i[j];
				p.play();
			}
			if(i[j] instanceof Flute ){
				Flute f = (Flute)i[j];
				f.play();
			}
			if(i[j] instanceof Guitar ){
				Guitar g = (Guitar)i[j];
				g.play();
			}
		}
	}
}
