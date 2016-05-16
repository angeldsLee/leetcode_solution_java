package com.angeldswang;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Practice1 {

    private final static int MAX = Integer.MAX_VALUE;

    public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
//        Scanner scanner = new Scanner(new FileInputStream("input/A-small-1-attempt0.in"));
        int nCases = scanner.nextInt();
        for(int iCase = 1; iCase <= nCases; iCase++){
            System.out.println(String.format("Case #%d:", iCase));
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int [][] G = new int [N][N];
            int [][] dist = new int [N][N];
            ArrayList<ArrayList<Integer>> edges = new ArrayList<>();

            for (int i = 0; i < N; ++i) {
                for (int j = 0; j < N; ++j) {
                    G[i][j] = MAX;
                    dist[i][j] = MAX;
                }
            }

            for (int i = 0; i < M; ++i) {
                int U = scanner.nextInt();
                int V = scanner.nextInt();
                G[U][V] = scanner.nextInt();
                G[V][U] = G[U][V];
                dist[U][V] = G[U][V];
                dist[V][U] = dist[U][V];
                ArrayList<Integer> edge = new ArrayList<>();
                edge.add(U);
                edge.add(V);
                edges.add(edge);
            }

            for(int k = 0; k < N; k++) {
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        if (dist[i][k] != MAX && dist[k][j] != MAX && dist[i][k] + dist[k][j] < dist[i][j]) {
                            dist[i][j] = dist[i][k] + dist[k][j];
                        }
                    }
                }
            }

            for (int i = 0; i < M; ++i) {
                int U = edges.get(i).get(0);
                int V = edges.get(i).get(1);
                if (dist[U][V] < G[U][V]) {
                    System.out.println(i);
                }
            }


        }
        scanner.close();
    }
}