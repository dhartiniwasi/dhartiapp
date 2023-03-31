package com.startapp;

import android.content.Context;

/* renamed from: com.startapp.u4 */
/* compiled from: Sta */
public class C9579u4 implements C8873c3<C9023i4, C9063k4, C9147n4, C9551t4> {

    /* renamed from: a */
    public final Context f39246a;

    /* renamed from: b */
    public final C9277s5<C9654y3> f39247b;

    /* renamed from: c */
    public final C9277s5<C9661y8> f39248c;

    public C9579u4(Context context, C9277s5<C9654y3> s5Var, C9277s5<C9661y8> s5Var2) {
        this.f39246a = context;
        this.f39247b = s5Var;
        this.f39248c = s5Var2;
    }

    /* renamed from: a */
    public Object mo29242a(Object obj, Object obj2, Object obj3) {
        C9023i4 i4Var = (C9023i4) obj;
        C9063k4 k4Var = (C9063k4) obj2;
        C9147n4 n4Var = (C9147n4) obj3;
        if (i4Var == null || k4Var == null) {
            return null;
        }
        if (C9043j4.f37001l.equals(i4Var.f36949a)) {
            return new C9597v4(this.f39247b, this.f39248c, i4Var, k4Var, n4Var);
        }
        return new C9276s4(this.f39246a, i4Var, k4Var, n4Var);
    }
}
