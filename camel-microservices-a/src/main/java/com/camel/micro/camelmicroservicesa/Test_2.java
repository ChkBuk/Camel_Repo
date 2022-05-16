package com.camel.micro.camelmicroservicesa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
//		list.add(-4);list.add(3);
//		list.add(-9);list.add(4);
//		list.add(0);list.add(1);
		list.add(1);list.add(2);
		list.add(9);list.add(1);
		list.add(2);list.add(9);list.add(7);
		//miniMaxSum(list);
		//System.out.println(timeConversion("05:05:45PM"));
		BinaryTree tree = new BinaryTree();

		  tree.root = new Node(20);
		  tree.root.left = new Node(10);
		  tree.root.right = new Node(30);
		  tree.root.left.left = new Node(8);
		  tree.root.left.right = new Node(12);
		  
		  tree.root.right.left = new Node(25);
		  tree.root.right.right = new Node(40);
		System.out.println(isPresent(null, 0));
	}
	
	public static void miniMaxSum(List<Integer> arr) {
	    // Write your code here
		int[] convertToArr = new int[6];
		int i=0;
		for (int integer: arr) {
			convertToArr [i]= integer;
			i++;
		}
		Arrays.sort(convertToArr);
		//System.out.print(convertToArr[0]);System.out.print(convertToArr[1]);System.out.print(convertToArr[2]);
		int length = convertToArr.length-1;
		int min = convertToArr[1]+convertToArr[2]+convertToArr[3]+convertToArr[4];
		int max = convertToArr[length]+convertToArr[length-1]+convertToArr[length-2]+convertToArr[length-3];
		System.out.println(min +" "+max);
	
	}
	  public static String timeConversion(String s) {
		  int newVal =  (("12").equals(s.substring(0,2)))? (Integer.parseInt(s.substring(0,2))) : (Integer.parseInt(s.substring(0,2))+12);
		  if(("AM").equals(s.substring(8,10))){
			  return (("12").equals(s.substring(0,2)))? "00:"+s.substring(3,8): s.substring(0,8);
		  }else {
			  return Integer.toString(newVal)+""+s.substring(2,8);
		  }
			  
	  }
	  
	  public static int lonelyinteger(List<Integer> a) {
		   Set<Integer> set =new HashSet<Integer>();
		   List<Integer> temp = new ArrayList<Integer> ();
		   
		   for (Integer integer : a) {
			   if(!set.add(integer)) {
				   temp.add(integer);
			   }
		   }
		   
		   set.removeAll(temp);
		  Object[] array = set.toArray();
		   return Integer.parseInt(array[0].toString());
	  }
	  
	  public static int diagonalDifference(List<List<Integer>> arr) {
		    // Write your code here
		  int d1 =0;
		  int d2 =0;
		  int length = arr.size();
		  for(int i=0; i<length;i++) {
			   d1  += arr.get(i).get(i);
			   d2 += arr.get(i).get(length-1);
		  }
		  if(d1<0 && d2 <0) {
			  d1 =-1*d1;
			  d2 =-1*d2;
		  }else if(d1<0 && d2>0) {
			  d1 =-1*d1;
		  }else {
			  d2 =-1*d2;
		  }
		  
		  if(d1-d2>0) {
			  return (d1-d2);
		  }else {
			  return (d2-d1);
		  }
			  
	  }

	  private static int isPresent(Node root, int val){


		  return 1;
	  }

}

class BinaryTree {
	  Node root;

	  BinaryTree(int key) {
	  root = new Node(key);
	  }

	  BinaryTree() {
	  root = null;
	  }

	  // Traverse Inorder
	  public void traverseInOrder(Node node) {
	  if (node != null) {
	    traverseInOrder(node.left);
	    System.out.print(" " + node.data);
	    traverseInOrder(node.right);
	  }
	  }
}  
	  
class Node {
		Node left, right;
		int data;
              Node(int newData) {
			left = right = null;
			data = newData;
		}
	}