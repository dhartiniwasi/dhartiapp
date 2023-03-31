package p152v0;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;

/* renamed from: v0.a */
/* compiled from: ParcelUtils */
public class C5754a {
    private C5754a() {
    }

    /* renamed from: a */
    public static <T extends C5755b> T m34336a(Parcelable parcelable) {
        if (parcelable instanceof ParcelImpl) {
            return ((ParcelImpl) parcelable).mo4645a();
        }
        throw new IllegalArgumentException("Invalid parcel");
    }

    /* renamed from: b */
    public static <T extends C5755b> T m34337b(Bundle bundle, String str) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(C5754a.class.getClassLoader());
            return m34336a(bundle2.getParcelable("a"));
        } catch (RuntimeException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static void m34338c(Bundle bundle, String str, C5755b bVar) {
        if (bVar != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("a", m34339d(bVar));
            bundle.putParcelable(str, bundle2);
        }
    }

    /* renamed from: d */
    public static Parcelable m34339d(C5755b bVar) {
        return new ParcelImpl(bVar);
    }
}
