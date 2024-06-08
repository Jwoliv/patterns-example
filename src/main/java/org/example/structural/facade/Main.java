package org.example.structural.facade;

import org.example.structural.facade.realization.Client;
import org.example.structural.facade.realization.ClientI;
import org.example.structural.facade.realization.check.Check;

public class Main {
    public static void main(String[] args) {
        ClientI client = new Client();
        client.proceedCheck(Check.builder().build());
    }
}
