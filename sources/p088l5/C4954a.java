package p088l5;

import android.os.IBinder;
import android.os.IInterface;
import p137s5.C5486b;

/* renamed from: l5.a */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public interface C4954a extends IInterface {

    /* renamed from: l5.a$a */
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static abstract class C4955a extends C5486b implements C4954a {
        public C4955a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        /* renamed from: B0 */
        public static C4954a m31383B0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof C4954a ? (C4954a) queryLocalInterface : new C4959d(iBinder);
        }
    }
}
