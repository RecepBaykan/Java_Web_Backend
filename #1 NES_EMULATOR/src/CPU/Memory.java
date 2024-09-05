package CPU;

public class Memory {
	
	public byte[] memory;
	
	public Memory(int size) {
		memory = new byte[size];
		
	}
	
	
	public void write(int adress, byte data) {
		
		try {
			
			memory[adress] = data;
			
		}catch(Exception e){
			
		}
		
	}
	
	
	public byte read(int adress) {
		
		try {
			
			return memory[adress];
			
		}catch(Exception e){
			return 0;
		}
		
	}
	
	
	
	
	
	
	
	
	
	

}
