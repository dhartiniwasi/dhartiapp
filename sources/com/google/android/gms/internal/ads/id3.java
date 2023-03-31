package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class id3 {

    /* renamed from: b */
    static final id3 f10748b = new id3(new C2472a("Failure occurred while trying to finish a future."));

    /* renamed from: a */
    final Throwable f10749a;

    /* renamed from: com.google.android.gms.internal.ads.id3$a */
    /* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
    class C2472a extends Throwable {
        C2472a(String str) {
            super("Failure occurred while trying to finish a future.");
        }

        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    id3(Throwable th) {
        Objects.requireNonNull(th);
        this.f10749a = th;
    }
}
