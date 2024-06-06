package org.example.creational.abstract_factory;

import org.example.creational.abstract_factory.realization.factory.AWSDeployFactory;
import org.example.creational.abstract_factory.realization.factory.AzureDeployFactory;
import org.example.creational.abstract_factory.realization.factory.DeployFactory;

public class Main {
    public static void main(String[] args) {
        DeployFactory awsDeploy = new AWSDeployFactory();
        DeployFactory azureDeploy = new AzureDeployFactory();

        System.out.println("############## AWS ##############");
        startDeploy(awsDeploy);
        System.out.println("########### PROCESSING ##########");
        stopDeploy(awsDeploy);

        System.out.println();

        System.out.println("############# Azure #############");
        startDeploy(azureDeploy);
        System.out.println("########### PROCESSING ##########");
        stopDeploy(azureDeploy);
    }

    public static void startDeploy(DeployFactory deployFactory) {
        deployFactory.getInstance().start();
        deployFactory.getStorage().getInfo();
    }

    public static void stopDeploy(DeployFactory deployFactory) {
        deployFactory.getInstance().stop();
    }
}
