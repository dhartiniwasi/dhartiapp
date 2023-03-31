package com.startapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.startapp.f1 */
/* compiled from: Sta */
public class C8941f1 {

    /* renamed from: a */
    public static final Map<String, Bitmap> f36750a = new ConcurrentHashMap();

    /* renamed from: a */
    public static Bitmap m48561a(Context context, String str) {
        Bitmap b = m48563b(context, str);
        return b == null ? m48563b(context, str) : b;
    }

    /* renamed from: b */
    public static Bitmap m48563b(Context context, String str) {
        FileInputStream fileInputStream;
        Map<String, Bitmap> map = f36750a;
        Bitmap bitmap = (Bitmap) ((ConcurrentHashMap) map).get(str);
        if (bitmap != null) {
            return bitmap;
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(context.getFilesDir().getPath() + "/" + str);
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream);
                decodeStream.setDensity(context.getResources() != null ? context.getResources().getDisplayMetrics().densityDpi : 160);
                ((ConcurrentHashMap) map).put(str, decodeStream);
                C9605vb.m50459a((Closeable) fileInputStream);
                return decodeStream;
            } catch (Exception unused) {
                C9605vb.m50459a((Closeable) fileInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                C9605vb.m50459a((Closeable) fileInputStream2);
                throw th;
            }
        } catch (Exception unused2) {
            fileInputStream = null;
            C9605vb.m50459a((Closeable) fileInputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C9605vb.m50459a((Closeable) fileInputStream2);
            throw th;
        }
    }

    /* renamed from: a */
    public static boolean m48562a(Context context, String str, String str2) {
        if (!str.endsWith(str2)) {
            str = C9688ze.m50607a(str, str2);
        }
        if (!((ConcurrentHashMap) f36750a).containsKey(str)) {
            if (!new File(context.getFilesDir().getPath() + "/" + str).exists()) {
                return false;
            }
        }
        return true;
    }
}
