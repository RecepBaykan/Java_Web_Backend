package instructions;

import CPU.Memory;

public class InstructionSet {
	
	public Memory memory;
	public byte[] ac;
	
	public InstructionSet(Memory memory, byte[] ac) {
		this.memory = memory;
		this.ac = ac;
	}
	
	
	
}
