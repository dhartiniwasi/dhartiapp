package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import p087l4.C4929a;
import p087l4.C4934f;
import p094m4.C5043a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class nb0 extends pb0 {

    /* renamed from: a */
    private static final od0 f13933a = new od0();

    /* renamed from: i */
    public final tb0 mo12562i(String str) throws RemoteException {
        try {
            Class<?> cls = Class.forName(str, false, nb0.class.getClassLoader());
            if (C4934f.class.isAssignableFrom(cls)) {
                return new pc0((C4934f) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            }
            if (C4929a.class.isAssignableFrom(cls)) {
                return new pc0((C4929a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            }
            pm0.m18667g("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
            throw new RemoteException();
        } catch (Throwable th) {
            pm0.m18668h("Could not instantiate mediation adapter: " + str + ". ", th);
        }
        throw new RemoteException();
    }

    /* renamed from: k */
    public final boolean mo12563k(String str) throws RemoteException {
        try {
            return C5043a.class.isAssignableFrom(Class.forName(str, false, nb0.class.getClassLoader()));
        } catch (Throwable unused) {
            pm0.m18667g("Could not load custom event implementation class: " + str + ", trying Adapter implementation class.");
            return false;
        }
    }

    /* renamed from: x */
    public final kd0 mo12564x(String str) throws RemoteException {
        try {
            return new vd0((RtbAdapter) Class.forName(str, false, od0.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Throwable unused) {
            throw new RemoteException();
        }
    }

    /* renamed from: z */
    public final boolean mo12565z(String str) throws RemoteException {
        try {
            return C4929a.class.isAssignableFrom(Class.forName(str, false, nb0.class.getClassLoader()));
        } catch (Throwable unused) {
            pm0.m18667g("Could not load custom event implementation class as Adapter: " + str + ", assuming old custom event implementation.");
            return false;
        }
    }
}
