package p302n7;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p276k8.C11600b;

/* renamed from: n7.g */
/* compiled from: ComponentDiscovery */
public final class C11945g<T> {

    /* renamed from: a */
    private final T f44840a;

    /* renamed from: b */
    private final C11948c<T> f44841b;

    /* renamed from: n7.g$b */
    /* compiled from: ComponentDiscovery */
    private static class C11947b implements C11948c<Context> {

        /* renamed from: a */
        private final Class<? extends Service> f44842a;

        /* renamed from: b */
        private Bundle m57681b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f44842a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.f44842a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        /* renamed from: c */
        public List<String> mo36276a(Context context) {
            Bundle b = m57681b(context);
            if (b == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : b.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(b.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        private C11947b(Class<? extends Service> cls) {
            this.f44842a = cls;
        }
    }

    /* renamed from: n7.g$c */
    /* compiled from: ComponentDiscovery */
    interface C11948c<T> {
        /* renamed from: a */
        List<String> mo36276a(T t);
    }

    C11945g(T t, C11948c<T> cVar) {
        this.f44840a = t;
        this.f44841b = cVar;
    }

    /* renamed from: c */
    public static C11945g<Context> m57677c(Context context, Class<? extends Service> cls) {
        return new C11945g<>(context, new C11947b(cls));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static ComponentRegistrar m57678d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new C11971w(String.format("Class %s is not an instance of %s", new Object[]{str, "com.google.firebase.components.ComponentRegistrar"}));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", new Object[]{str}));
            return null;
        } catch (IllegalAccessException e) {
            throw new C11971w(String.format("Could not instantiate %s.", new Object[]{str}), e);
        } catch (InstantiationException e2) {
            throw new C11971w(String.format("Could not instantiate %s.", new Object[]{str}), e2);
        } catch (NoSuchMethodException e3) {
            throw new C11971w(String.format("Could not instantiate %s", new Object[]{str}), e3);
        } catch (InvocationTargetException e4) {
            throw new C11971w(String.format("Could not instantiate %s", new Object[]{str}), e4);
        }
    }

    /* renamed from: b */
    public List<C11600b<ComponentRegistrar>> mo36275b() {
        ArrayList arrayList = new ArrayList();
        for (String fVar : this.f44841b.mo36276a(this.f44840a)) {
            arrayList.add(new C11942f(fVar));
        }
        return arrayList;
    }
}
