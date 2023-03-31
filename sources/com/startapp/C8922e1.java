package com.startapp;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.Closeable;
import java.io.FileOutputStream;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.startapp.e1 */
/* compiled from: Sta */
public class C8922e1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f36712a;

    /* renamed from: b */
    public final /* synthetic */ String f36713b;

    /* renamed from: c */
    public final /* synthetic */ Bitmap f36714c;

    /* renamed from: d */
    public final /* synthetic */ Context f36715d;

    public C8922e1(String str, String str2, Bitmap bitmap, Context context) {
        this.f36712a = str;
        this.f36713b = str2;
        this.f36714c = bitmap;
        this.f36715d = context;
    }

    public void run() {
        FileOutputStream fileOutputStream;
        Throwable th;
        ((ConcurrentHashMap) C8941f1.f36750a).put(this.f36712a + this.f36713b, this.f36714c);
        try {
            fileOutputStream = new FileOutputStream(this.f36715d.getFilesDir().getPath() + "/" + this.f36712a + this.f36713b);
            try {
                this.f36714c.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                C9605vb.m50459a((Closeable) fileOutputStream);
            } catch (Throwable th2) {
                th = th2;
                try {
                    C9023i4.m48681a(th);
                } finally {
                    C9605vb.m50459a((Closeable) fileOutputStream);
                }
            }
        } catch (Throwable th3) {
            Throwable th4 = th3;
            fileOutputStream = null;
            th = th4;
            C9023i4.m48681a(th);
        }
    }
}
