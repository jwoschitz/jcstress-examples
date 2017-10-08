package com.github.jwoschitz.jcstress.concurreny;

import org.openjdk.jcstress.annotations.*;
import org.openjdk.jcstress.infra.results.I_Result;

import java.util.concurrent.atomic.AtomicInteger;

import static org.openjdk.jcstress.annotations.Expect.ACCEPTABLE;
import static org.openjdk.jcstress.annotations.Expect.FORBIDDEN;

@JCStressTest
@Outcome(id = "1", expect = FORBIDDEN,  desc = "One update lost.")
@Outcome(id = "2", expect = ACCEPTABLE, desc = "Both updates.")
@State
public class AtomicityAtomic {
    private AtomicInteger value = new AtomicInteger();

    @Actor
    public void actor1() {
        value.incrementAndGet();
    }

    @Actor
    public void actor2() {
        value.incrementAndGet();
    }

    @Arbiter
    public void arbiter(I_Result r) {
        r.r1 = value.get();
    }
}
