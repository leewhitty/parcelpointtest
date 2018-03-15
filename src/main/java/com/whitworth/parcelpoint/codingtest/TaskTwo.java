/**
 * 
 */
package com.whitworth.parcelpoint.codingtest;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Lee Whitworth
 *
 */
public class TaskTwo {
	
	private static int armPosition;
	private static ArrayList<ArrayList<String>> boxArrayList = new ArrayList<ArrayList<String>>();
	private static ArrayList<String> boxA = new ArrayList<String>();
	private static ArrayList<String> boxB = new ArrayList<String>();
	private static ArrayList<String> boxC = new ArrayList<String>();
	private static ArrayList<String> boxD = new ArrayList<String>();
	private static ArrayList<String> boxE = new ArrayList<String>();

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//Initialise
		boxArrayList.add(boxA);
		boxArrayList.add(boxB);
		boxArrayList.add(boxC);
		boxArrayList.add(boxD);
		boxArrayList.add(boxE);
		
		// Read Input
		System.out.println("Enter command:");
		Scanner scanner = new Scanner(System.in);
		simulateArm(scanner.nextLine());
		
		String[] boxName = {"A", "B", "C", "D", "E"};
		
		for (int i = 0; i < boxArrayList.size(); i++) {
			ArrayList<String> box = boxArrayList.get(i);
			System.out.println(boxName[i] + box.toString());
		}

	}
	
	/**
	 * Simulates the arm
	 * R = Reset
	 * F = forward
	 * D = Drop box
	 * @param commandInput
	 */
	public static void simulateArm(String commandInput){
		
		for (int i = 0; i < commandInput.length(); i++){
				char command = commandInput.charAt(i);
				
				if (command == 'F'){
					if (armPosition < 5)
						armPosition++;
				}
				else if (command == 'R'){
					armPosition = 0;
				}
				
				else if (command == 'D') {
					if (armPosition > 0) {
						i = dropBox(commandInput, i);
					}
				}
		}
			
		}

	/*
	 * Drop box at position
	 * TODO: add error checking
	 */
	
	private static int dropBox(String commandInput, int charPos){
		
		charPos++;
		ArrayList<String> box = boxArrayList.get(armPosition - 1);
		if (box.size() < 10) {
			
			StringBuilder sb = new StringBuilder();
			
			for (int i = charPos; i < commandInput.length(); i++){				
				char character = commandInput.charAt(i);
				
				if (character == '}')
				break;
				
				if (character != '{')
				sb.append(character);
			}
			
			box.add(sb.toString());
			
		}
		
		return charPos;
	
	}
}
