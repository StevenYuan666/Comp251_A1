import java.io.*;
import java.util.*;


public class main {
	//define the scores for testers
		static int mini = 0;
		static int heavy = 0;
	public static void main(String[] args) {
        // TODO:build the hash table and insert keys using the insertKeyArray function
		
		//Run the test cases from the CodePost first
		System.out.println("Running the mini tester from CodePost now...");
		//Chaining Tests
		chainTest1();
		chainTest2();
		chainTest3();
		//Probe Tests
		probeTest1();
		probeTest2();
		probeTest3();
		System.out.println("Completed the mini tester. Your score is [ " + mini + " / 6 ]");
		
		//Run the heavy test cases designed by myself
		System.out.println("Now, checking by using the heavy tester...");
		//chain
		chainTest4();
		chainTest5();
		chainTest6();
		//probe
		probeTest4();
		probeTest5();
		probeTest6();
		//Test if the number of collision is right
		System.out.println("Testing if the number of collisions is right...");
		//insertKey in Chaining
		chainInsert1();
		chainInsert2();
		chainInsert3();
		//insertKey in Open_Addressing
		addInsert1();
		addInsert2();
		addInsert3();
		//Test if the number of collision is right//removeKey in Open_Addressing
		removeTest1();
		removeTest2();
		removeTest3();
		//Test if insert successfully
		System.out.println("Testing if insert/remove successfully...");
		chainInsert4();
		chainInsert5();
		chainInsert6();
		addInsert4();
		addInsert5();
		addInsert6();
		//Test if remove successfully//removeKey in Open_Addressing
		removeTest4();
		removeTest5();
		removeTest6();
		System.out.println("Completed the heavy tester. Your score is [ " + heavy + " / 24 ]");
	}
	
	//Tests for Chain from CodePost
	public static void chainTest1() {
		Chaining c1 = new Chaining (10, 0, -1);
		int k1 = c1.chain(1);
		if(k1 == 30) {
			System.out.println("Chain Test1 Passed. Pts [ 1 / 1 ]");
			mini += 1;
		}
		else {
			System.out.println("Chain Test1 Failed. Pts [ 0 / 1 ]");
		}
	}
	
	public static void chainTest2() {
		Chaining c2 = new Chaining(10, 0, -1);
		int k2 = c2.chain(4);
		if(k2 == 25) {
			System.out.println("Chain Test2 Passed. Pts [ 1 / 1 ]");
			mini += 1;
		}
		else {
			System.out.println("Chain Test2 Failed. Pts [ 0 / 1 ]");
		}
	}
	
	public static void chainTest3() {
		Chaining c3 = new Chaining(10, 0, -1);
		int k3 = c3.chain(8);
		if(k3 == 19) {
			System.out.println("Chain Test3 Passed. Pts [ 1 / 1 ]");
			mini += 1;
		}
		else {
			System.out.println("Chain Test3 Failed. Pts [ 0 / 1 ]");
		}
	}
	
	//Tests for Probe from CodePost
	public static void probeTest1() {
		Open_Addressing o1 = new Open_Addressing(10, 0, -1);
		int k1 = o1.probe(1, 0);
		if(k1 == 30) {
			System.out.println("Probe Test1 Passed. Pts [ 1 / 1 ]");
			mini += 1;
		}
		else {
			System.out.println("Probe Test1 Failed. Pts [ 0 / 1 ]");
		}
	}
	
	public static void probeTest2() {
		Open_Addressing o2 = new Open_Addressing(10, 0, -1);
		int k2 = o2.probe(1, 1);
		if(k2 == 31) {
			System.out.println("Probe Test2 Passed. Pts [ 1 / 1 ]");
			mini += 1;
		}
		else {
			System.out.println("Probe Test2 Failed. Pts [ 0 / 1 ]");
		}
	}
	
	public static void probeTest3() {
		Open_Addressing o3 = new Open_Addressing(10, 0, -1);
		int k3 = o3.probe(1, 3);
		if(k3 == 1) {
			System.out.println("Probe Test3 Passed. Pts [ 1 / 1 ]");
			mini += 1;
		}
		else {
			System.out.println("Probe Test3 Failed. Pts [ 0 / 1 ]");
		}
	}
	
