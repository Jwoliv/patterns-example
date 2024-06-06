package org.example.creational.abstract_factory.realization.factory;

import org.example.creational.abstract_factory.realization.instance.Instance;
import org.example.creational.abstract_factory.realization.network.Network;
import org.example.creational.abstract_factory.realization.storage.Storage;

public interface DeployFactory {
    Instance getInstance();
    Storage getStorage();
    Network getNetwork();
}
