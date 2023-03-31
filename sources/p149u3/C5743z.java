package p149u3;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import p015b3.C1776x0;
import p161w3.C5917a;
import p161w3.C5921c;
import p161w3.C5953m0;
import p177z1.C6224h;
import p182a7.C6419h;
import p190b7.C6685q;
import p190b7.C6690r;
import p190b7.C6694s;

/* renamed from: u3.z */
/* compiled from: TrackSelectionParameters */
public class C5743z implements C6224h {

    /* renamed from: I */
    public static final C5743z f28660I;
    @Deprecated

    /* renamed from: J */
    public static final C5743z f28661J;
    @Deprecated

    /* renamed from: K */
    public static final C6224h.C6225a<C5743z> f28662K = C12679y.f46448a;

    /* renamed from: A */
    public final C6685q<String> f28663A;

    /* renamed from: B */
    public final int f28664B;

    /* renamed from: C */
    public final int f28665C;

    /* renamed from: D */
    public final boolean f28666D;

    /* renamed from: E */
    public final boolean f28667E;

    /* renamed from: F */
    public final boolean f28668F;

    /* renamed from: G */
    public final C6690r<C1776x0, C5742x> f28669G;

    /* renamed from: H */
    public final C6694s<Integer> f28670H;

    /* renamed from: a */
    public final int f28671a;

    /* renamed from: b */
    public final int f28672b;

    /* renamed from: c */
    public final int f28673c;

    /* renamed from: d */
    public final int f28674d;

    /* renamed from: e */
    public final int f28675e;

    /* renamed from: f */
    public final int f28676f;

    /* renamed from: g */
    public final int f28677g;

    /* renamed from: h */
    public final int f28678h;

    /* renamed from: i */
    public final int f28679i;

    /* renamed from: r */
    public final int f28680r;

    /* renamed from: s */
    public final boolean f28681s;

    /* renamed from: t */
    public final C6685q<String> f28682t;

    /* renamed from: u */
    public final int f28683u;

    /* renamed from: v */
    public final C6685q<String> f28684v;

    /* renamed from: w */
    public final int f28685w;

    /* renamed from: x */
    public final int f28686x;

    /* renamed from: y */
    public final int f28687y;

    /* renamed from: z */
    public final C6685q<String> f28688z;

    static {
        C5743z A = new C5744a().mo20180A();
        f28660I = A;
        f28661J = A;
    }

    protected C5743z(C5744a aVar) {
        this.f28671a = aVar.f28689a;
        this.f28672b = aVar.f28690b;
        this.f28673c = aVar.f28691c;
        this.f28674d = aVar.f28692d;
        this.f28675e = aVar.f28693e;
        this.f28676f = aVar.f28694f;
        this.f28677g = aVar.f28695g;
        this.f28678h = aVar.f28696h;
        this.f28679i = aVar.f28697i;
        this.f28680r = aVar.f28698j;
        this.f28681s = aVar.f28699k;
        this.f28682t = aVar.f28700l;
        this.f28683u = aVar.f28701m;
        this.f28684v = aVar.f28702n;
        this.f28685w = aVar.f28703o;
        this.f28686x = aVar.f28704p;
        this.f28687y = aVar.f28705q;
        this.f28688z = aVar.f28706r;
        this.f28663A = aVar.f28707s;
        this.f28664B = aVar.f28708t;
        this.f28665C = aVar.f28709u;
        this.f28666D = aVar.f28710v;
        this.f28667E = aVar.f28711w;
        this.f28668F = aVar.f28712x;
        this.f28669G = C6690r.m38471d(aVar.f28713y);
        this.f28670H = C6694s.m38493r(aVar.f28714z);
    }

    /* renamed from: a */
    public static C5743z m34292a(Bundle bundle) {
        return new C5744a(bundle).mo20180A();
    }

