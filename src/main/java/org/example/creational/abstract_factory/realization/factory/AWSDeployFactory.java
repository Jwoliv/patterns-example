package org.example.creational.abstract_factory.realization.factory;

import org.example.creational.abstract_factory.realization.instance.AWSInstance;
import org.example.creational.abstract_factory.realization.instance.Instance;
import org.example.creational.abstract_factory.realization.storage.AWSStorage;
import org.example.creational.abstract_factory.realization.storage.Storage;

public class AWSDeployFactory implements DeployFactory {
    @Override
    public Instance getInstance() {
        return new AWSInstance();
    }

    @Override
    public Storage getStorage() {
        return new AWSStorage();
    }
}
