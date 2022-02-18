package com.ds;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Stack {

  static int[] stack;
  static int size = 0;

  public static void main(String[] args) throws Exception {
    // 콘솔 창에서 입력한 데이터를 읽는다.
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 문자열로 이루어진 배열들 => 문제들을 담을 바구니
    StringBuilder sb = new StringBuilder();

    // StringBuilder 배열에 있는 데이터들을 하나하나 읽어줄 토큰
    StringTokenizer st;

    // 명령의 수 
    int N = Integer.parseInt(br.readLine());
    stack = new int[N];


    while (N-- > 0) {
      // => BufferedReader 로 읽어들인 String을 공백을 기준으로 따로 읽는다. 
      st = new StringTokenizer(br.readLine(), " ");

      switch (st.nextToken()) {
        case "push":
          push(Integer.parseInt(st.nextToken()));
          break;
        case "pop":
          sb.append(pop()).append("\n");
          break;
        case "size":
          sb.append(size()).append("\n");
          break;
        case "empty":
          sb.append(empty()).append("\n");
          break;
        case "top":
          sb.append(top()).append("\n");
          break;
      }
    }

    System.out.println(sb);

  }

  public static void push(int num) {
    stack[size++] = num;
  }

  public static int pop() {
    if (size != 0) {
      int old = stack[--size];
      //      stack[size + 1] = 0;
      return old;
    }
    return -1;
  }

  public static int size() {
    return size;
  }

  public static int empty() {
    if (size == 0) {
      return 1;
    }
    return 0;
  }

  public static int top() {
    if (size == 0) {
      return -1;
    }
    return stack[size - 1];
  }

}