	//HEAVY TESTER DESIGNED BY MYSELF
	//Chain Part
	public static void chainTest4() {
		Chaining c4 = new Chaining(4, 1205, -1);
		int k4 = c4.chain(207);
		if(k4 == 0) {
			System.out.println("Chain Test4 Passed. Pts [ 1 / 1 ]");
			heavy += 1;
		}
		else {
			System.out.println("Chain Test4 Failed. Pts [ 0 / 1 ]");
		}
	}
	
	public static void chainTest5() {
		Chaining c5 = new Chaining(7, 207, 93);
		int k5 = c5.chain(1205);
		if(k5 == 8) {
			System.out.println("Chain Test5 Passed. Pts [ 1 / 1 ]");
			heavy += 1;
		}
		else {
			System.out.println("Chain Test5 Failed. Pts [ 0 / 1 ]");
		}
	}
	
	public static void chainTest6() {
		Chaining c6 = new Chaining(5, 290, 23);
		int k6 = c6.chain(3180);
		if(k6 == 5) {
			System.out.println("Chain Test6 Passed. Pts [ 1 / 1 ]");
			heavy += 1;
		}
		else {
			System.out.println("Chain Test6 Failed. Pts [ 0 / 1 ]");
		}
	}
	
	//Probe Part
	public static void probeTest4() {
		Open_Addressing o4 = new Open_Addressing(4, 1205, -1);
		int k4 = o4.probe(207, 3);
		if(k4 == 3) {
			System.out.println("Probe Test4 Passed. Pts [ 1 / 1 ]");
			heavy += 1;
		}
		else {
			System.out.println("Probe Test4 Failed. Pts [ 0 / 1 ]");
		}
	}
	
	public static void probeTest5() {
		Open_Addressing o5 = new Open_Addressing(7, 207, 93);
		int k5 = o5.probe(1205, 4);
		if(k5 == 12) {
			System.out.println("Probe Test5 Passed. Pts [ 1 / 1 ]");
			heavy += 1;
		}
		else {
			System.out.println("Probe Test5 Failed. Pts [ 0 / 1 ]");
		}
	}
	
	public static void probeTest6() {
		Open_Addressing o6 = new Open_Addressing(5, 290, 23);
		int k6 = o6.probe(3180, 1);
		if(k6 == 6) {
			System.out.println("Probe Test6 Passed. Pts [ 1 / 1 ]");
			heavy += 1;
		}
		else {
			System.out.println("Probe Test6 Failed. Pts [ 0 / 1 ]");
		}
	}
	
	//Chaining.insertKey Part
	public static void chainInsert1() {
		Chaining c1 = new Chaining(10, 0, -1);
		int[] keys = {12, 5, 2, 7, 2020, 2000};
		int collision = c1.insertKeyArray(keys);
		if(collision == 3) {
			System.out.println("Chaining.insertKey Test1 Passed. Pts [ 1 / 1 ]");
			heavy += 1;
		}
		else {
			System.out.println("Chaining.insertKey Test1 Failed. Pts [ 0 / 1 ]");
		}
	}
	
	public static void chainInsert2() {
		Chaining c2 = new Chaining(4, 1205, -1);
		int[] keys = {12, 5, 2, 7, 2020, 2000};
		int collision = c2.insertKeyArray(keys);
		if(collision == 2) {
			System.out.println("Chaining.insertKey Test2 Passed. Pts [ 1 / 1 ]");
			heavy += 1;
		}
		else {
			System.out.println("Chaining.insertKey Test2 Failed. Pts [ 0 / 1 ]");
		}
	}
	
	public static void chainInsert3() {
		Chaining c3 = new Chaining(7, 207, 93);
		int[] keys = {12, 5, 2, 7, 2020, 2000};
		int collision = c3.insertKeyArray(keys);
		if(collision == 1) {
			System.out.println("Chaining.insertKey Test3 Passed. Pts [ 1 / 1 ]");
			heavy += 1;
		}
		else {
			System.out.println("Chaining.insertKey Test3 Failed. Pts [ 0 / 1 ]");
		}
	}
	
