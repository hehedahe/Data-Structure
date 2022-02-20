package com.ds;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ValidParenthesisString {

  public static String[] stack;
  public static int size = 0;

  public static void main(String[] args) throws Exception {
    // 콘솔 창에서 입력한 데이터를 읽는다.
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 문자열로 이루어진 배열들 => 문제들을 담을 바구니
    StringBuilder sb = new StringBuilder();

    // StringBuilder 배열에 있는 데이터들을 하나하나 읽어줄 토큰
    StringTokenizer st;

    // 명령의 수 
    int N = Integer.parseInt(br.readLine());
    stack = new String[N];

  }


}
