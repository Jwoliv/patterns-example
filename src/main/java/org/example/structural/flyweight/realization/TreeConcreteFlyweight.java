package org.example.structural.flyweight.realization;

import lombok.*;

@Data
@Builder
@ToString
@AllArgsConstructor
public class TreeConcreteFlyweight implements TreeFlyWeight {
    private final Long textureCode;
    private final Long polygonCode;

    @Override
    public void printTreeInfo(TreeExternalContext treeExternalContext) {
        System.out.println(this);
        System.out.println(treeExternalContext);
    }
}