	public static void chainInsert4() {
		Chaining c4 = new Chaining(10, 0, -1);
		int[] keys = {12, 5, 2, 7, 2020, 2000};
		c4.insertKeyArray(keys);
		boolean condition = false;
		for(int i = 0; i < keys.length; i++) {
			ArrayList<Integer> tmp = c4.Table.get(c4.chain(keys[i]));
			for(int j = 0; j < tmp.size(); j++) {
				if(tmp.get(j) == keys[i]) {
					condition = true;
					break;
				}
				else {
					condition = false;
				}
			}
		}
		if(condition) {
			System.out.println("Chaining.insertKey Test4 Passed. Pts [ 1 / 1 ]");
			heavy += 1;
		}
		else {
			System.out.println("Chaining.insertKey Test4 Failed. Pts [ 0 / 1 ]");
		}
	}
	
	public static void chainInsert5() {
		Chaining c5 = new Chaining(4, 1205, -1);
		int[] keys = {12, 5, 2, 7, 2020, 2000};
		c5.insertKeyArray(keys);
		boolean condition = false;
		for(int i = 0; i < keys.length; i++) {
			ArrayList<Integer> tmp = c5.Table.get(c5.chain(keys[i]));
			for(int j = 0; j < tmp.size(); j++) {
				if(tmp.get(j) == keys[i]) {
					condition = true;
					break;
				}
				else {
					condition = false;
				}
			}
		}
		if(condition) {
			System.out.println("Chaining.insertKey Test5 Passed. Pts [ 1 / 1 ]");
			heavy += 1;
		}
		else {
			System.out.println("Chaining.insertKey Test5 Failed. Pts [ 0 / 1 ]");
		}
	}
	
	public static void chainInsert6() {
		Chaining c6 = new Chaining(7, 207, 93);
		int[] keys = {12, 5, 2, 7, 2020, 2000};
		c6.insertKeyArray(keys);
		boolean condition = false;
		for(int i = 0; i < keys.length; i++) {
			ArrayList<Integer> tmp = c6.Table.get(c6.chain(keys[i]));
			for(int j = 0; j < tmp.size(); j++) {
				if(tmp.get(j) == keys[i]) {
					condition = true;
					break;
				}
				else {
					condition = false;
				}
			}
		}
		if(condition) {
			System.out.println("Chaining.insertKey Test6 Passed. Pts [ 1 / 1 ]");
			heavy += 1;
		}
		else {
			System.out.println("Chaining.insertKey Test6 Failed. Pts [ 0 / 1 ]");
		}
	}
	
	//Open_Addressing.insertKey Part
	public static void addInsert1() {
		Open_Addressing o1 = new Open_Addressing(10, 0, -1);
		int[] keys = {12, 5, 2, 7, 1, 3};
		int collision = o1.insertKeyArray(keys);
		if(collision == 0) {
			System.out.println("Open_Addressing.insertKey Test1 Passed. Pts [ 1 / 1 ]");
			heavy += 1;
		}
		else {
			System.out.println("Open_Addressing.insertKey Test1 Failed. Pts [ 0 / 1 ]");
		}
	}
	
	public static void addInsert2() {
		Open_Addressing o2 = new Open_Addressing(4, 1205, -1);
		int[] keys = {12, 5, 2, 7, 1998, 2000};
		/*
		System.out.println(o2.probe(12, 0));
		System.out.println(o2.probe(5, 0));
		System.out.println(o2.probe(2, 0));
		System.out.println(o2.probe(7, 0));
		System.out.println(o2.probe(1998, 0));
		System.out.println(o2.probe(1998, 1));
		System.out.println(o2.probe(1998, 2));
		System.out.println(o2.probe(1998, 3));
		System.out.println(o2.probe(2000, 0));
		System.out.println(o2.probe(2000, 1));
		System.out.println(o2.probe(2000, 2));
		System.out.println(o2.probe(2000, 3));
		*/
		int collision = o2.insertKeyArray(keys);
		if(collision == 8) {
			System.out.println("Open_Addressing.insertKey Test2 Passed. Pts [ 1 / 1 ]");
			heavy += 1;
		}
		else {
			System.out.println("Open_Addressing.insertKey Test2 Failed. Pts [ 0 / 1 ]");
		}
	}
	
