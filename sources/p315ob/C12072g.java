package p315ob;

import android.os.Handler;
import android.os.Looper;
import p315ob.C12058c;
import p325pc.C12165a;

/* renamed from: ob.g */
/* compiled from: PlatformTaskQueue */
public class C12072g implements C12058c.C12062d {

    /* renamed from: a */
    private final Handler f45100a = C12165a.m58436a(Looper.getMainLooper());

    /* renamed from: a */
    public void mo36435a(Runnable runnable) {
        this.f45100a.post(runnable);
    }
}
