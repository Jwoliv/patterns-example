package org.example.creational.abstract_factory;

import org.example.creational.abstract_factory.realization.factory.AWSDeployFactory;
import org.example.creational.abstract_factory.realization.factory.AzureDeployFactory;
import org.example.creational.abstract_factory.realization.factory.DeployFactory;

public class Main {
    public static void main(String[] args) {
        DeployFactory awsDeploy = new AWSDeployFactory();
        DeployFactory azureDeploy = new AzureDeployFactory();

        deploy(awsDeploy, "############## AWS ##############");
        deploy(azureDeploy, "############# Azure #############");
    }

    public static void deploy(DeployFactory deployFactory, String title) {
        System.out.println(title);
        startDeploy(deployFactory);
        System.out.println("########### PROCESSING ##########");
        stopDeploy(deployFactory);
        System.out.println();
    }

    public static void startDeploy(DeployFactory deployFactory) {
        deployFactory.getInstance().start();
        deployFactory.getStorage().getInfo();
        deployFactory.getNetwork().healthCheck();
    }

    public static void stopDeploy(DeployFactory deployFactory) {
        deployFactory.getInstance().stop();
        deployFactory.getNetwork().healthCheck();
    }
}
