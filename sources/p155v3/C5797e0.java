package p155v3;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p161w3.C5917a;

/* renamed from: v3.e0 */
/* compiled from: HttpUtil */
public final class C5797e0 {

    /* renamed from: a */
    private static final Pattern f28795a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* renamed from: b */
    private static final Pattern f28796b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    /* renamed from: a */
    public static String m34533a(long j, long j2) {
        if (j == 0 && j2 == -1) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("bytes=");
        sb.append(j);
        sb.append("-");
        if (j2 != -1) {
            sb.append((j + j2) - 1);
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m34534b(java.lang.String r9, java.lang.String r10) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            java.lang.String r1 = "]"
            java.lang.String r2 = "HttpUtil"
            if (r0 != 0) goto L_0x0026
            long r3 = java.lang.Long.parseLong(r9)     // Catch:{ NumberFormatException -> 0x000f }
            goto L_0x0028
        L_0x000f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Unexpected Content-Length ["
            r0.append(r3)
            r0.append(r9)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            p161w3.C5961r.m35209c(r2, r0)
        L_0x0026:
            r3 = -1
        L_0x0028:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x00a4
            java.util.regex.Pattern r0 = f28795a
            java.util.regex.Matcher r0 = r0.matcher(r10)
            boolean r5 = r0.matches()
            if (r5 == 0) goto L_0x00a4
            r5 = 2
            java.lang.String r5 = r0.group(r5)     // Catch:{ NumberFormatException -> 0x008d }
            java.lang.Object r5 = p161w3.C5917a.m34872e(r5)     // Catch:{ NumberFormatException -> 0x008d }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ NumberFormatException -> 0x008d }
            long r5 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x008d }
            r7 = 1
            java.lang.String r0 = r0.group(r7)     // Catch:{ NumberFormatException -> 0x008d }
            java.lang.Object r0 = p161w3.C5917a.m34872e(r0)     // Catch:{ NumberFormatException -> 0x008d }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NumberFormatException -> 0x008d }
            long r7 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x008d }
            long r5 = r5 - r7
            r7 = 1
            long r5 = r5 + r7
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0064
            r3 = r5
            goto L_0x00a4
        L_0x0064:
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00a4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x008d }
            r0.<init>()     // Catch:{ NumberFormatException -> 0x008d }
            java.lang.String r7 = "Inconsistent headers ["
            r0.append(r7)     // Catch:{ NumberFormatException -> 0x008d }
            r0.append(r9)     // Catch:{ NumberFormatException -> 0x008d }
            java.lang.String r9 = "] ["
            r0.append(r9)     // Catch:{ NumberFormatException -> 0x008d }
            r0.append(r10)     // Catch:{ NumberFormatException -> 0x008d }
            r0.append(r1)     // Catch:{ NumberFormatException -> 0x008d }
            java.lang.String r9 = r0.toString()     // Catch:{ NumberFormatException -> 0x008d }
            p161w3.C5961r.m35215i(r2, r9)     // Catch:{ NumberFormatException -> 0x008d }
            long r9 = java.lang.Math.max(r3, r5)     // Catch:{ NumberFormatException -> 0x008d }
            r3 = r9
            goto L_0x00a4
        L_0x008d:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Unexpected Content-Range ["
            r9.append(r0)
            r9.append(r10)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            p161w3.C5961r.m35209c(r2, r9)
        L_0x00a4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p155v3.C5797e0.m34534b(java.lang.String, java.lang.String):long");
    }

    /* renamed from: c */
    public static long m34535c(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        Matcher matcher = f28796b.matcher(str);
        if (matcher.matches()) {
            return Long.parseLong((String) C5917a.m34872e(matcher.group(1)));
        }
        return -1;
    }
}
