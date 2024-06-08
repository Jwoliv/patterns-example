package org.example.structural.facade;

import org.example.structural.facade.realization.client.Client;
import org.example.structural.facade.realization.client.ClientI;
import org.example.structural.facade.realization.check.Check;

public class Main {
    public static void main(String[] args) {
        ClientI client = new Client();
        String result = client.proceedCheck(Check.builder().id(1L).sum(1F).tax(2F).tip(0.5F).build());
        System.out.println(result);
    }
}
