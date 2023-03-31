package p177z1;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import p177z1.C6224h;

/* renamed from: z1.q2 */
/* compiled from: PlaybackException */
public class C6265q2 extends Exception implements C6224h {

    /* renamed from: c */
    public static final C6224h.C6225a<C6265q2> f30178c = C13415p2.f47753a;

    /* renamed from: a */
    public final int f30179a;

    /* renamed from: b */
    public final long f30180b;

    protected C6265q2(Bundle bundle) {
        this(bundle.getString(m36824d(2)), m36823c(bundle), bundle.getInt(m36824d(0), AdError.NETWORK_ERROR_CODE), bundle.getLong(m36824d(1), SystemClock.elapsedRealtime()));
    }

    /* renamed from: a */
    private static RemoteException m36821a(String str) {
        return new RemoteException(str);
    }

    /* renamed from: b */
    private static Throwable m36822b(Class<?> cls, String str) throws Exception {
        return (Throwable) cls.getConstructor(new Class[]{String.class}).newInstance(new Object[]{str});
    }

    /* renamed from: c */
    private static Throwable m36823c(Bundle bundle) {
        String string = bundle.getString(m36824d(3));
        String string2 = bundle.getString(m36824d(4));
        Throwable th = null;
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, C6265q2.class.getClassLoader());
            if (Throwable.class.isAssignableFrom(cls)) {
                th = m36822b(cls, string2);
            }
            if (th != null) {
                return th;
            }
        } catch (Throwable unused) {
        }
        return m36821a(string2);
    }

    /* renamed from: d */
    protected static String m36824d(int i) {
        return Integer.toString(i, 36);
    }

    protected C6265q2(String str, Throwable th, int i, long j) {
        super(str, th);
        this.f30179a = i;
        this.f30180b = j;
    }
}
