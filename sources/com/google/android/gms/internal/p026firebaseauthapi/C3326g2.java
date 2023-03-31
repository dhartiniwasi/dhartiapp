package com.google.android.gms.internal.p026firebaseauthapi;

import com.google.android.gms.internal.p026firebaseauthapi.C3326g2;
import com.google.android.gms.internal.p026firebaseauthapi.C3425j2;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.g2 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class C3326g2<MessageType extends C3425j2<MessageType, BuilderType>, BuilderType extends C3326g2<MessageType, BuilderType>> extends C3588o0<MessageType, BuilderType> {

    /* renamed from: a */
    private final C3425j2 f22060a;

    /* renamed from: b */
    protected C3425j2 f22061b;

    protected C3326g2(MessageType messagetype) {
        this.f22060a = messagetype;
        if (!messagetype.mo16209m()) {
            this.f22061b = messagetype.mo16214v();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    /* renamed from: b */
    private static void m25631b(Object obj, Object obj2) {
        C3854w3.m27268a().mo16976b(obj.getClass()).mo15704f(obj, obj2);
    }

    /* renamed from: c */
    public final C3326g2 clone() {
        C3326g2 g2Var = (C3326g2) this.f22060a.mo15734q(5, (Object) null, (Object) null);
        g2Var.f22061b = mo16058X();
        return g2Var;
    }

    /* renamed from: d */
    public final C3326g2 mo16061d(C3425j2 j2Var) {
        if (!this.f22060a.equals(j2Var)) {
            if (!this.f22061b.mo16209m()) {
                mo16065i();
            }
            m25631b(this.f22061b, j2Var);
        }
        return this;
    }

    /* renamed from: e */
    public final MessageType mo16062e() {
        MessageType f = mo16058X();
        if (f.mo16207l()) {
            return f;
        }
        throw new C3691r4(f);
    }

    /* renamed from: f */
    public MessageType mo16058X() {
        if (!this.f22061b.mo16209m()) {
            return this.f22061b;
        }
        this.f22061b.mo16203g();
        return this.f22061b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo16064g() {
        if (!this.f22061b.mo16209m()) {
            mo16065i();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo16065i() {
        C3425j2 v = this.f22060a.mo16214v();
        m25631b(v, this.f22061b);
        this.f22061b = v;
    }
}
