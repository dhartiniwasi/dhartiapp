package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import p033d5.C4141r;
import p218e6.C9975i;
import p218e6.C9977j;

/* renamed from: com.google.firebase.messaging.f0 */
/* compiled from: ImageDownload */
public class C8033f0 implements Closeable {

    /* renamed from: a */
    private final URL f34669a;

    /* renamed from: b */
    private volatile Future<?> f34670b;

    /* renamed from: c */
    private C9975i<Bitmap> f34671c;

    private C8033f0(URL url) {
        this.f34669a = url;
    }

    /* renamed from: f */
    private byte[] m44246f() throws IOException {
        URLConnection openConnection = this.f34669a.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] d = C8016b.m44163d(C8016b.m44161b(inputStream, 1048577));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    Log.v("FirebaseMessaging", "Downloaded " + d.length + " bytes from " + this.f34669a);
                }
                if (d.length <= 1048576) {
                    return d;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        throw th;
    }

    /* renamed from: g */
    public static C8033f0 m44247g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new C8033f0(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m44248m(C9977j jVar) {
        try {
            jVar.mo32544c(mo26631b());
        } catch (Exception e) {
            jVar.mo32543b(e);
        }
    }

    /* renamed from: b */
    public Bitmap mo26631b() throws IOException {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f34669a);
        }
        byte[] f = m44246f();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(f, 0, f.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.f34669a);
            }
            return decodeByteArray;
        }
        throw new IOException("Failed to decode image: " + this.f34669a);
    }

    public void close() {
        this.f34670b.cancel(true);
    }

    /* renamed from: h */
    public C9975i<Bitmap> mo26633h() {
        return (C9975i) C4141r.m28221k(this.f34671c);
    }

    /* renamed from: n */
    public void mo26634n(ExecutorService executorService) {
        C9977j jVar = new C9977j();
        this.f34670b = executorService.submit(new C8030e0(this, jVar));
        this.f34671c = jVar.mo32542a();
    }
}
