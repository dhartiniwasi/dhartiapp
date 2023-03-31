package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class ed3 extends re3 implements Runnable {

    /* renamed from: h */
    lf3 f8743h;

    /* renamed from: i */
    Class f8744i;

    /* renamed from: r */
    Object f8745r;

    ed3(lf3 lf3, Class cls, Object obj) {
        Objects.requireNonNull(lf3);
        this.f8743h = lf3;
        this.f8744i = cls;
        Objects.requireNonNull(obj);
        this.f8745r = obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public abstract Object mo9129E(Object obj, Throwable th) throws Exception;

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public abstract void mo9130F(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo8329e() {
        String str;
        lf3 lf3 = this.f8743h;
        Class cls = this.f8744i;
        Object obj = this.f8745r;
        String e = super.mo8329e();
        if (lf3 != null) {
            str = "inputFuture=[" + lf3 + "], ";
        } else {
            str = "";
        }
        if (cls != null && obj != null) {
            return str + "exceptionType=[" + cls + "], fallback=[" + obj + "]";
        } else if (e != null) {
            return str.concat(e);
        } else {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo8330f() {
        mo10138v(this.f8743h);
        this.f8743h = null;
        this.f8744i = null;
        this.f8745r = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.lf3 r0 = r8.f8743h
            java.lang.Class r1 = r8.f8744i
            java.lang.Object r2 = r8.f8745r
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x000c
            r5 = 1
            goto L_0x000d
        L_0x000c:
            r5 = 0
        L_0x000d:
            if (r1 != 0) goto L_0x0011
            r6 = 1
            goto L_0x0012
        L_0x0011:
            r6 = 0
        L_0x0012:
            r5 = r5 | r6
            if (r2 != 0) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r3 = 0
        L_0x0017:
            r3 = r3 | r5
            if (r3 != 0) goto L_0x009f
            boolean r3 = r8.isCancelled()
            if (r3 == 0) goto L_0x0022
            goto L_0x009f
        L_0x0022:
            r3 = 0
            r8.f8743h = r3
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.gg3     // Catch:{ ExecutionException -> 0x003e, RuntimeException -> 0x003b, Error -> 0x0039 }
            if (r4 == 0) goto L_0x0031
            r4 = r0
            com.google.android.gms.internal.ads.gg3 r4 = (com.google.android.gms.internal.ads.gg3) r4     // Catch:{ ExecutionException -> 0x003e, RuntimeException -> 0x003b, Error -> 0x0039 }
            java.lang.Throwable r4 = r4.mo10129a()     // Catch:{ ExecutionException -> 0x003e, RuntimeException -> 0x003b, Error -> 0x0039 }
            goto L_0x0032
        L_0x0031:
            r4 = r3
        L_0x0032:
            if (r4 != 0) goto L_0x003c
            java.lang.Object r5 = com.google.android.gms.internal.ads.cf3.m10918p(r0)     // Catch:{ ExecutionException -> 0x003e, RuntimeException -> 0x003b, Error -> 0x0039 }
            goto L_0x0072
        L_0x0039:
            r4 = move-exception
            goto L_0x003c
        L_0x003b:
            r4 = move-exception
        L_0x003c:
            r5 = r3
            goto L_0x0072
        L_0x003e:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L_0x0070
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Future type "
            r6.append(r7)
            java.lang.Class r7 = r0.getClass()
            r6.append(r7)
            java.lang.String r7 = " threw "
            r6.append(r7)
            java.lang.Class r4 = r4.getClass()
            r6.append(r4)
            java.lang.String r4 = " without a cause"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
        L_0x0070:
            r4 = r5
            goto L_0x003c
        L_0x0072:
            if (r4 != 0) goto L_0x0078
            r8.mo9805g(r5)
            return
        L_0x0078:
            boolean r1 = r1.isInstance(r4)
            if (r1 == 0) goto L_0x009c
            java.lang.Object r0 = r8.mo9129E(r2, r4)     // Catch:{ all -> 0x008a }
            r8.f8744i = r3
            r8.f8745r = r3
            r8.mo9130F(r0)
            return
        L_0x008a:
            r0 = move-exception
            com.google.android.gms.internal.ads.tf3.m21011a(r0)     // Catch:{ all -> 0x0096 }
            r8.mo9806h(r0)     // Catch:{ all -> 0x0096 }
            r8.f8744i = r3
            r8.f8745r = r3
            return
        L_0x0096:
            r0 = move-exception
            r8.f8744i = r3
            r8.f8745r = r3
            throw r0
        L_0x009c:
            r8.mo10139w(r0)
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ed3.run():void");
    }
}
