package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.aa */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2171aa {

    /* renamed from: c */
    public static final boolean f6496c = C2208ba.f7181b;

    /* renamed from: a */
    private final List f6497a = new ArrayList();

    /* renamed from: b */
    private boolean f6498b = false;

    C2171aa() {
    }

    /* renamed from: a */
    public final synchronized void mo8279a(String str, long j) {
        if (!this.f6498b) {
            this.f6497a.add(new C3098z9(str, j, SystemClock.elapsedRealtime()));
        } else {
            throw new IllegalStateException("Marker added to finished log");
        }
    }

    /* renamed from: b */
    public final synchronized void mo8280b(String str) {
        long j;
        this.f6498b = true;
        if (this.f6497a.size() == 0) {
            j = 0;
        } else {
            long j2 = ((C3098z9) this.f6497a.get(0)).f21024c;
            List list = this.f6497a;
            j = ((C3098z9) list.get(list.size() - 1)).f21024c - j2;
        }
        if (j > 0) {
            long j3 = ((C3098z9) this.f6497a.get(0)).f21024c;
            C2208ba.m10257a("(%-4d ms) %s", Long.valueOf(j), str);
            for (C3098z9 z9Var : this.f6497a) {
                long j4 = z9Var.f21024c;
                C2208ba.m10257a("(+%-4d) [%2d] %s", Long.valueOf(j4 - j3), Long.valueOf(z9Var.f21023b), z9Var.f21022a);
                j3 = j4;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        if (!this.f6498b) {
            mo8280b("Request on the loose");
            C2208ba.m10258b("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }
}
