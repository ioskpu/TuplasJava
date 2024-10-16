package org.example;

import org.apache.commons.lang3.tuple.Pair;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Task task = new Task();

        Pair<String, Integer> params = task.returningPair();

        System.out.println("Parametro 1: " + params.getLeft());
        System.out.println("Parametro 2: " + params.getRight());
        }
    }
