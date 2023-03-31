package p105o1;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o1.k */
/* compiled from: MetadataBackendRegistry */
class C5162k implements C5154e {

    /* renamed from: a */
    private final C5163a f26692a;

    /* renamed from: b */
    private final C5160i f26693b;

    /* renamed from: c */
    private final Map<String, C5165m> f26694c;

    /* renamed from: o1.k$a */
    /* compiled from: MetadataBackendRegistry */
    static class C5163a {

        /* renamed from: a */
        private final Context f26695a;

        /* renamed from: b */
        private Map<String, String> f26696b = null;

        C5163a(Context context) {
            this.f26695a = context;
        }

        /* renamed from: a */
        private Map<String, String> m32082a(Context context) {
            Bundle d = m32084d(context);
            if (d == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : d.keySet()) {
                Object obj = d.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String trim : ((String) obj).split(",", -1)) {
                        String trim2 = trim.trim();
                        if (!trim2.isEmpty()) {
                            hashMap.put(trim2, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        /* renamed from: c */
        private Map<String, String> m32083c() {
            if (this.f26696b == null) {
                this.f26696b = m32082a(this.f26695a);
            }
            return this.f26696b;
        }

        /* renamed from: d */
        private static Bundle m32084d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C5153d mo19141b(String str) {
            String str2 = m32083c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (C5153d) Class.forName(str2).asSubclass(C5153d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", new Object[]{str2}), e);
                return null;
            } catch (IllegalAccessException e2) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", new Object[]{str2}), e2);
                return null;
            } catch (InstantiationException e3) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", new Object[]{str2}), e3);
                return null;
            } catch (NoSuchMethodException e4) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", new Object[]{str2}), e4);
                return null;
            } catch (InvocationTargetException e5) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", new Object[]{str2}), e5);
                return null;
            }
        }
    }

    C5162k(Context context, C5160i iVar) {
        this(new C5163a(context), iVar);
    }

    public synchronized C5165m get(String str) {
        if (this.f26694c.containsKey(str)) {
            return this.f26694c.get(str);
        }
        C5153d b = this.f26692a.mo19141b(str);
        if (b == null) {
            return null;
        }
        C5165m create = b.create(this.f26693b.mo19139a(str));
        this.f26694c.put(str, create);
        return create;
    }

    C5162k(C5163a aVar, C5160i iVar) {
        this.f26694c = new HashMap();
        this.f26692a = aVar;
        this.f26693b = iVar;
    }
}
