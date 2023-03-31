package com.startapp;

import android.content.Context;
import com.startapp.C9219p7;
import com.startapp.sdk.adsbase.C9396a;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.common.utils.Pair;
import com.startapp.sdk.components.ComponentLocator;

/* renamed from: com.startapp.cb */
/* compiled from: Sta */
public class C8893cb implements Runnable, C8842b3<Throwable, Void> {

    /* renamed from: a */
    public final C9661y8 f36650a;

    /* renamed from: b */
    public final C9654y3 f36651b;

    /* renamed from: c */
    public final String f36652c;

    /* renamed from: d */
    public final C8873c3<String, C9219p7.C9220a, Throwable, Void> f36653d;

    /* renamed from: e */
    public C9219p7.C9220a f36654e;

    /* renamed from: f */
    public Throwable f36655f;

    public C8893cb(C9661y8 y8Var, C9654y3 y3Var, String str, C8873c3<String, C9219p7.C9220a, Throwable, Void> c3Var) {
        this.f36650a = y8Var;
        this.f36651b = y3Var;
        this.f36652c = str;
        this.f36653d = c3Var;
    }

    /* renamed from: a */
    public Object mo29129a(Object obj) {
        this.f36655f = (Throwable) obj;
        return null;
    }

    public void run() {
        try {
            C9219p7.C9220a a = m48467a(this.f36650a, this.f36651b, this.f36652c, (C8842b3<Throwable, Void>) this);
            this.f36654e = a;
            C8873c3<String, C9219p7.C9220a, Throwable, Void> c3Var = this.f36653d;
            if (c3Var != null) {
                c3Var.mo29242a(this.f36652c, a, this.f36655f);
            }
        } catch (Throwable th) {
            C8873c3<String, C9219p7.C9220a, Throwable, Void> c3Var2 = this.f36653d;
            if (c3Var2 != null) {
                c3Var2.mo29242a(this.f36652c, this.f36654e, this.f36655f);
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static String m48469a(String str, TrackingParams trackingParams) {
        StringBuilder sb = new StringBuilder(str);
        String a = C9396a.m49774a(str, (String) null);
        if (a != null) {
            sb.append(C8811a.m48227c(a));
        }
        if (trackingParams != null && (a != null || C9605vb.m50477d(str))) {
            sb.append(trackingParams.mo30365e());
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static Pair<String, Boolean> m48468a(Context context, String str, TrackingParams trackingParams, C8873c3<String, C9219p7.C9220a, Throwable, Void> c3Var) {
        String a = m48469a(str, trackingParams);
        return new Pair<>(a, Boolean.valueOf(m48470a(context, a, c3Var)));
    }

    /* renamed from: a */
    public static boolean m48470a(Context context, String str, C8873c3<String, C9219p7.C9220a, Throwable, Void> c3Var) {
        try {
            ComponentLocator a = ComponentLocator.m50248a(context);
            a.mo31181q().execute(new C8893cb(a.mo31182r(), a.mo31176l(), str, c3Var));
            return true;
        } catch (Throwable th) {
            C9023i4.m48681a(th);
            if (c3Var == null) {
                return false;
            }
            c3Var.mo29242a(str, null, th);
            return false;
        }
    }

    /* renamed from: a */
    public static C9219p7.C9220a m48467a(C9661y8 y8Var, C9654y3 y3Var, String str, C8842b3<Throwable, Void> b3Var) {
        C8916db dbVar = new C8916db();
        try {
            dbVar.f39492J = y8Var.mo31493a((Object) dbVar);
        } catch (Throwable th) {
            C9023i4.m48681a(th);
        }
        y3Var.getClass();
        try {
            return y3Var.mo31383a(str, dbVar, b3Var);
        } catch (Throwable th2) {
            if (y3Var.mo31386a(1)) {
                C9023i4.m48681a(th2);
            }
            return null;
        }
    }
}
