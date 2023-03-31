package p014b2;

import android.media.AudioAttributes;
import android.os.Bundle;
import p161w3.C5953m0;
import p177z1.C6224h;

/* renamed from: b2.e */
/* compiled from: AudioAttributes */
public final class C1624e implements C6224h {

    /* renamed from: g */
    public static final C1624e f4653g = new C1629e().mo6460a();

    /* renamed from: h */
    public static final C6224h.C6225a<C1624e> f4654h = C1622d.f4651a;

    /* renamed from: a */
    public final int f4655a;

    /* renamed from: b */
    public final int f4656b;

    /* renamed from: c */
    public final int f4657c;

    /* renamed from: d */
    public final int f4658d;

    /* renamed from: e */
    public final int f4659e;

    /* renamed from: f */
    private C1628d f4660f;

    /* renamed from: b2.e$b */
    /* compiled from: AudioAttributes */
    private static final class C1626b {
        /* renamed from: a */
        public static void m7452a(AudioAttributes.Builder builder, int i) {
            builder.setAllowedCapturePolicy(i);
        }
    }

    /* renamed from: b2.e$c */
    /* compiled from: AudioAttributes */
    private static final class C1627c {
        /* renamed from: a */
        public static void m7453a(AudioAttributes.Builder builder, int i) {
            builder.setSpatializationBehavior(i);
        }
    }

    /* renamed from: b2.e$d */
    /* compiled from: AudioAttributes */
    public static final class C1628d {

        /* renamed from: a */
        public final AudioAttributes f4661a;

        private C1628d(C1624e eVar) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(eVar.f4655a).setFlags(eVar.f4656b).setUsage(eVar.f4657c);
            int i = C5953m0.f29110a;
            if (i >= 29) {
                C1626b.m7452a(usage, eVar.f4658d);
            }
            if (i >= 32) {
                C1627c.m7453a(usage, eVar.f4659e);
            }
            this.f4661a = usage.build();
        }
    }

    /* renamed from: b2.e$e */
    /* compiled from: AudioAttributes */
    public static final class C1629e {

        /* renamed from: a */
        private int f4662a = 0;

        /* renamed from: b */
        private int f4663b = 0;

        /* renamed from: c */
        private int f4664c = 1;

        /* renamed from: d */
        private int f4665d = 1;

        /* renamed from: e */
        private int f4666e = 0;

        /* renamed from: a */
        public C1624e mo6460a() {
            return new C1624e(this.f4662a, this.f4663b, this.f4664c, this.f4665d, this.f4666e);
        }

        /* renamed from: b */
        public C1629e mo6461b(int i) {
            this.f4665d = i;
            return this;
        }

        /* renamed from: c */
        public C1629e mo6462c(int i) {
            this.f4662a = i;
            return this;
        }

        /* renamed from: d */
        public C1629e mo6463d(int i) {
            this.f4663b = i;
            return this;
        }

        /* renamed from: e */
        public C1629e mo6464e(int i) {
            this.f4666e = i;
            return this;
        }

        /* renamed from: f */
        public C1629e mo6465f(int i) {
            this.f4664c = i;
            return this;
        }
    }

    /* renamed from: c */
    private static String m7449c(int i) {
        return Integer.toString(i, 36);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ C1624e m7450d(Bundle bundle) {
        C1629e eVar = new C1629e();
        if (bundle.containsKey(m7449c(0))) {
            eVar.mo6462c(bundle.getInt(m7449c(0)));
        }
        if (bundle.containsKey(m7449c(1))) {
            eVar.mo6463d(bundle.getInt(m7449c(1)));
        }
        if (bundle.containsKey(m7449c(2))) {
            eVar.mo6465f(bundle.getInt(m7449c(2)));
        }
        if (bundle.containsKey(m7449c(3))) {
            eVar.mo6461b(bundle.getInt(m7449c(3)));
        }
        if (bundle.containsKey(m7449c(4))) {
            eVar.mo6464e(bundle.getInt(m7449c(4)));
        }
        return eVar.mo6460a();
    }

    /* renamed from: b */
    public C1628d mo6457b() {
        if (this.f4660f == null) {
            this.f4660f = new C1628d();
        }
        return this.f4660f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1624e.class != obj.getClass()) {
            return false;
        }
        C1624e eVar = (C1624e) obj;
        if (this.f4655a == eVar.f4655a && this.f4656b == eVar.f4656b && this.f4657c == eVar.f4657c && this.f4658d == eVar.f4658d && this.f4659e == eVar.f4659e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f4655a) * 31) + this.f4656b) * 31) + this.f4657c) * 31) + this.f4658d) * 31) + this.f4659e;
    }

    private C1624e(int i, int i2, int i3, int i4, int i5) {
        this.f4655a = i;
        this.f4656b = i2;
        this.f4657c = i3;
        this.f4658d = i4;
        this.f4659e = i5;
    }
}
