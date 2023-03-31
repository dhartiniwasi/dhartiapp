package p060h4;

import com.google.android.gms.internal.ads.im0;
import com.google.android.gms.internal.ads.p40;
import com.google.android.gms.internal.ads.q40;
import com.google.android.gms.internal.ads.ui0;
import com.google.android.gms.internal.ads.vm0;
import com.google.android.gms.internal.ads.xe0;
import java.util.Random;

/* renamed from: h4.t */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4584t {

    /* renamed from: f */
    private static final C4584t f25005f = new C4584t();

    /* renamed from: a */
    private final im0 f25006a;

    /* renamed from: b */
    private final C4572r f25007b;

    /* renamed from: c */
    private final String f25008c;

    /* renamed from: d */
    private final vm0 f25009d;

    /* renamed from: e */
    private final Random f25010e;

    protected C4584t() {
        im0 im0 = new im0();
        C4572r rVar = new C4572r(new C4535k4(), new C4523i4(), new C4534k3(), new p40(), new ui0(), new xe0(), new q40());
        String f = im0.m14406f();
        vm0 vm0 = new vm0(0, 223104000, true, false, false);
        Random random = new Random();
        this.f25006a = im0;
        this.f25007b = rVar;
        this.f25008c = f;
        this.f25009d = vm0;
        this.f25010e = random;
    }

    /* renamed from: a */
    public static C4572r m30035a() {
        return f25005f.f25007b;
    }

    /* renamed from: b */
    public static im0 m30036b() {
        return f25005f.f25006a;
    }

    /* renamed from: c */
    public static vm0 m30037c() {
        return f25005f.f25009d;
    }

    /* renamed from: d */
    public static String m30038d() {
        return f25005f.f25008c;
    }

    /* renamed from: e */
    public static Random m30039e() {
        return f25005f.f25010e;
    }
}
