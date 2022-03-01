package com.try_catch;

import javax.sound.midi.SysexMessage;

public class Nested_Try_01 {
	public static void main(String[] args) {
		
		try {  // block-1
			try {  // block-2
				try  {  // block-3
					int[] arr = {10, 20, 30, 40, 50};
					System.out.println(arr[10]);
					}
				catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("ArrayIndexOutOfBoundsException in block - 3");
					throw e;
					}
				}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutOfBoundsException in block - 2");
				throw e;
				}
			}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException in block - 1");
			}
		
		
			
		
	}

}
