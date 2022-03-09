package com.ds;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class ValidParenthesisString {

  static Stack<Character> stack = new Stack<>();

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int N = Integer.parseInt(br.readLine());

    while (N-- > 0) {

      sb.append(answer(br.readLine())).append("\n");


      br.readLine().toCharArray();
    }
    System.out.println(sb);
  }

  public static String answer(String str) {
    char[] chr = str.toCharArray();

    for (char c : chr) {
      if (c == '(') {
        stack.push(c);
      } else if (!stack.empty()) {
        stack.pop();
      } else {
        return "NO";
      }
    }
    /*
    for (int i = 0; i < chr.length; i++) {
      if (chr[i] == '(') {
        stack.push(chr[i]);
      } else if (stack.empty()) {
        return "NO";
      } else {
        stack.pop();
      }
    }
     */
    if (stack.empty()) {
      return "YES";
    } else {
      return "NO";
    }

  }
}