	public static void addInsert3() {
		Open_Addressing o3 = new Open_Addressing(5, 290, 23);
		int[] keys = {12, 5, 2, 7, 1998, 2000};
		/*
		System.out.println(o3.probe(12, 0));
		System.out.println(o3.probe(5, 0));
		System.out.println(o3.probe(2, 0));
		System.out.println(o3.probe(7, 0));
		System.out.println(o3.probe(1998, 0));
		System.out.println(o3.probe(1998, 1));
		System.out.println(o3.probe(2000, 0));
		System.out.println(o3.probe(2000, 1));
		System.out.println(o3.probe(2000, 2));
		*/
		int collision = o3.insertKeyArray(keys);
		if(collision == 3) {
			System.out.println("Open_Addressing.insertKey Test3 Passed. Pts [ 1 / 1 ]");
			heavy += 1;
		}
		else {
			System.out.println("Open_Addressing.insertKey Test3 Failed. Pts [ 0 / 1 ]");
		}
	}
	
	public static void addInsert4() {
		Open_Addressing o4 = new Open_Addressing(10, 0, -1);
		int[] keys = {12, 5, 2, 7, 1, 3};
		o4.insertKeyArray(keys);
		boolean condition = false;
		int l = 0;
		if(keys.length <= o4.w) {
			l = keys.length;
		}
		else {
			l = keys.length - o4.w;
		}
		for(int i = 0; i < l; i ++) {
			int index = o4.probe(keys[i], o4.insertKey(keys[i]));
			if(index >= 0 && o4.Table[index] == keys[i]) {
				condition = true;
			}
			else {
				condition = false;
			}
		}
		if(condition) {
			System.out.println("Open_Addressing.insertKey Test4 Passed. Pts [ 1 / 1 ]");
			heavy += 1;
		}
		else {
			System.out.println("Open_Addressing.insertKey Test4 Failed. Pts [ 0 / 1 ]");
		}
	}
	
	public static void addInsert5() {
		Open_Addressing o5 = new Open_Addressing(4, 1205, -1);
		int[] keys = {12, 5, 2, 7, 1998, 2000};
		o5.insertKeyArray(keys);
		boolean condition = false;
		int l = 0;
		if(keys.length <= o5.w) {
			l = keys.length;
		}
		else {
			l = keys.length - o5.w;
		}
		for(int i = 0; i < l; i ++) {
			int index = o5.probe(keys[i], o5.insertKey(keys[i]));
			if(index >= 0 && o5.Table[index] == keys[i]) {
				condition = true;
			}
			else {
				condition = false;
			}
		}
		if(condition) {
			System.out.println("Open_Addressing.insertKey Test5 Passed. Pts [ 1 / 1 ]");
			heavy += 1;
		}
		else {
			System.out.println("Open_Addressing.insertKey Test5 Failed. Pts [ 0 / 1 ]");
		}
	}
	
	public static void addInsert6() {
		Open_Addressing o6 = new Open_Addressing(5, 290, 23);
		int[] keys = {12, 5, 2, 7, 1998, 2000};
		o6.insertKeyArray(keys);
		boolean condition = false;
		int l = 0;
		if(keys.length <= o6.w) {
			l = keys.length;
		}
		else {
			l = keys.length - o6.w;
		}
		for(int i = 0; i < l; i ++) {
			int index = o6.probe(keys[i], o6.insertKey(keys[i]));
			if(index >= 0 && o6.Table[index] == keys[i]) {
				condition = true;
			}
			else {
				condition = false;
			}
		}
		if(condition) {
			System.out.println("Open_Addressing.insertKey Test6 Passed. Pts [ 1 / 1 ]");
			heavy += 1;
		}
		else {
			System.out.println("Open_Addressing.insertKey Test6 Failed. Pts [ 0 / 1 ]");
		}
	}
	
