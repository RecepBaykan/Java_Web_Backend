package CPU;

public class CPU {
	
	

	// ---- Memory ---- //
	Memory memory = new Memory(65536);

	// ----- Registers ------//
	public short pc = 0;
	public byte ac = 0;
	public byte x = 0;
	public byte y = 0;
	public byte sr = 0;
	public byte sf = 0;

	// --- Flags ----//
	public boolean C;
	public boolean Z;
	public boolean I;
	public boolean D;
	public boolean B;
	public boolean _1;
	public boolean V;
	public boolean N;

	//---- Instruction sets --- -//
	// ADC IMMEDATE
	
	public void ADCResult(int result) {
		ac = (byte) result;
		C = result > 0xFF;
		
		Z = ac == 0;
		
		N = (ac & 0x80) != 0 ;
	}
	
	public void adcIm(byte data) {	

		int result = (ac & 0xFF) + (data & 0XFF) 
				+ (C ? 1 : 0);
		
		ADCResult(result);

	}
	
	
	//ADC Zeropage
	public void adcZp(byte address) {
		
		int result = (ac & 0xFF) + 
				(memory.read((address & 0xFF)) & 0xFF) + (C ? 1 : 0);
	
		ADCResult(result);
	
	
	}
	
	// ADC Zeropage X
	public void adcZpX(byte address) {
		
		byte newAdress = (byte)((int)(address & 0xFF) + (x & 0xFF));
		int result = (ac & 0xFF) + 
				(memory.read((newAdress & 0xFF)) & 0xFF) +
				
				
				(C ? 1 : 0);
	
		ADCResult(result);
		
	}
	
	
	
	
	// ---- LSR -----//
	
	// ---- LSR A-----//
	
	public void lsrA() {
		
		
		C = (ac & 0b00000001) == 0b00000001;
		ac = (byte)((ac & 0xff) >>> 1);
		
		Z = ac == 0;
		
		N = false;
		
		
	}
	
	
	
	// Eor Zpg
	public void eorZp(byte address) {
	    // Zero page adresindeki değeri oku
	    byte memoryValue = memory.read((address & 0xFF)); // Zero page'deki değeri oku
	    
	    // XOR işlemi yap
	    ac = (byte)((ac & 0xFF) ^ (memoryValue & 0xFF)); // Akümülatördeki değer ile okunan değeri XOR yap

	    // Zero flag'i güncelle: Sonuç sıfırsa, Z flag set edilir
	    Z = ac == 0;

	    // Negative flag'i güncelle: Sonuç negatifse, N flag set edilir
	    N = (ac & 0x80) != 0;	
	}
	
	
	
	public void oraXIndexedIndirect(byte baseAddress) {
	    // Zero page adresine X register'ını ekleyerek gerçek adresi hesapla
	    int address = (baseAddress & 0xFF) + (x & 0xFF);

	    // Bellekten değeri oku
	    byte memoryValue = memory.read(address & 0xFF); // Zero page adresinde oku

	    // Akümülatördeki değeri OR işlemi ile güncelle
	    ac = (byte)((ac & 0xFF) | (memoryValue & 0xFF));

	    // Zero flag'i güncelle: Sonuç sıfırsa, Z flag set edilir
	    Z = ac == 0;

	    // Negative flag'i güncelle: Sonuç negatifse, N flag set edilir
	    N = (ac & 0x80) != 0;
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	


}
