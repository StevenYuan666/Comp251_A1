import java.io.*;
import java.util.*;

public class Open_Addressing {
     public int m; // number of SLOTS AVAILABLE
     public int A; // the default random number
     int w;
     int r;
     public int[] Table;

     protected Open_Addressing(int w, int seed, int A) {

         this.w = w;
         this.r = (int) (w-1)/2 +1;
         this.m = power2(r);
         if (A==-1){
            this.A = generateRandom((int) power2(w-1), (int) power2(w),seed);
         }
        else{
            this.A = A;
        }
         this.Table = new int[m];
         for (int i =0; i<m; i++) {
             Table[i] = -1;
         }
         
     }
     
                 /** Calculate 2^w*/
     public static int power2(int w) {
         return (int) Math.pow(2, w);
     }
     public static int generateRandom(int min, int max, int seed) {     
         Random generator = new Random(); 
                 if(seed>=0){
                    generator.setSeed(seed);
                 }
         int i = generator.nextInt(max-min-1);
         return i+min+1;
     }
        /**Implements the hash function g(k)*/
     //define the h(k) inside the g(k,i)
     	int g (int key) {
     		//calculate the value before right shift
        	int beforeShift = A * key % (Chaining.power2(w));
        	//do the right shift
        	int toShift = w - r;
        	String s = Integer.toBinaryString(beforeShift);
        	String tmp = "";
        	for(int i = 0; i < (s.length() - toShift); i ++) {
        		tmp += s.toCharArray()[i];
        	}
        	if(tmp == "") {
        		return 0;
        	}
        	else {
            	int result = Integer.valueOf(tmp,2);
            	return result;
        	}
     	}
        public int probe(int key, int i) {
            //TODO: implement this function and change the return statement.
        	
            int result = (g(key) + i) % (Open_Addressing.power2(r));
            return result;
     }
     
     
     /**Inserts key k into hash table. Returns the number of collisions encountered*/
        public int insertKey(int key){
            //TODO : implement this and change the return statement.
        	int i = 0;
        	int index = probe(key, i);
        	int counter = 0;
        	//find an empty space for the new key
        	while(index >= 0 && index < m && this.Table[index] != -1 && i < m) {
        		i ++;
        		index = probe(key,i);
        		counter ++;
        	}
        	if(index >= 0 && index < m && this.Table[index] == -1) {
                this.Table[index] = key;
        	}
        	return counter;
        }
        
        /**Sequentially inserts a list of keys into the HashTable. Outputs total number of collisions */
        public int insertKeyArray (int[] keyArray){
            //TODO
            int collision = 0;
            for (int key: keyArray) {
                collision += insertKey(key);
            }
            return collision;
        }
            
         /**Inserts key k into hash table. Returns the number of collisions encountered*/
        public int removeKey(int key){
            //TODO: implement this and change the return statement
        	int i = 0;
        	int index = probe(key, i);
        	int counter = 0;
        	//find the key with the minimal iterations
        	while(index >= 0 && index < m && this.Table[index] != key && i < m) {
        		i ++;
        		index = probe(key,i);
        		counter ++;
        		//When we encounter the key -1, which means we will not find the target key
        		if(this.Table[index] == -1) {
        			break;
        		}
        	}
        	//Use another notation for the key we removed, so that it will not affect the following removes
        	if(index >= 0 && index < m && this.Table[index] == key) {
        		this.Table[index] = -2;
        	}
        	return counter;
        }
}
