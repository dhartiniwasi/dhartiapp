package p144t5;

/* renamed from: t5.h1 */
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final class C5557h1 {

    /* renamed from: a */
    private static Boolean f28105a;

    private C5557h1() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0018 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m33614a(android.webkit.WebView r3, java.lang.String r4) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 < r1) goto L_0x002d
            java.lang.Class<t5.h1> r0 = p144t5.C5557h1.class
            monitor-enter(r0)
            java.lang.Boolean r1 = f28105a     // Catch:{ all -> 0x002a }
            r2 = 0
            if (r1 != 0) goto L_0x001c
            java.lang.String r1 = "(function(){})()"
            r3.evaluateJavascript(r1, r2)     // Catch:{ IllegalStateException -> 0x0018 }
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ IllegalStateException -> 0x0018 }
            f28105a = r1     // Catch:{ IllegalStateException -> 0x0018 }
            goto L_0x001c
        L_0x0018:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x002a }
            f28105a = r1     // Catch:{ all -> 0x002a }
        L_0x001c:
            java.lang.Boolean r1 = f28105a     // Catch:{ all -> 0x002a }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            if (r1 != 0) goto L_0x0026
            goto L_0x002d
        L_0x0026:
            r3.evaluateJavascript(r4, r2)
            return
        L_0x002a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r3
        L_0x002d:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "javascript:"
            int r1 = r4.length()
            if (r1 == 0) goto L_0x003e
            java.lang.String r4 = r0.concat(r4)
            goto L_0x0043
        L_0x003e:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r0)
        L_0x0043:
            r3.loadUrl(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p144t5.C5557h1.m33614a(android.webkit.WebView, java.lang.String):void");
    }
}
