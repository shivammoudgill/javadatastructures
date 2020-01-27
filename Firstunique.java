/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Firstunique {
    static char func(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))==true){
                int value = map.get(str.charAt(i));
                map.put(str.charAt(i),value+1);
            }
            else{
                map.put(str.charAt(i),1);
            }
        }
        for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i))==1){
                return str.charAt(i);
            }
        }
        return '1';
    }
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
		int a = sc.nextInt();
		String str = sc.next();
		if(func(str)!='1')
		System.out.println(func(str));
		else
		System.out.println("-1");
		}
	}
}