package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.messaging.v0 */
/* compiled from: SharedPreferencesQueue */
final class C8077v0 {

    /* renamed from: a */
    private final SharedPreferences f34770a;

    /* renamed from: b */
    private final String f34771b;

    /* renamed from: c */
    private final String f34772c;

    /* renamed from: d */
    final ArrayDeque<String> f34773d = new ArrayDeque<>();

    /* renamed from: e */
    private final Executor f34774e;

    /* renamed from: f */
    private boolean f34775f = false;

    private C8077v0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f34770a = sharedPreferences;
        this.f34771b = str;
        this.f34772c = str2;
        this.f34774e = executor;
    }

    /* renamed from: c */
    private boolean m44435c(boolean z) {
        if (z && !this.f34775f) {
            m44439j();
        }
        return z;
    }

    /* renamed from: d */
    static C8077v0 m44436d(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        C8077v0 v0Var = new C8077v0(sharedPreferences, str, str2, executor);
        v0Var.m44437e();
        return v0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m44437e() {
        /*
            r6 = this;
            java.util.ArrayDeque<java.lang.String> r0 = r6.f34773d
            monitor-enter(r0)
            java.util.ArrayDeque<java.lang.String> r1 = r6.f34773d     // Catch:{ all -> 0x004a }
            r1.clear()     // Catch:{ all -> 0x004a }
            android.content.SharedPreferences r1 = r6.f34770a     // Catch:{ all -> 0x004a }
            java.lang.String r2 = r6.f34771b     // Catch:{ all -> 0x004a }
            java.lang.String r3 = ""
            java.lang.String r1 = r1.getString(r2, r3)     // Catch:{ all -> 0x004a }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x004a }
            if (r2 != 0) goto L_0x0048
            java.lang.String r2 = r6.f34772c     // Catch:{ all -> 0x004a }
            boolean r2 = r1.contains(r2)     // Catch:{ all -> 0x004a }
            if (r2 != 0) goto L_0x0021
            goto L_0x0048
        L_0x0021:
            java.lang.String r2 = r6.f34772c     // Catch:{ all -> 0x004a }
            r3 = -1
            java.lang.String[] r1 = r1.split(r2, r3)     // Catch:{ all -> 0x004a }
            int r2 = r1.length     // Catch:{ all -> 0x004a }
            if (r2 != 0) goto L_0x0032
            java.lang.String r2 = "FirebaseMessaging"
            java.lang.String r3 = "Corrupted queue. Please check the queue contents and item separator provided"
            android.util.Log.e(r2, r3)     // Catch:{ all -> 0x004a }
        L_0x0032:
            int r2 = r1.length     // Catch:{ all -> 0x004a }
            r3 = 0
        L_0x0034:
            if (r3 >= r2) goto L_0x0046
            r4 = r1[r3]     // Catch:{ all -> 0x004a }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x004a }
            if (r5 != 0) goto L_0x0043
            java.util.ArrayDeque<java.lang.String> r5 = r6.f34773d     // Catch:{ all -> 0x004a }
            r5.add(r4)     // Catch:{ all -> 0x004a }
        L_0x0043:
            int r3 = r3 + 1
            goto L_0x0034
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return
        L_0x0048:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return
        L_0x004a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C8077v0.m44437e():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m44438i() {
        synchronized (this.f34773d) {
            this.f34770a.edit().putString(this.f34771b, mo26739h()).commit();
        }
    }

    /* renamed from: j */
    private void m44439j() {
        this.f34774e.execute(new C8075u0(this));
    }

    /* renamed from: b */
    public boolean mo26736b(String str) {
        boolean c;
        if (TextUtils.isEmpty(str) || str.contains(this.f34772c)) {
            return false;
        }
        synchronized (this.f34773d) {
            c = m44435c(this.f34773d.add(str));
        }
        return c;
    }

    /* renamed from: f */
    public String mo26737f() {
        String peek;
        synchronized (this.f34773d) {
            peek = this.f34773d.peek();
        }
        return peek;
    }

    /* renamed from: g */
    public boolean mo26738g(Object obj) {
        boolean c;
        synchronized (this.f34773d) {
            c = m44435c(this.f34773d.remove(obj));
        }
        return c;
    }

    /* renamed from: h */
    public String mo26739h() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.f34773d.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(this.f34772c);
        }
        return sb.toString();
    }
}
