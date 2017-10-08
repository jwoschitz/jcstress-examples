package com.github.jwoschitz.jcstress.concurreny;


import org.openjdk.jcstress.annotations.*;
import org.openjdk.jcstress.infra.results.I_Result;

import static org.openjdk.jcstress.annotations.Expect.ACCEPTABLE;
import static org.openjdk.jcstress.annotations.Expect.ACCEPTABLE_INTERESTING;

@JCStressTest
@Outcome(id = "1", expect = ACCEPTABLE_INTERESTING, desc = "One update lost.")
@Outcome(id = "2", expect = ACCEPTABLE,  desc = "Both updates.")
@State
public class AtomicityBasic {
    private int value;

    @Actor
    public void actor1() {
        value++;
    }

    @Actor
    public void actor2() {
        value++;
    }

    @Arbiter
    public void arbiter(I_Result r) {
        r.r1 = value;
    }
}
