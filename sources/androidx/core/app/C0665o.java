package androidx.core.app;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import com.facebook.ads.AdError;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p018c.C1829a;

/* renamed from: androidx.core.app.o */
/* compiled from: NotificationManagerCompat */
public final class C0665o {

    /* renamed from: c */
    private static final Object f2160c = new Object();

    /* renamed from: d */
    private static String f2161d;

    /* renamed from: e */
    private static Set<String> f2162e = new HashSet();

    /* renamed from: f */
    private static final Object f2163f = new Object();

    /* renamed from: g */
    private static C0669d f2164g;

    /* renamed from: a */
    private final Context f2165a;

    /* renamed from: b */
    private final NotificationManager f2166b;

    /* renamed from: androidx.core.app.o$a */
    /* compiled from: NotificationManagerCompat */
    private static class C0666a implements C0671e {

        /* renamed from: a */
        final String f2167a;

        /* renamed from: b */
        final int f2168b;

        /* renamed from: c */
        final String f2169c;

        /* renamed from: d */
        final boolean f2170d = false;

        C0666a(String str, int i, String str2) {
            this.f2167a = str;
            this.f2168b = i;
            this.f2169c = str2;
        }

        /* renamed from: a */
        public void mo2971a(C1829a aVar) throws RemoteException {
            if (this.f2170d) {
                aVar.mo7013o2(this.f2167a);
            } else {
                aVar.mo7011h4(this.f2167a, this.f2168b, this.f2169c);
            }
        }

        public String toString() {
            return "CancelTask[" + "packageName:" + this.f2167a + ", id:" + this.f2168b + ", tag:" + this.f2169c + ", all:" + this.f2170d + "]";
        }
    }

    /* renamed from: androidx.core.app.o$b */
    /* compiled from: NotificationManagerCompat */
    private static class C0667b implements C0671e {

        /* renamed from: a */
        final String f2171a;

        /* renamed from: b */
        final int f2172b;

        /* renamed from: c */
        final String f2173c;

        /* renamed from: d */
        final Notification f2174d;

        C0667b(String str, int i, String str2, Notification notification) {
            this.f2171a = str;
            this.f2172b = i;
            this.f2173c = str2;
            this.f2174d = notification;
        }

        /* renamed from: a */
        public void mo2971a(C1829a aVar) throws RemoteException {
            aVar.mo7012k6(this.f2171a, this.f2172b, this.f2173c, this.f2174d);
        }

        public String toString() {
            return "NotifyTask[" + "packageName:" + this.f2171a + ", id:" + this.f2172b + ", tag:" + this.f2173c + "]";
        }
    }

    /* renamed from: androidx.core.app.o$c */
    /* compiled from: NotificationManagerCompat */
    private static class C0668c {

        /* renamed from: a */
        final ComponentName f2175a;

        /* renamed from: b */
        final IBinder f2176b;

        C0668c(ComponentName componentName, IBinder iBinder) {
            this.f2175a = componentName;
            this.f2176b = iBinder;
        }
    }

    /* renamed from: androidx.core.app.o$d */
    /* compiled from: NotificationManagerCompat */
    private static class C0669d implements Handler.Callback, ServiceConnection {

        /* renamed from: a */
        private final Context f2177a;

        /* renamed from: b */
        private final HandlerThread f2178b;

        /* renamed from: c */
        private final Handler f2179c;

        /* renamed from: d */
        private final Map<ComponentName, C0670a> f2180d = new HashMap();

        /* renamed from: e */
        private Set<String> f2181e = new HashSet();

        /* renamed from: androidx.core.app.o$d$a */
        /* compiled from: NotificationManagerCompat */
        private static class C0670a {

            /* renamed from: a */
            final ComponentName f2182a;

            /* renamed from: b */
            boolean f2183b = false;

            /* renamed from: c */
            C1829a f2184c;

