package hashes;

import java.util.HashMap;

import java.util.Scanner;

public class Map { 
	int empid;         //variable for employee id
	String name;		//variable for employee name
	int n;
	Scanner sc=new Scanner(System.in);
	HashMap<Integer,String> hm=new HashMap(); //creating class hashmap object
	public void read() //reading employee details
	{	do
		{
		
		System.out.println("enter the employee id"); //reading employee id
		empid=sc.nextInt();
		System.out.println("enter the employee name");//reading employee name
		name=sc.next();
		hm.put(empid,name);	//setting into map 
		System.out.println("do you want to continiue press 1 for YES 0 for NO");
		n=sc.nextInt();
		}while(n==1);
	}
	public void display()
	{	
		System.out.println("employeeid=====employeename");
		for(int id:hm.keySet())
			
		{	// printing key and values in map 
			System.out.println(id+"====="+hm.get(id));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map obj=new Map();
		obj.read();
		obj.display();
	}

}
