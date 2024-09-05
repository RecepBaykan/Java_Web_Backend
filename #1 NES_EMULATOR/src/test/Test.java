package test;

import CPU.CPU;

public class Test {
	
	public static void main(String[] args) {
		
		
		CPU cpu = new CPU();
		
		cpu.ac = 4;
		cpu.lsrA();
		cpu.eorZp((byte)0x00);
		cpu.oraXIndexedIndirect((byte)0x00);
		
		System.out.println( String.format("%02X", cpu.ac));
		
	}

}
