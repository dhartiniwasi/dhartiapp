package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.measurement.b9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
abstract class C6893b9 {

    /* renamed from: a */
    private static final Logger f31587a = Logger.getLogger(C7106o8.class.getName());

    /* renamed from: b */
    private static final String f31588b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    C6893b9() {
    }

    /* renamed from: b */
    static C7186t8 m39662b(Class cls) {
        String str;
        Class<C6893b9> cls2 = C6893b9.class;
        ClassLoader classLoader = cls2.getClassLoader();
        if (cls.equals(C7186t8.class)) {
            str = f31588b;
        } else if (cls.getPackage().equals(cls2.getPackage())) {
            str = String.format("%s.BlazeGenerated%sLoader", new Object[]{cls.getPackage().getName(), cls.getSimpleName()});
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            return (C7186t8) cls.cast(((C6893b9) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).mo23127a());
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException(e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException(e3);
        } catch (InvocationTargetException e4) {
            throw new IllegalStateException(e4);
        } catch (ClassNotFoundException unused) {
            Iterator<S> it = ServiceLoader.load(cls2, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((C7186t8) cls.cast(((C6893b9) it.next()).mo23127a()));
                } catch (ServiceConfigurationError e5) {
                    f31587a.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls.getSimpleName()), e5);
                }
            }
            if (arrayList.size() == 1) {
                return (C7186t8) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (C7186t8) cls.getMethod("combine", new Class[]{Collection.class}).invoke((Object) null, new Object[]{arrayList});
            } catch (NoSuchMethodException e6) {
                throw new IllegalStateException(e6);
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C7186t8 mo23127a();
}