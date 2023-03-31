package p033d5;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import p033d5.C4114j;

/* renamed from: d5.a */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C4081a extends C4114j.C4115a {
    /* renamed from: P0 */
    public static Account m28023P0(C4114j jVar) {
        Account account = null;
        if (jVar != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                account = jVar.mo17409d();
            } catch (RemoteException unused) {
                Log.w("AccountAccessor", "Remote account accessor probably died");
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(clearCallingIdentity);
                throw th;
            }
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
        return account;
    }
}
