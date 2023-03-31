package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.e2 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
abstract class C3260e2 extends C3468kc {

    /* renamed from: c */
    final CharSequence f21970c;

    /* renamed from: d */
    final C3672qi f21971d;

    /* renamed from: e */
    int f21972e = 0;

    /* renamed from: f */
    int f21973f;

    protected C3260e2(C3262e4 e4Var, CharSequence charSequence) {
        this.f21971d = e4Var.f21974a;
        this.f21973f = Integer.MAX_VALUE;
        this.f21970c = charSequence;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo15978a() {
        int i;
        int i2 = this.f21972e;
        while (true) {
            int i3 = this.f21972e;
            if (i3 != -1) {
                int e = mo15870e(i3);
                if (e == -1) {
                    e = this.f21970c.length();
                    this.f21972e = -1;
                    i = -1;
                } else {
                    i = mo15869d(e);
                    this.f21972e = i;
                }
                if (i == i2) {
                    int i4 = i + 1;
                    this.f21972e = i4;
                    if (i4 > this.f21970c.length()) {
                        this.f21972e = -1;
                    }
                } else {
                    if (i2 < e) {
                        this.f21970c.charAt(i2);
                    }
                    if (i2 < e) {
                        this.f21970c.charAt(e - 1);
                    }
                    int i5 = this.f21973f;
                    if (i5 == 1) {
                        e = this.f21970c.length();
                        this.f21972e = -1;
                        if (e > i2) {
                            this.f21970c.charAt(e - 1);
                        }
                    } else {
                        this.f21973f = i5 - 1;
                    }
                    return this.f21970c.subSequence(i2, e).toString();
                }
            } else {
                mo16257c();
                return null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract int mo15869d(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract int mo15870e(int i);
}
