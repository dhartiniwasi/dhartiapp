package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.q9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public class C7139q9 extends IOException {
    public C7139q9(String str) {
        super(str);
    }

    /* renamed from: a */
    static C7123p9 m40662a() {
        return new C7123p9("Protocol message tag had invalid wire type.");
    }

    /* renamed from: b */
    static C7139q9 m40663b() {
        return new C7139q9("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: c */
    static C7139q9 m40664c() {
        return new C7139q9("Protocol message had invalid UTF-8.");
    }

    /* renamed from: d */
    static C7139q9 m40665d() {
        return new C7139q9("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: e */
    static C7139q9 m40666e() {
        return new C7139q9("Failed to parse the message.");
    }

    /* renamed from: f */
    static C7139q9 m40667f() {
        return new C7139q9("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
