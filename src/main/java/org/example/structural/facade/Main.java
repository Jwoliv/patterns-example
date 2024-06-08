package org.example.structural.facade;

import org.example.structural.facade.realization.Client;
import org.example.structural.facade.realization.ClientI;
import org.example.structural.facade.realization.check.Check;

public class Main {
    public static void main(String[] args) {
        ClientI client = new Client();
        String result = client.proceedCheck(Check.builder().id(1L).sum(1F).tax(2F).tip(0.5F).build());
        System.out.println(result);
    }
}
