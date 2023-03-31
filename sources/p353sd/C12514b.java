package p353sd;

import java.util.Random;
import kotlin.jvm.internal.C11669k;

/* renamed from: sd.b */
/* compiled from: PlatformRandom.kt */
public final class C12514b extends C12513a {

    /* renamed from: c */
    private final C12515a f45977c = new C12515a();

    /* renamed from: sd.b$a */
    /* compiled from: PlatformRandom.kt */
    public static final class C12515a extends ThreadLocal<Random> {
        C12515a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Random initialValue() {
            return new Random();
        }
    }

    /* renamed from: c */
    public Random mo37305c() {
        Object obj = this.f45977c.get();
        C11669k.m56786d(obj, "implStorage.get()");
        return (Random) obj;
    }
}
