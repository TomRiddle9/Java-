package com.mfg.beginner;
import java.util.*;
import java.lang.*;
public class Heap_sort{
	
	public void heapify(int arr[], int n , int i) {
		
		int largest = i;
		int left = 2*i+1;
		int right = 2*i+2;
		
		if(left<n && arr[left]>arr[largest])
			largest = left;
		if(right<n && arr[right]>arr[largest])
			largest = right;
		if(largest != i) {
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;
			heapify(arr,n,largest);
		}
	}
	
	public void sort(int arr[], int n) {
		/// Building max heap.
		for(int i = n-1/2; i>=0;i--)
			heapify(arr,n,i);
		/// Then the heap is sorted.
		for(int i = n-1;i>=0;i--) {
			int swap = arr[0];
			arr[0] = arr[i];
			arr[i] = swap;
			heapify(arr,i,0);
		}
	}
	public void print_list(int arr[], int n) {
		for(int i=0;i<n;i++) {
			System.out.println(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		int arr[] = {7,8,9,3,4,5};
		int n = arr.length;
		Heap_sort hp = new Heap_sort();
		hp.sort(arr, n);
		System.out.println("After heap sort.......");
		hp.print_list(arr, n);
	}
}
		