package p354se;

import kotlin.jvm.internal.C11669k;

/* renamed from: se.c */
/* compiled from: DownloadTask.kt */
public final class C12520c {

    /* renamed from: a */
    private int f45988a;

    /* renamed from: b */
    private String f45989b;

    /* renamed from: c */
    private C12518a f45990c;

    /* renamed from: d */
    private int f45991d;

    /* renamed from: e */
    private String f45992e;

    /* renamed from: f */
    private String f45993f;

    /* renamed from: g */
    private String f45994g;

    /* renamed from: h */
    private String f45995h;

    /* renamed from: i */
    private String f45996i;

    /* renamed from: j */
    private boolean f45997j;

    /* renamed from: k */
    private boolean f45998k;

    /* renamed from: l */
    private boolean f45999l;

    /* renamed from: m */
    private long f46000m;

    /* renamed from: n */
    private boolean f46001n;

    /* renamed from: o */
    private boolean f46002o;

    public C12520c(int i, String str, C12518a aVar, int i2, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, long j, boolean z4, boolean z5) {
        String str7 = str5;
        String str8 = str6;
        C11669k.m56787e(str, "taskId");
        C11669k.m56787e(aVar, "status");
        C11669k.m56787e(str2, "url");
        C11669k.m56787e(str4, "savedDir");
        C11669k.m56787e(str7, "headers");
        C11669k.m56787e(str8, "mimeType");
        this.f45988a = i;
        this.f45989b = str;
        this.f45990c = aVar;
        this.f45991d = i2;
        this.f45992e = str2;
        this.f45993f = str3;
        this.f45994g = str4;
        this.f45995h = str7;
        this.f45996i = str8;
        this.f45997j = z;
        this.f45998k = z2;
        this.f45999l = z3;
        this.f46000m = j;
        this.f46001n = z4;
        this.f46002o = z5;
    }

    /* renamed from: a */
    public final boolean mo37308a() {
        return this.f46002o;
    }

    /* renamed from: b */
    public final String mo37309b() {
        return this.f45993f;
    }

    /* renamed from: c */
    public final String mo37310c() {
        return this.f45995h;
    }

    /* renamed from: d */
    public final String mo37311d() {
        return this.f45996i;
    }

    /* renamed from: e */
    public final boolean mo37312e() {
        return this.f45999l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12520c)) {
            return false;
        }
        C12520c cVar = (C12520c) obj;
        return this.f45988a == cVar.f45988a && C11669k.m56783a(this.f45989b, cVar.f45989b) && this.f45990c == cVar.f45990c && this.f45991d == cVar.f45991d && C11669k.m56783a(this.f45992e, cVar.f45992e) && C11669k.m56783a(this.f45993f, cVar.f45993f) && C11669k.m56783a(this.f45994g, cVar.f45994g) && C11669k.m56783a(this.f45995h, cVar.f45995h) && C11669k.m56783a(this.f45996i, cVar.f45996i) && this.f45997j == cVar.f45997j && this.f45998k == cVar.f45998k && this.f45999l == cVar.f45999l && this.f46000m == cVar.f46000m && this.f46001n == cVar.f46001n && this.f46002o == cVar.f46002o;
    }

    /* renamed from: f */
    public final int mo37314f() {
        return this.f45988a;
    }

    /* renamed from: g */
    public final int mo37315g() {
        return this.f45991d;
    }

    /* renamed from: h */
    public final boolean mo37316h() {
        return this.f45997j;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f45988a * 31) + this.f45989b.hashCode()) * 31) + this.f45990c.hashCode()) * 31) + this.f45991d) * 31) + this.f45992e.hashCode()) * 31;
        String str = this.f45993f;
        int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f45994g.hashCode()) * 31) + this.f45995h.hashCode()) * 31) + this.f45996i.hashCode()) * 31;
        boolean z = this.f45997j;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f45998k;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f45999l;
        if (z4) {
            z4 = true;
        }
        int a = (((i2 + (z4 ? 1 : 0)) * 31) + C12519b.m59675a(this.f46000m)) * 31;
        boolean z5 = this.f46001n;
        if (z5) {
            z5 = true;
        }
        int i3 = (a + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.f46002o;
        if (!z6) {
            z2 = z6;
        }
        return i3 + (z2 ? 1 : 0);
    }

    /* renamed from: i */
    public final boolean mo37318i() {
        return this.f46001n;
    }

    /* renamed from: j */
    public final String mo37319j() {
        return this.f45994g;
    }

    /* renamed from: k */
    public final boolean mo37320k() {
        return this.f45998k;
    }

    /* renamed from: l */
    public final C12518a mo37321l() {
        return this.f45990c;
    }

    /* renamed from: m */
    public final String mo37322m() {
        return this.f45989b;
    }

    /* renamed from: n */
    public final long mo37323n() {
        return this.f46000m;
    }

    /* renamed from: o */
    public final String mo37324o() {
        return this.f45992e;
    }

    public String toString() {
        return "DownloadTask(primaryId=" + this.f45988a + ", taskId=" + this.f45989b + ", status=" + this.f45990c + ", progress=" + this.f45991d + ", url=" + this.f45992e + ", filename=" + this.f45993f + ", savedDir=" + this.f45994g + ", headers=" + this.f45995h + ", mimeType=" + this.f45996i + ", resumable=" + this.f45997j + ", showNotification=" + this.f45998k + ", openFileFromNotification=" + this.f45999l + ", timeCreated=" + this.f46000m + ", saveInPublicStorage=" + this.f46001n + ", allowCellular=" + this.f46002o + ')';
    }
}
