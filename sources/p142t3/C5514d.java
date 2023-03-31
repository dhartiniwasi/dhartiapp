package p142t3;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p182a7.C6408b;

/* renamed from: t3.d */
/* compiled from: WebvttCssStyle */
public final class C5514d {

    /* renamed from: a */
    private String f27993a = "";

    /* renamed from: b */
    private String f27994b = "";

    /* renamed from: c */
    private Set<String> f27995c = Collections.emptySet();

    /* renamed from: d */
    private String f27996d = "";

    /* renamed from: e */
    private String f27997e = null;

    /* renamed from: f */
    private int f27998f;

    /* renamed from: g */
    private boolean f27999g = false;

    /* renamed from: h */
    private int f28000h;

    /* renamed from: i */
    private boolean f28001i = false;

    /* renamed from: j */
    private int f28002j = -1;

    /* renamed from: k */
    private int f28003k = -1;

    /* renamed from: l */
    private int f28004l = -1;

    /* renamed from: m */
    private int f28005m = -1;

    /* renamed from: n */
    private int f28006n = -1;

    /* renamed from: o */
    private float f28007o;

    /* renamed from: p */
    private int f28008p = -1;

    /* renamed from: q */
    private boolean f28009q = false;

    /* renamed from: B */
    private static int m33503B(int i, String str, String str2, int i2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }

    /* renamed from: A */
    public C5514d mo19793A(boolean z) {
        this.f28003k = z ? 1 : 0;
        return this;
    }

    /* renamed from: a */
    public int mo19794a() {
        if (this.f28001i) {
            return this.f28000h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    /* renamed from: b */
    public boolean mo19795b() {
        return this.f28009q;
    }

    /* renamed from: c */
    public int mo19796c() {
        if (this.f27999g) {
            return this.f27998f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    /* renamed from: d */
    public String mo19797d() {
        return this.f27997e;
    }

    /* renamed from: e */
    public float mo19798e() {
        return this.f28007o;
    }

    /* renamed from: f */
    public int mo19799f() {
        return this.f28006n;
    }

    /* renamed from: g */
    public int mo19800g() {
        return this.f28008p;
    }

    /* renamed from: h */
    public int mo19801h(String str, String str2, Set<String> set, String str3) {
        if (this.f27993a.isEmpty() && this.f27994b.isEmpty() && this.f27995c.isEmpty() && this.f27996d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int B = m33503B(m33503B(m33503B(0, this.f27993a, str, 1073741824), this.f27994b, str2, 2), this.f27996d, str3, 4);
        if (B == -1 || !set.containsAll(this.f27995c)) {
            return 0;
        }
        return B + (this.f27995c.size() * 4);
    }

    /* renamed from: i */
    public int mo19802i() {
        int i = this.f28004l;
        if (i == -1 && this.f28005m == -1) {
            return -1;
        }
        int i2 = 0;
        int i3 = i == 1 ? 1 : 0;
        if (this.f28005m == 1) {
            i2 = 2;
        }
        return i3 | i2;
    }

    /* renamed from: j */
    public boolean mo19803j() {
        return this.f28001i;
    }

    /* renamed from: k */
    public boolean mo19804k() {
        return this.f27999g;
    }

    /* renamed from: l */
    public boolean mo19805l() {
        return this.f28002j == 1;
    }

    /* renamed from: m */
    public boolean mo19806m() {
        return this.f28003k == 1;
    }

    /* renamed from: n */
    public C5514d mo19807n(int i) {
        this.f28000h = i;
        this.f28001i = true;
        return this;
    }

    /* renamed from: o */
    public C5514d mo19808o(boolean z) {
        this.f28004l = z ? 1 : 0;
        return this;
    }

    /* renamed from: p */
    public C5514d mo19809p(boolean z) {
        this.f28009q = z;
        return this;
    }

    /* renamed from: q */
    public C5514d mo19810q(int i) {
        this.f27998f = i;
        this.f27999g = true;
        return this;
    }

    /* renamed from: r */
    public C5514d mo19811r(String str) {
        this.f27997e = str == null ? null : C6408b.m37506e(str);
        return this;
    }

    /* renamed from: s */
    public C5514d mo19812s(float f) {
        this.f28007o = f;
        return this;
    }

    /* renamed from: t */
    public C5514d mo19813t(int i) {
        this.f28006n = i;
        return this;
    }

    /* renamed from: u */
    public C5514d mo19814u(boolean z) {
        this.f28005m = z ? 1 : 0;
        return this;
    }

    /* renamed from: v */
    public C5514d mo19815v(int i) {
        this.f28008p = i;
        return this;
    }

    /* renamed from: w */
    public void mo19816w(String[] strArr) {
        this.f27995c = new HashSet(Arrays.asList(strArr));
    }

    /* renamed from: x */
    public void mo19817x(String str) {
        this.f27993a = str;
    }

    /* renamed from: y */
    public void mo19818y(String str) {
        this.f27994b = str;
    }

    /* renamed from: z */
    public void mo19819z(String str) {
        this.f27996d = str;
    }
}
