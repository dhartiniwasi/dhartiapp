package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.C1432c;
import java.util.HashMap;

public class MultiInstanceInvalidationService extends Service {

    /* renamed from: a */
    int f4061a = 0;

    /* renamed from: b */
    final HashMap<Integer, String> f4062b = new HashMap<>();

    /* renamed from: c */
    final RemoteCallbackList<C1429b> f4063c = new C1426a();

    /* renamed from: d */
    private final C1432c.C1433a f4064d = new C1427b();

    /* renamed from: androidx.room.MultiInstanceInvalidationService$a */
    class C1426a extends RemoteCallbackList<C1429b> {
        C1426a() {
        }

        /* renamed from: a */
        public void onCallbackDied(C1429b bVar, Object obj) {
            MultiInstanceInvalidationService.this.f4062b.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    /* renamed from: androidx.room.MultiInstanceInvalidationService$b */
    class C1427b extends C1432c.C1433a {
        C1427b() {
        }

        /* renamed from: b6 */
        public void mo5555b6(int i, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f4063c) {
                String str = MultiInstanceInvalidationService.this.f4062b.get(Integer.valueOf(i));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.f4063c.beginBroadcast();
                for (int i2 = 0; i2 < beginBroadcast; i2++) {
                    try {
                        int intValue = ((Integer) MultiInstanceInvalidationService.this.f4063c.getBroadcastCookie(i2)).intValue();
                        String str2 = MultiInstanceInvalidationService.this.f4062b.get(Integer.valueOf(intValue));
                        if (i != intValue && str.equals(str2)) {
                            MultiInstanceInvalidationService.this.f4063c.getBroadcastItem(i2).mo5559Q1(strArr);
                        }
                    } catch (RemoteException e) {
                        Log.w("ROOM", "Error invoking a remote callback", e);
                    } catch (Throwable th) {
                        MultiInstanceInvalidationService.this.f4063c.finishBroadcast();
                        throw th;
                    }
                }
                MultiInstanceInvalidationService.this.f4063c.finishBroadcast();
            }
        }

        /* renamed from: u2 */
        public int mo5556u2(C1429b bVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f4063c) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i = multiInstanceInvalidationService.f4061a + 1;
                multiInstanceInvalidationService.f4061a = i;
                if (multiInstanceInvalidationService.f4063c.register(bVar, Integer.valueOf(i))) {
                    MultiInstanceInvalidationService.this.f4062b.put(Integer.valueOf(i), str);
                    return i;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.f4061a--;
                return 0;
            }
        }

        /* renamed from: u6 */
        public void mo5557u6(C1429b bVar, int i) {
            synchronized (MultiInstanceInvalidationService.this.f4063c) {
                MultiInstanceInvalidationService.this.f4063c.unregister(bVar);
                MultiInstanceInvalidationService.this.f4062b.remove(Integer.valueOf(i));
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f4064d;
    }
}
