package com.learning.symboltables;

public class SymbolTableClient {

	public static void main(String[] args) 
	{
		ISymbolTable<String, Integer> symbolTable = new LinkedListSymbolTable<String, Integer>();
		symbolTable.put("S", 0);
		symbolTable.put("E", 1);
		symbolTable.put("A", 2);
		symbolTable.put("R", 3);
		symbolTable.put("C", 4);
		symbolTable.put("H", 5);
		symbolTable.put("E", 6);
		symbolTable.put("X", 7);
		symbolTable.put("A", 8);
		symbolTable.put("M", 9);
		symbolTable.put("P", 10);
		symbolTable.put("L", 11);
		symbolTable.put("E", 12);
		
		System.out.println(" ------------- LINKED LIST SYMBOL TABLE START ----------------");
		System.out.print("(S ==> " + symbolTable.get("S") + ")");
		System.out.print("(E ==> " + symbolTable.get("E") + ")");
		System.out.print("(A ==> " + symbolTable.get("A") + ")");
		System.out.print("(R ==> " + symbolTable.get("R") + ")");
		System.out.print("(C ==> " + symbolTable.get("C") + ")");
		System.out.print("(H ==> " + symbolTable.get("H") + ")");
		System.out.print("(X ==> " + symbolTable.get("X") + ")");
		System.out.print("(M ==> " + symbolTable.get("M") + ")");
		System.out.print("(P ==> " + symbolTable.get("P") + ")");
		System.out.println("(L ==> " + symbolTable.get("L") + ")");
		System.out.println(" ------------- LINKED LIST SYMBOL TABLE END ----------------");
	}

}
