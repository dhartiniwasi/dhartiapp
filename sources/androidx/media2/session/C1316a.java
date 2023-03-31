package androidx.media2.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: androidx.media2.session.a */
/* compiled from: IMediaSession */
public interface C1316a extends IInterface {

    /* renamed from: androidx.media2.session.a$a */
    /* compiled from: IMediaSession */
    public static abstract class C1317a extends Binder implements C1316a {

        /* renamed from: androidx.media2.session.a$a$a */
        /* compiled from: IMediaSession */
        private static class C1318a implements C1316a {

            /* renamed from: a */
            private IBinder f3658a;

            C1318a(IBinder iBinder) {
                this.f3658a = iBinder;
            }

            public IBinder asBinder() {
                return this.f3658a;
            }
        }

        /* renamed from: p */
        public static C1316a m5737p(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.media2.session.IMediaSession");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C1316a)) {
                return new C1318a(iBinder);
            }
            return (C1316a) queryLocalInterface;
        }
    }
}
