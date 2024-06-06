package org.example.creational.abstract_factory.realization.factory;

import org.example.creational.abstract_factory.realization.instance.AzureInstance;
import org.example.creational.abstract_factory.realization.instance.Instance;
import org.example.creational.abstract_factory.realization.network.AzureNetwork;
import org.example.creational.abstract_factory.realization.network.Network;
import org.example.creational.abstract_factory.realization.storage.AzureStorage;
import org.example.creational.abstract_factory.realization.storage.Storage;

public class AzureDeployFactory implements DeployFactory {
    @Override
    public Instance getInstance() {
        return new AzureInstance();
    }

    @Override
    public Storage getStorage() {
        return new AzureStorage();
    }

    @Override
    public Network getNetwork() {
        return new AzureNetwork();
    }
}
