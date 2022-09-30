package com.ds;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// Queue구조 [ FIFO ] first in first out 
public class Queue10845 {

  static Queue<Integer> queue = new LinkedList<>();

  public static void main(String[] args) throws Exception {

//     Queue 도 Stack 과 비슷한 방식으로 구현할 것

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringBuilder sb = new StringBuilder();

    StringTokenizer st;

    Integer N = Integer.parseInt(br.readLine());


  }

  public static void push(int num) {
    queue.add(num);
  }

  public static int pop() {
    if(queue.isEmpty()) {
      return -1;
    }
    return queue.poll();
  }

  // public static int size() 

} 
