package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import p033d5.C4141r;
import p040e5.C4240a;
import p040e5.C4243c;
import p054g5.C4410a;
import p246h7.C10421l;

/* renamed from: com.google.firebase.auth.p0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class C7837p0 {

    /* renamed from: com.google.firebase.auth.p0$a */
    /* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
    public static class C7838a extends C4240a {
        public static final Parcelable.Creator<C7838a> CREATOR = new C7835o1();

        C7838a() {
        }

        /* renamed from: I1 */
        public static C7838a m43481I1() {
            return new C7838a();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C4243c.m28605b(parcel, C4243c.m28604a(parcel));
        }
    }

    /* renamed from: com.google.firebase.auth.p0$b */
    /* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
    public static abstract class C7839b {

        /* renamed from: a */
        private static final C4410a f34189a = new C4410a("PhoneAuthProvider", new String[0]);

        /* renamed from: a */
        public void mo16110a(String str) {
            f34189a.mo17932e("Sms auto retrieval timed-out.", new Object[0]);
        }

        /* renamed from: b */
        public void mo16111b(String str, C7838a aVar) {
        }

        /* renamed from: c */
        public abstract void mo16112c(C7830n0 n0Var);

        /* renamed from: d */
        public abstract void mo16113d(C10421l lVar);
    }

    /* renamed from: a */
    public static C7830n0 m43479a(String str, String str2) {
        return C7830n0.m43448N1(str, str2);
    }

    /* renamed from: b */
    public static void m43480b(C7833o0 o0Var) {
        C4141r.m28221k(o0Var);
        o0Var.mo26157b().mo25999P(o0Var);
    }
}
