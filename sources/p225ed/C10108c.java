package p225ed;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.jvm.internal.C11669k;

/* renamed from: ed.c */
/* compiled from: Hooks.kt */
public final class C10108c {
    /* renamed from: a */
    public static final File m51421a(Bitmap bitmap, File file, int i, int i2) {
        C11669k.m56787e(bitmap, "<this>");
        C11669k.m56787e(file, "file");
        FileOutputStream fileOutputStream = new FileOutputStream(file, false);
        bitmap.compress(C10106a.m51420a(i), i2, fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();
        return file;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        p317od.C12114b.m58233a(r0, r3);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m51422b(java.io.InputStream r3, java.io.File r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C11669k.m56787e(r3, r0)
            java.lang.String r0 = "file"
            kotlin.jvm.internal.C11669k.m56787e(r4, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r4)
            r4 = 0
            r1 = 2
            r2 = 0
            p317od.C12113a.m58232b(r3, r0, r4, r1, r2)     // Catch:{ all -> 0x0019 }
            p317od.C12114b.m58233a(r0, r2)
            return
        L_0x0019:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x001b }
        L_0x001b:
            r4 = move-exception
            p317od.C12114b.m58233a(r0, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p225ed.C10108c.m51422b(java.io.InputStream, java.io.File):void");
    }
}
