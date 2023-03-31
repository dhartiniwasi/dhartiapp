package p162w4;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import p033d5.C4141r;

/* renamed from: w4.a */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C5981a {

    /* renamed from: c */
    private static final Lock f29192c = new ReentrantLock();

    /* renamed from: d */
    private static C5981a f29193d;

    /* renamed from: a */
    private final Lock f29194a = new ReentrantLock();

    /* renamed from: b */
    private final SharedPreferences f29195b;

    C5981a(Context context) {
        this.f29195b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* renamed from: a */
    public static C5981a m35307a(Context context) {
        C4141r.m28221k(context);
        Lock lock = f29192c;
        lock.lock();
        try {
            if (f29193d == null) {
                f29193d = new C5981a(context.getApplicationContext());
            }
            C5981a aVar = f29193d;
            lock.unlock();
            return aVar;
        } catch (Throwable th) {
            f29192c.unlock();
            throw th;
        }
    }

    /* renamed from: d */
    private static final String m35308d(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: b */
    public GoogleSignInAccount mo20688b() {
        String c;
        String c2 = mo20689c("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(c2) || (c = mo20689c(m35308d("googleSignInAccount", c2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.m9036Q1(c);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo20689c(String str) {
        this.f29194a.lock();
        try {
            return this.f29195b.getString(str, (String) null);
        } finally {
            this.f29194a.unlock();
        }
    }
}