	public static void removeTest1() {
		Open_Addressing o1 = new Open_Addressing(10, 0, -1);
		int[] keys = {12, 5, 2, 7, 1, 3};
		o1.insertKeyArray(keys);
		int collision = o1.removeKey(12);
		if(collision == 0) {
			System.out.println("Open_Addressing.removeKey Test1 Passed. Pts [ 1 / 1 ]");
			heavy += 1;
		}
		else {
			System.out.println("Open_Addressing.removeKey Test1 Failed. Pts [ 0 / 1 ]");
		}
	}
	
	public static void removeTest2() {
		Open_Addressing o2 = new Open_Addressing(4, 1205, -1);
		int[] keys = {12, 5, 2, 7, 1998, 2000};
		o2.insertKeyArray(keys);
		int collision1 = o2.removeKey(1998);
		int collision2 = o2.removeKey(2000);
		if(collision1 == 4 && collision2 == 4) {
			System.out.println("Open_Addressing.removeKey Test2 Passed. Pts [ 1 / 1 ]");
			heavy += 1;
		}
		else {
			System.out.println("Open_Addressing.removeKey Test2 Failed. Pts [ 0 / 1 ]");
		}
	}
	
	public static void removeTest3() {
		Open_Addressing o3 = new Open_Addressing(5, 290, 23);
		int[] keys = {12, 5, 2, 7, 1998, 2000};
		o3.insertKeyArray(keys);
		int collision1 = o3.removeKey(1998);
		int collision2 = o3.removeKey(2000);
		if(collision1 == 1 && collision2 == 2) {
			System.out.println("Open_Addressing.removeKey Test3 Passed. Pts [ 1 / 1 ]");
			heavy += 1;
		}
		else {
			System.out.println("Open_Addressing.removeKey Test3 Failed. Pts [ 0 / 1 ]");
		}
	}
	
	public static void removeTest4() {
		Open_Addressing o4 = new Open_Addressing(10, 0, -1);
		int[] keys = {12, 5, 2, 7, 1, 3};
		o4.insertKeyArray(keys);
		o4.removeKey(12);
		boolean condition = true;
		int[] t = o4.Table;
		for(int i = 0; i < t.length; i++) {
			if(t[i] == 12) {
				condition = false;
			}
		}
		if(condition) {
			System.out.println("Open_Addressing.removeKey Test4 Passed. Pts [ 1 / 1 ]");
			heavy += 1;
		}
		else {
			System.out.println("Open_Addressing.removeKey Test4 Failed. Pts [ 0 / 1 ]");
		}
	}
	
	public static void removeTest5() {
		Open_Addressing o5 = new Open_Addressing(4, 1205, -1);
		int[] keys = {12, 5, 2, 7, 1998, 2000};
		o5.insertKeyArray(keys);
		o5.removeKey(1998);
		boolean condition = true;
		int[] t = o5.Table;
		for(int i = 0; i < t.length; i++) {
			if(t[i] == 1998) {
				condition = false;
			}
		}
		if(condition) {
			System.out.println("Open_Addressing.removeKey Test5 Passed. Pts [ 1 / 1 ]");
			heavy += 1;
		}
		else {
			System.out.println("Open_Addressing.removeKey Test5 Failed. Pts [ 0 / 1 ]");
		}
	}
	
	public static void removeTest6() {
		Open_Addressing o6 = new Open_Addressing(5, 290, 23);
		int[] keys = {12, 5, 2, 7, 1998, 2000};
		o6.insertKeyArray(keys);
		o6.removeKey(2000);
		boolean condition = true;
		int[] t = o6.Table;
		for(int i = 0; i < t.length; i++) {
			if(t[i] == 2000) {
				condition = false;
			}
		}
		if(condition) {
			System.out.println("Open_Addressing.removeKey Test6 Passed. Pts [ 1 / 1 ]");
			heavy += 1;
		}
		else {
			System.out.println("Open_Addressing.removeKey Test6 Failed. Pts [ 0 / 1 ]");
		}
	}
}
