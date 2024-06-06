package org.example.creational.object_pool;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;

@ToString
@AllArgsConstructor
class ObjectPooled {
    private Long id;
}

class ObjectPool {

    private Long count;

    private final List<ObjectPooled> free = new ArrayList<>();
    private final List<ObjectPooled> taken = new ArrayList<>();


    public ObjectPool(Long count) {
        this.count = count;
    }

    AtomicLong atomicLong = new AtomicLong(0L);

    ObjectPooled get() {
        if (free.isEmpty()) {
            if (count <= atomicLong.get()) {
                return null;
            }
            ObjectPooled objectPooled = new ObjectPooled(atomicLong.addAndGet(1L));
            free.add(objectPooled);
            return objectPooled;
        }
        ObjectPooled objectPooled = free.get(0);
        free.remove(objectPooled);
        taken.add(objectPooled);
        return objectPooled;
    }

    void release(ObjectPooled objectPooled) {
        taken.remove(objectPooled);
        free.add(objectPooled);
    }
}


public class Main {


    public static void main(String[] args) {
        ObjectPool objectPool = new ObjectPool(2L);
        System.out.println(objectPool.get());
        System.out.println(objectPool.get());
        System.out.println(objectPool.get());
        System.out.println(objectPool.get());
    }
}
