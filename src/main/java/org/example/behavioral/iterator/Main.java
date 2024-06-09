package org.example.behavioral.iterator;

import org.example.behavioral.iterator.realization.client.*;

public class Main {
    public static void main(String[] args) {
        ClientI client = new Client();
        client.invoke();
    }
}
