package com.google.android.gms.internal.ads;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class g53 {

    /* renamed from: a */
    public static final int f9707a = (Build.VERSION.SDK_INT > 22 ? 67108864 : 0);

    /* renamed from: b */
    public static final ClipData f9708b = ClipData.newIntent("", new Intent());

    /* renamed from: a */
    public static PendingIntent m13044a(Context context, int i, Intent intent, int i2, int i3) {
        boolean z = true;
        b83.m10242f((i2 & 95) == 0, "Cannot set any dangerous parts of intent to be mutable.");
        b83.m10242f(intent.getComponent() != null, "Must set component on Intent.");
        if (m13045b(0, 1)) {
            b83.m10242f(!m13045b(i2, 67108864), "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
        } else {
            if (Build.VERSION.SDK_INT >= 23 && !m13045b(i2, 67108864)) {
                z = false;
            }
            b83.m10242f(z, "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
        }
        Intent intent2 = new Intent(intent);
        if (Build.VERSION.SDK_INT < 23 || !m13045b(i2, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!m13045b(0, 3) && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!m13045b(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!m13045b(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!m13045b(0, 17) && intent2.getClipData() == null) {
                intent2.setClipData(f9708b);
            }
        }
        return PendingIntent.getService(context, 0, intent2, i2);
    }

    /* renamed from: b */
    private static boolean m13045b(int i, int i2) {
        return (i & i2) == i2;
    }
}