            /* renamed from: d */
            ArrayDeque<C0671e> f2185d = new ArrayDeque<>();

            /* renamed from: e */
            int f2186e = 0;

            C0670a(ComponentName componentName) {
                this.f2182a = componentName;
            }
        }

        C0669d(Context context) {
            this.f2177a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f2178b = handlerThread;
            handlerThread.start();
            this.f2179c = new Handler(handlerThread.getLooper(), this);
        }

        /* renamed from: a */
        private boolean m3106a(C0670a aVar) {
            if (aVar.f2183b) {
                return true;
            }
            boolean bindService = this.f2177a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f2182a), this, 33);
            aVar.f2183b = bindService;
            if (bindService) {
                aVar.f2186e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f2182a);
                this.f2177a.unbindService(this);
            }
            return aVar.f2183b;
        }

        /* renamed from: b */
        private void m3107b(C0670a aVar) {
            if (aVar.f2183b) {
                this.f2177a.unbindService(this);
                aVar.f2183b = false;
            }
            aVar.f2184c = null;
        }

        /* renamed from: c */
        private void m3108c(C0671e eVar) {
            m3114j();
            for (C0670a next : this.f2180d.values()) {
                next.f2185d.add(eVar);
                m3112g(next);
            }
        }

        /* renamed from: d */
        private void m3109d(ComponentName componentName) {
            C0670a aVar = this.f2180d.get(componentName);
            if (aVar != null) {
                m3112g(aVar);
            }
        }

        /* renamed from: e */
        private void m3110e(ComponentName componentName, IBinder iBinder) {
            C0670a aVar = this.f2180d.get(componentName);
            if (aVar != null) {
                aVar.f2184c = C1829a.C1830a.m8532p(iBinder);
                aVar.f2186e = 0;
                m3112g(aVar);
            }
        }

        /* renamed from: f */
        private void m3111f(ComponentName componentName) {
            C0670a aVar = this.f2180d.get(componentName);
            if (aVar != null) {
                m3107b(aVar);
            }
        }

        /* renamed from: g */
        private void m3112g(C0670a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f2182a + ", " + aVar.f2185d.size() + " queued tasks");
            }
            if (!aVar.f2185d.isEmpty()) {
                if (!m3106a(aVar) || aVar.f2184c == null) {
                    m3113i(aVar);
                    return;
                }
                while (true) {
                    C0671e peek = aVar.f2185d.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + peek);
                        }
                        peek.mo2971a(aVar.f2184c);
                        aVar.f2185d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Remote service has died: " + aVar.f2182a);
                        }
                    } catch (RemoteException e) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f2182a, e);
                    }
                }
                if (!aVar.f2185d.isEmpty()) {
                    m3113i(aVar);
                }
            }
        }

        /* renamed from: i */
        private void m3113i(C0670a aVar) {
            if (!this.f2179c.hasMessages(3, aVar.f2182a)) {
                int i = aVar.f2186e + 1;
                aVar.f2186e = i;
                if (i > 6) {
                    Log.w("NotifManCompat", "Giving up on delivering " + aVar.f2185d.size() + " tasks to " + aVar.f2182a + " after " + aVar.f2186e + " retries");
                    aVar.f2185d.clear();
                    return;
                }
                int i2 = (1 << (i - 1)) * AdError.NETWORK_ERROR_CODE;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i2 + " ms");
                }
                this.f2179c.sendMessageDelayed(this.f2179c.obtainMessage(3, aVar.f2182a), (long) i2);
            }
        }

        /* renamed from: j */
        private void m3114j() {
            Set<String> f = C0665o.m3095f(this.f2177a);
            if (!f.equals(this.f2181e)) {
                this.f2181e = f;
                List<ResolveInfo> queryIntentServices = this.f2177a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet = new HashSet<>();
                for (ResolveInfo next : queryIntentServices) {
                    if (f.contains(next.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = next.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (next.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!this.f2180d.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.f2180d.put(componentName2, new C0670a(componentName2));
                    }
                }
                Iterator<Map.Entry<ComponentName, C0670a>> it = this.f2180d.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry next2 = it.next();
                    if (!hashSet.contains(next2.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + next2.getKey());
                        }
                        m3107b((C0670a) next2.getValue());
                        it.remove();
                    }
                }
            }
        }

        /* renamed from: h */
        public void mo2974h(C0671e eVar) {
            this.f2179c.obtainMessage(0, eVar).sendToTarget();
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                m3108c((C0671e) message.obj);
                return true;
            } else if (i == 1) {
                C0668c cVar = (C0668c) message.obj;
                m3110e(cVar.f2175a, cVar.f2176b);
                return true;
            } else if (i == 2) {
                m3111f((ComponentName) message.obj);
                return true;
            } else if (i != 3) {
                return false;
            } else {
                m3109d((ComponentName) message.obj);
                return true;
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f2179c.obtainMessage(1, new C0668c(componentName, iBinder)).sendToTarget();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f2179c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* renamed from: androidx.core.app.o$e */
    /* compiled from: NotificationManagerCompat */
    private interface C0671e {
        /* renamed from: a */
        void mo2971a(C1829a aVar) throws RemoteException;
    }

    private C0665o(Context context) {
        this.f2165a = context;
        this.f2166b = (NotificationManager) context.getSystemService("notification");
    }

    /* renamed from: e */
    public static C0665o m3094e(Context context) {
        return new C0665o(context);
    }

    /* renamed from: f */
    public static Set<String> m3095f(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f2160c) {
            if (string != null) {
                if (!string.equals(f2161d)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String unflattenFromString : split) {
                        ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                        if (unflattenFromString2 != null) {
                            hashSet.add(unflattenFromString2.getPackageName());
                        }
                    }
                    f2162e = hashSet;
                    f2161d = string;
                }
            }
            set = f2162e;
        }
        return set;
    }

    /* renamed from: i */
    private void m3096i(C0671e eVar) {
        synchronized (f2163f) {
            if (f2164g == null) {
                f2164g = new C0669d(this.f2165a.getApplicationContext());
            }
            f2164g.mo2974h(eVar);
        }
    }

    /* renamed from: j */
    private static boolean m3097j(Notification notification) {
        Bundle a = C0651l.m2993a(notification);
        return a != null && a.getBoolean("android.support.useSideChannel");
    }

    /* renamed from: a */
    public boolean mo2965a() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return this.f2166b.areNotificationsEnabled();
        }
        if (i < 19) {
            return true;
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f2165a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f2165a.getApplicationInfo();
        String packageName = this.f2165a.getApplicationContext().getPackageName();
        int i2 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class cls2 = Integer.TYPE;
            if (((Integer) cls.getMethod("checkOpNoThrow", new Class[]{cls2, cls2, String.class}).invoke(appOpsManager, new Object[]{Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i2), packageName})).intValue() == 0) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    /* renamed from: b */
    public void mo2966b(int i) {
        mo2967c((String) null, i);
    }

    /* renamed from: c */
    public void mo2967c(String str, int i) {
        this.f2166b.cancel(str, i);
        if (Build.VERSION.SDK_INT <= 19) {
            m3096i(new C0666a(this.f2165a.getPackageName(), i, str));
        }
    }

    /* renamed from: d */
    public void mo2968d(NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2166b.createNotificationChannel(notificationChannel);
        }
    }

    /* renamed from: g */
    public void mo2969g(int i, Notification notification) {
        mo2970h((String) null, i, notification);
    }

    /* renamed from: h */
    public void mo2970h(String str, int i, Notification notification) {
        if (m3097j(notification)) {
            m3096i(new C0667b(this.f2165a.getPackageName(), i, str, notification));
            this.f2166b.cancel(str, i);
            return;
        }
        this.f2166b.notify(str, i, notification);
    }
}
