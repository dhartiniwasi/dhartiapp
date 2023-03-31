package com.google.protobuf;

import java.io.IOException;

/* renamed from: com.google.protobuf.e0 */
/* compiled from: InvalidProtocolBufferException */
public class C8135e0 extends IOException {

    /* renamed from: a */
    private C8243v0 f34864a = null;

    /* renamed from: b */
    private boolean f34865b;

    /* renamed from: com.google.protobuf.e0$a */
    /* compiled from: InvalidProtocolBufferException */
    public static class C8136a extends C8135e0 {
        public C8136a(String str) {
            super(str);
        }
    }

    public C8135e0(String str) {
        super(str);
    }

    /* renamed from: b */
    static C8135e0 m44683b() {
        return new C8135e0("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: c */
    static C8135e0 m44684c() {
        return new C8135e0("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: d */
    static C8135e0 m44685d() {
        return new C8135e0("Protocol message had invalid UTF-8.");
    }

    /* renamed from: e */
    static C8136a m44686e() {
        return new C8136a("Protocol message tag had invalid wire type.");
    }

    /* renamed from: f */
    static C8135e0 m44687f() {
        return new C8135e0("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: g */
    static C8135e0 m44688g() {
        return new C8135e0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: h */
    static C8135e0 m44689h() {
        return new C8135e0("Failed to parse the message.");
    }

    /* renamed from: i */
    static C8135e0 m44690i() {
        return new C8135e0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: l */
    static C8135e0 m44691l() {
        return new C8135e0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* renamed from: m */
    static C8135e0 m44692m() {
        return new C8135e0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo26892a() {
        return this.f34865b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo26893j() {
        this.f34865b = true;
    }

    /* renamed from: k */
    public C8135e0 mo26894k(C8243v0 v0Var) {
        this.f34864a = v0Var;
        return this;
    }

    public C8135e0(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }
}
