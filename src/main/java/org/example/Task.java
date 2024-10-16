package org.example;
import org.apache.commons.lang3.tuple.Pair;

public class Task {

    //retornar string
    public String executeTask() {
        return "Task executed successfully!";
    }

    //retornar una tupla con Pair
    public Pair<String, Integer> returningPair(){
        return Pair.of("Success", 200);
    }

}
