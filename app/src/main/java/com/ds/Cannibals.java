package com.ds;

import java.util.Arrays;

public class Cannibals {
    public static void main(String[] args) {
        String[] ip_addresses = {"123.023.123.123", "1.1.1.12", "119.123.45.39", "127.0.0.1"};
        String[] registered_list = {"119.123.45.39"};
        String[] banned_list = {"1.1.1.12"};

        int[] answer = {};

        for (int i = 0; i < ip_addresses.length; i++) {

            System.out.println(ip_addresses[i]);

            for (int j = 0; j < 4; j++) {
                int ipSplit = Integer.parseInt(ip_addresses[i].split("\\.")[j]);

                System.out.println(ipSplit);

                if (ipSplit > 256) {
                    answer[i] = 1;
                } else {
                    switch (ip_addresses[i]) {
                        case "registered": Arrays.asList(registered_list).contains(ip_addresses[i]);
                            answer[i] = 0;
                            break;
                        case "banned": Arrays.asList(banned_list).contains(ip_addresses[i]);
                            answer[i] = 3;
                            break;

                        default:
                            answer[i] = 2;
                            break;
                    }
                    System.out.printf("%d", answer[i]);
                }

            }

        }


    }


}
