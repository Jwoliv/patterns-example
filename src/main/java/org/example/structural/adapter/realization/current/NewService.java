package org.example.structural.adapter.realization.current;

import org.example.structural.adapter.realization.old.OldService;

public class NewService implements NewServiceI {
    private final OldService oldService = new OldService();

    @Override
    public void getBaseInfo() {
        oldService.baseInfo();
    }

    @Override
    public void getExtraInfo() {
        oldService.extraInfo();
    }
}
