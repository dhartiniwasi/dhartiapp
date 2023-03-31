package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class ey3 extends IOException {

    /* renamed from: a */
    private cz3 f9029a = null;

    /* renamed from: b */
    private boolean f9030b;

    public ey3(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    /* renamed from: a */
    static dy3 m12337a() {
        return new dy3("Protocol message tag had invalid wire type.");
    }

    /* renamed from: b */
    static ey3 m12338b() {
        return new ey3("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: c */
    static ey3 m12339c() {
        return new ey3("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: d */
    static ey3 m12340d() {
        return new ey3("Protocol message had invalid UTF-8.");
    }

    /* renamed from: e */
    static ey3 m12341e() {
        return new ey3("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: f */
    static ey3 m12342f() {
        return new ey3("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: g */
    static ey3 m12343g() {
        return new ey3("Failed to parse the message.");
    }

    /* renamed from: i */
    static ey3 m12344i() {
        return new ey3("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* renamed from: j */
    static ey3 m12345j() {
        return new ey3("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: h */
    public final ey3 mo10046h(cz3 cz3) {
        this.f9029a = cz3;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo10047k() {
        this.f9030b = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final boolean mo10048l() {
        return this.f9030b;
    }

    public ey3(String str) {
        super(str);
    }
}
