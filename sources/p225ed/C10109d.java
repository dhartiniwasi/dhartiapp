package p225ed;

import java.util.UUID;
import kotlin.jvm.internal.C11669k;
import p401xd.C12997d;

/* renamed from: ed.d */
/* compiled from: Random.kt */
public final class C10109d {
    /* renamed from: a */
    public static final String m51423a() {
        return new C12997d("-").mo38059a(m51424b(), "");
    }

    /* renamed from: b */
    public static final String m51424b() {
        String uuid = UUID.randomUUID().toString();
        C11669k.m56786d(uuid, "randomUUID().toString()");
        return uuid;
    }
}
