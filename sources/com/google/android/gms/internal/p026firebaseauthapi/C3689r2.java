package com.google.android.gms.internal.p026firebaseauthapi;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.r2 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class C3689r2 extends IOException {

    /* renamed from: a */
    private C3591o3 f22602a = null;

    public C3689r2(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    /* renamed from: a */
    static C3656q2 m26696a() {
        return new C3656q2("Protocol message tag had invalid wire type.");
    }

    /* renamed from: b */
    static C3689r2 m26697b() {
        return new C3689r2("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: c */
    static C3689r2 m26698c() {
        return new C3689r2("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: d */
    static C3689r2 m26699d() {
        return new C3689r2("Protocol message had invalid UTF-8.");
    }

    /* renamed from: e */
    static C3689r2 m26700e() {
        return new C3689r2("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: f */
    static C3689r2 m26701f() {
        return new C3689r2("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: g */
    static C3689r2 m26702g() {
        return new C3689r2("Failed to parse the message.");
    }

    /* renamed from: i */
    static C3689r2 m26703i() {
        return new C3689r2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: h */
    public final C3689r2 mo16665h(C3591o3 o3Var) {
        this.f22602a = o3Var;
        return this;
    }

    public C3689r2(String str) {
        super(str);
    }
}