    /* renamed from: b */
    protected static String m34293b(int i) {
        return Integer.toString(i, 36);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5743z zVar = (C5743z) obj;
        if (this.f28671a == zVar.f28671a && this.f28672b == zVar.f28672b && this.f28673c == zVar.f28673c && this.f28674d == zVar.f28674d && this.f28675e == zVar.f28675e && this.f28676f == zVar.f28676f && this.f28677g == zVar.f28677g && this.f28678h == zVar.f28678h && this.f28681s == zVar.f28681s && this.f28679i == zVar.f28679i && this.f28680r == zVar.f28680r && this.f28682t.equals(zVar.f28682t) && this.f28683u == zVar.f28683u && this.f28684v.equals(zVar.f28684v) && this.f28685w == zVar.f28685w && this.f28686x == zVar.f28686x && this.f28687y == zVar.f28687y && this.f28688z.equals(zVar.f28688z) && this.f28663A.equals(zVar.f28663A) && this.f28664B == zVar.f28664B && this.f28665C == zVar.f28665C && this.f28666D == zVar.f28666D && this.f28667E == zVar.f28667E && this.f28668F == zVar.f28668F && this.f28669G.equals(zVar.f28669G) && this.f28670H.equals(zVar.f28670H)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((this.f28671a + 31) * 31) + this.f28672b) * 31) + this.f28673c) * 31) + this.f28674d) * 31) + this.f28675e) * 31) + this.f28676f) * 31) + this.f28677g) * 31) + this.f28678h) * 31) + (this.f28681s ? 1 : 0)) * 31) + this.f28679i) * 31) + this.f28680r) * 31) + this.f28682t.hashCode()) * 31) + this.f28683u) * 31) + this.f28684v.hashCode()) * 31) + this.f28685w) * 31) + this.f28686x) * 31) + this.f28687y) * 31) + this.f28688z.hashCode()) * 31) + this.f28663A.hashCode()) * 31) + this.f28664B) * 31) + this.f28665C) * 31) + (this.f28666D ? 1 : 0)) * 31) + (this.f28667E ? 1 : 0)) * 31) + (this.f28668F ? 1 : 0)) * 31) + this.f28669G.hashCode()) * 31) + this.f28670H.hashCode();
    }

    /* renamed from: u3.z$a */
    /* compiled from: TrackSelectionParameters */
    public static class C5744a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f28689a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f28690b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f28691c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public int f28692d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f28693e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f28694f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f28695g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f28696h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public int f28697i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public int f28698j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public boolean f28699k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public C6685q<String> f28700l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public int f28701m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public C6685q<String> f28702n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public int f28703o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public int f28704p;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public int f28705q;
        /* access modifiers changed from: private */

        /* renamed from: r */
        public C6685q<String> f28706r;
        /* access modifiers changed from: private */

        /* renamed from: s */
        public C6685q<String> f28707s;
        /* access modifiers changed from: private */

        /* renamed from: t */
        public int f28708t;
        /* access modifiers changed from: private */

        /* renamed from: u */
        public int f28709u;
        /* access modifiers changed from: private */

        /* renamed from: v */
        public boolean f28710v;
        /* access modifiers changed from: private */

        /* renamed from: w */
        public boolean f28711w;
        /* access modifiers changed from: private */

        /* renamed from: x */
        public boolean f28712x;
        /* access modifiers changed from: private */

        /* renamed from: y */
        public HashMap<C1776x0, C5742x> f28713y;
        /* access modifiers changed from: private */

        /* renamed from: z */
        public HashSet<Integer> f28714z;

        @Deprecated
        public C5744a() {
            this.f28689a = Integer.MAX_VALUE;
            this.f28690b = Integer.MAX_VALUE;
            this.f28691c = Integer.MAX_VALUE;
            this.f28692d = Integer.MAX_VALUE;
            this.f28697i = Integer.MAX_VALUE;
            this.f28698j = Integer.MAX_VALUE;
            this.f28699k = true;
            this.f28700l = C6685q.m38445x();
            this.f28701m = 0;
            this.f28702n = C6685q.m38445x();
            this.f28703o = 0;
            this.f28704p = Integer.MAX_VALUE;
            this.f28705q = Integer.MAX_VALUE;
            this.f28706r = C6685q.m38445x();
            this.f28707s = C6685q.m38445x();
            this.f28708t = 0;
            this.f28709u = 0;
            this.f28710v = false;
            this.f28711w = false;
            this.f28712x = false;
            this.f28713y = new HashMap<>();
            this.f28714z = new HashSet<>();
        }

        /* renamed from: B */
        private void m34294B(C5743z zVar) {
            this.f28689a = zVar.f28671a;
            this.f28690b = zVar.f28672b;
            this.f28691c = zVar.f28673c;
            this.f28692d = zVar.f28674d;
            this.f28693e = zVar.f28675e;
            this.f28694f = zVar.f28676f;
            this.f28695g = zVar.f28677g;
            this.f28696h = zVar.f28678h;
            this.f28697i = zVar.f28679i;
            this.f28698j = zVar.f28680r;
            this.f28699k = zVar.f28681s;
            this.f28700l = zVar.f28682t;
            this.f28701m = zVar.f28683u;
            this.f28702n = zVar.f28684v;
            this.f28703o = zVar.f28685w;
            this.f28704p = zVar.f28686x;
            this.f28705q = zVar.f28687y;
            this.f28706r = zVar.f28688z;
            this.f28707s = zVar.f28663A;
            this.f28708t = zVar.f28664B;
            this.f28709u = zVar.f28665C;
            this.f28710v = zVar.f28666D;
            this.f28711w = zVar.f28667E;
            this.f28712x = zVar.f28668F;
            this.f28714z = new HashSet<>(zVar.f28670H);
            this.f28713y = new HashMap<>(zVar.f28669G);
        }

        /* renamed from: C */
        private static C6685q<String> m34295C(String[] strArr) {
            C6685q.C6686a r = C6685q.m38441r();
            for (String e : (String[]) C5917a.m34872e(strArr)) {
                r.mo22506a(C5953m0.m35075D0((String) C5917a.m34872e(e)));
            }
            return r.mo22547h();
        }

        /* renamed from: F */
        private void m34296F(Context context) {
            CaptioningManager captioningManager;
            if ((C5953m0.f29110a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f28708t = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f28707s = C6685q.m38446y(C5953m0.m35114X(locale));
                }
            }
        }

        /* renamed from: A */
        public C5743z mo20180A() {
            return new C5743z(this);
        }

        /* access modifiers changed from: protected */
        /* renamed from: D */
        public C5744a mo20229D(C5743z zVar) {
            m34294B(zVar);
            return this;
        }

        /* renamed from: E */
        public C5744a mo20181E(Context context) {
            if (C5953m0.f29110a >= 19) {
                m34296F(context);
            }
            return this;
        }

        /* renamed from: G */
        public C5744a mo20182G(int i, int i2, boolean z) {
            this.f28697i = i;
            this.f28698j = i2;
            this.f28699k = z;
            return this;
        }

        /* renamed from: H */
        public C5744a mo20183H(Context context, boolean z) {
            Point O = C5953m0.m35096O(context);
            return mo20182G(O.x, O.y, z);
        }

        public C5744a(Context context) {
            this();
            mo20181E(context);
            mo20183H(context, true);
        }

        protected C5744a(C5743z zVar) {
            m34294B(zVar);
        }

        protected C5744a(Bundle bundle) {
            C6685q<C5742x> qVar;
            String b = C5743z.m34293b(6);
            C5743z zVar = C5743z.f28660I;
            this.f28689a = bundle.getInt(b, zVar.f28671a);
            this.f28690b = bundle.getInt(C5743z.m34293b(7), zVar.f28672b);
            this.f28691c = bundle.getInt(C5743z.m34293b(8), zVar.f28673c);
            this.f28692d = bundle.getInt(C5743z.m34293b(9), zVar.f28674d);
            this.f28693e = bundle.getInt(C5743z.m34293b(10), zVar.f28675e);
            this.f28694f = bundle.getInt(C5743z.m34293b(11), zVar.f28676f);
            this.f28695g = bundle.getInt(C5743z.m34293b(12), zVar.f28677g);
            this.f28696h = bundle.getInt(C5743z.m34293b(13), zVar.f28678h);
            this.f28697i = bundle.getInt(C5743z.m34293b(14), zVar.f28679i);
            this.f28698j = bundle.getInt(C5743z.m34293b(15), zVar.f28680r);
            this.f28699k = bundle.getBoolean(C5743z.m34293b(16), zVar.f28681s);
            this.f28700l = C6685q.m38444u((String[]) C6419h.m37526a(bundle.getStringArray(C5743z.m34293b(17)), new String[0]));
            this.f28701m = bundle.getInt(C5743z.m34293b(25), zVar.f28683u);
            this.f28702n = m34295C((String[]) C6419h.m37526a(bundle.getStringArray(C5743z.m34293b(1)), new String[0]));
            this.f28703o = bundle.getInt(C5743z.m34293b(2), zVar.f28685w);
            this.f28704p = bundle.getInt(C5743z.m34293b(18), zVar.f28686x);
            this.f28705q = bundle.getInt(C5743z.m34293b(19), zVar.f28687y);
            this.f28706r = C6685q.m38444u((String[]) C6419h.m37526a(bundle.getStringArray(C5743z.m34293b(20)), new String[0]));
            this.f28707s = m34295C((String[]) C6419h.m37526a(bundle.getStringArray(C5743z.m34293b(3)), new String[0]));
            this.f28708t = bundle.getInt(C5743z.m34293b(4), zVar.f28664B);
            this.f28709u = bundle.getInt(C5743z.m34293b(26), zVar.f28665C);
            this.f28710v = bundle.getBoolean(C5743z.m34293b(5), zVar.f28666D);
            this.f28711w = bundle.getBoolean(C5743z.m34293b(21), zVar.f28667E);
            this.f28712x = bundle.getBoolean(C5743z.m34293b(22), zVar.f28668F);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(C5743z.m34293b(23));
            if (parcelableArrayList == null) {
                qVar = C6685q.m38445x();
            } else {
                qVar = C5921c.m34934b(C5742x.f28657c, parcelableArrayList);
            }
            this.f28713y = new HashMap<>();
            for (int i = 0; i < qVar.size(); i++) {
                C5742x xVar = qVar.get(i);
                this.f28713y.put(xVar.f28658a, xVar);
            }
            int[] iArr = (int[]) C6419h.m37526a(bundle.getIntArray(C5743z.m34293b(24)), new int[0]);
            this.f28714z = new HashSet<>();
            for (int valueOf : iArr) {
                this.f28714z.add(Integer.valueOf(valueOf));
            }
        }
    }
}
