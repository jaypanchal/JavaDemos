package com.demo.collectionex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeSet;

class Student implements Comparable<Student> {

	int rollNo;
	String name;
	int age;

	Student(int rollNo, String name, int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student student) {

		if (rollNo > student.rollNo) {
			return 1;
		} else if (rollNo < student.rollNo) {
			return -1;
		} else {
			return 0;
		}
	}

}

public class CollectionExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CollectionExamples collectionExamples = new CollectionExamples();
		// collectionExamples.DemoArrayList();
		// collectionExamples.DemoLinkedList();
		// collectionExamples.DemoHashSet();
		// collectionExamples.DemoTreeSet();
		//collectionExamples.DemoPriorityQueue();
		collectionExamples.DemoMap();

	}
	
	public void DemoMap(){
		
		Map<Integer, String> map = new HashMap<>();
		map.put(null, "Jay");
		map.put(101, "Jay");
		map.put(106, "Jay");
		map.put(107, "Jay");
		map.put(108, "Jay");
		map.put(103, "Jay");
		map.put(1, "Jay");
		map.put(10, "Jay");
		map.put(112, "Jay");
		map.put(109, "Jay");
		
		for(Map.Entry<Integer, String> entry : map.entrySet()){
			System.out.println(entry.getKey() + ", " + entry.getValue());
		}
		
		System.out.println(map);
		
		
	}
	
	public void DemoPriorityQueue() {

		PriorityQueue<String> priorityQueue = new PriorityQueue<>();
		priorityQueue.add("1");
		priorityQueue.add("2");
		priorityQueue.add("3");
		priorityQueue.add("4");
		priorityQueue.add("5");
		priorityQueue.add("6");

		for (String string : priorityQueue) {
			System.out.println(string);
		}
		
		System.out.println("------------------------------");
		
		System.out.println("Head : " + priorityQueue.element());
		System.out.println("Peek : " + priorityQueue.peek());

		System.out.println("Remove : " + priorityQueue.remove());
		
		System.out.println("Head : " + priorityQueue.element());
		System.out.println("Peek : " + priorityQueue.peek());

		
		System.out.println("------------------------------");
		
		for (String string : priorityQueue) {
			System.out.println(string);
		}
		
		//System.out.println("------------------------------");
				
		System.out.println("Poll : " + priorityQueue.poll());
		System.out.println("Head : " + priorityQueue.element());
		System.out.println("Peek : " + priorityQueue.peek());
		
		System.out.println("------------------------------");
		
		for (String string : priorityQueue) {
			System.out.println(string);
		}
		
		System.out.println("Head : " + priorityQueue.element());
		System.out.println("Peek : " + priorityQueue.peek());
	}

	public void DemoTreeSet() {

		Student student1 = new Student(1, "Jay", 24);
		Student student2 = new Student(10, "Jay", 24);
		Student student3 = new Student(2, "Jay", 24);
		Student student4 = new Student(11, "Jay", 24);

		TreeSet<Student> treeSet = new TreeSet<>();
		treeSet.add(student1);
		treeSet.add(student2);
		treeSet.add(student3);
		treeSet.add(student4);

		for (Student student : treeSet) {
			System.out.println("Roll No : " + student.rollNo + ", Name : " + student.name + ", Age : " + student.age);
		}

	}

	public void DemoHashSet() {

		Student student1 = new Student(10, "Jay", 24);
		Student student2 = new Student(10, "Jay", 24);
		Student student3 = new Student(10, "Jay", 24);
		Student student4 = new Student(10, "Jay", 24);

		HashSet<Student> hashSet = new HashSet<>();

		hashSet.add(student1);
		hashSet.add(student1);
		hashSet.add(student1);
		hashSet.add(student2);
		hashSet.add(student3);
		hashSet.add(student4);

		for (Student student : hashSet) {

			System.out.println("Roll No : " + student.rollNo + ", Name : " + student.name + ", Age : " + student.age);
		}

	}

	public void DemoArrayList() {

		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Name1");
		arrayList.add("Name2");
		arrayList.add("Name3");
		arrayList.add("Name4");
		arrayList.add("Name1");

		ArrayList<String> arrayList2 = new ArrayList<>();
		arrayList2.add("Name5");
		arrayList2.add("Name6");

		arrayList.addAll(arrayList2);

		arrayList.retainAll(arrayList2);

		for (String name : arrayList) {
			System.out.println(name);
		}
	}

	public void DemoLinkedList() {

		LinkedList<String> linkedList = new LinkedList<>();

		linkedList.add("1");
		linkedList.add("1");
		linkedList.add("1");
		linkedList.add("1");
		linkedList.add("1");
		linkedList.add("1");

		for (String string : linkedList) {
			System.out.println(string);
		}

		System.out.println("Adding new element");
		linkedList.add(1, "0");

		for (String string : linkedList) {
			System.out.println(string);
		}
	}
}
