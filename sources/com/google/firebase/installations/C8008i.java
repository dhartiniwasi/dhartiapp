package com.google.firebase.installations;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p303n8.C11981d;
import p321p8.C12144a;
import p321p8.C12145b;

/* renamed from: com.google.firebase.installations.i */
/* compiled from: Utils */
public final class C8008i {

    /* renamed from: b */
    public static final long f34569b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c */
    private static final Pattern f34570c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d */
    private static C8008i f34571d;

    /* renamed from: a */
    private final C12144a f34572a;

    private C8008i(C12144a aVar) {
        this.f34572a = aVar;
    }

    /* renamed from: c */
    public static C8008i m44078c() {
        return m44079d(C12145b.m58347b());
    }

    /* renamed from: d */
    public static C8008i m44079d(C12144a aVar) {
        if (f34571d == null) {
            f34571d = new C8008i(aVar);
        }
        return f34571d;
    }

    /* renamed from: g */
    static boolean m44080g(String str) {
        return f34570c.matcher(str).matches();
    }

    /* renamed from: h */
    static boolean m44081h(String str) {
        return str.contains(":");
    }

    /* renamed from: a */
    public long mo26570a() {
        return this.f34572a.mo36671a();
    }

    /* renamed from: b */
    public long mo26571b() {
        return TimeUnit.MILLISECONDS.toSeconds(mo26570a());
    }

    /* renamed from: e */
    public long mo26572e() {
        return (long) (Math.random() * 1000.0d);
    }

    /* renamed from: f */
    public boolean mo26573f(C11981d dVar) {
        if (!TextUtils.isEmpty(dVar.mo36312b()) && dVar.mo36319h() + dVar.mo36313c() >= mo26571b() + f34569b) {
            return false;
        }
        return true;
    }
}
