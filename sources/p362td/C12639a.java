package p362td;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.C11669k;
import p353sd.C12513a;

/* renamed from: td.a */
/* compiled from: PlatformThreadLocalRandom.kt */
public final class C12639a extends C12513a {
    /* renamed from: c */
    public Random mo37305c() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        C11669k.m56786d(current, "current()");
        return current;
    }
}
