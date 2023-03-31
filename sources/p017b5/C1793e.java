package p017b5;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: b5.e */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public interface C1793e {
    /* renamed from: a */
    void mo6925a(String str, LifecycleCallback lifecycleCallback);

    /* renamed from: b */
    <T extends LifecycleCallback> T mo6926b(String str, Class<T> cls);

    /* renamed from: c */
    Activity mo6927c();

    void startActivityForResult(Intent intent, int i);
}
