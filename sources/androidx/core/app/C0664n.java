package androidx.core.app;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.app.C0651l;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.util.List;

/* renamed from: androidx.core.app.n */
/* compiled from: NotificationCompatJellybean */
class C0664n {

    /* renamed from: a */
    private static final Object f2156a = new Object();

    /* renamed from: b */
    private static Field f2157b;

    /* renamed from: c */
    private static boolean f2158c;

    /* renamed from: d */
    private static final Object f2159d = new Object();

    /* renamed from: a */
    public static SparseArray<Bundle> m3088a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    /* renamed from: b */
    static Bundle m3089b(C0651l.C0652a aVar) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        IconCompat f = aVar.mo2902f();
        bundle2.putInt("icon", f != null ? f.mo3061p() : 0);
        bundle2.putCharSequence("title", aVar.mo2906j());
        bundle2.putParcelable("actionIntent", aVar.mo2897a());
        if (aVar.mo2900d() != null) {
            bundle = new Bundle(aVar.mo2900d());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo2898b());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", m3092e(aVar.mo2903g()));
        bundle2.putBoolean("showsUserInterface", aVar.mo2905i());
        bundle2.putInt("semanticAction", aVar.mo2904h());
        return bundle2;
    }

    /* renamed from: c */
    public static Bundle m3090c(Notification notification) {
        synchronized (f2156a) {
            if (f2158c) {
                return null;
            }
            try {
                if (f2157b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f2158c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f2157b = declaredField;
                }
                Bundle bundle = (Bundle) f2157b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f2157b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                Log.e("NotificationCompat", "Unable to access notification extras", e);
                f2158c = true;
                return null;
            } catch (NoSuchFieldException e2) {
                Log.e("NotificationCompat", "Unable to access notification extras", e2);
                f2158c = true;
                return null;
            }
        }
    }

    /* renamed from: d */
    private static Bundle m3091d(C0676r rVar) {
        new Bundle();
        throw null;
    }

    /* renamed from: e */
    private static Bundle[] m3092e(C0676r[] rVarArr) {
        if (rVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[rVarArr.length];
        for (int i = 0; i < rVarArr.length; i++) {
            bundleArr[i] = m3091d(rVarArr[i]);
        }
        return bundleArr;
    }

    /* renamed from: f */
    public static Bundle m3093f(Notification.Builder builder, C0651l.C0652a aVar) {
        IconCompat f = aVar.mo2902f();
        builder.addAction(f != null ? f.mo3061p() : 0, aVar.mo2906j(), aVar.mo2897a());
        Bundle bundle = new Bundle(aVar.mo2900d());
        if (aVar.mo2903g() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", m3092e(aVar.mo2903g()));
        }
        if (aVar.mo2899c() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", m3092e(aVar.mo2899c()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo2898b());
        return bundle;
    }
}
