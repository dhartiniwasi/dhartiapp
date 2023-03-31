package p290ld;

import kotlin.jvm.internal.C11669k;
import p299md.C11886a;
import p308nd.C11997a;

/* renamed from: ld.b */
/* compiled from: PlatformImplementations.kt */
public final class C11788b {

    /* renamed from: a */
    public static final C11786a f44436a;

    static {
        C11786a aVar;
        C11886a newInstance;
        C11997a newInstance2;
        Class<C11786a> cls = C11786a.class;
        int a = m57136a();
        if (a >= 65544 || a < 65536) {
            try {
                newInstance2 = C11997a.class.newInstance();
                C11669k.m56786d(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                if (newInstance2 != null) {
                    aVar = newInstance2;
                    f44436a = aVar;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            } catch (ClassCastException e) {
                ClassLoader classLoader = newInstance2.getClass().getClassLoader();
                ClassLoader classLoader2 = cls.getClassLoader();
                if (!C11669k.m56783a(classLoader, classLoader2)) {
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e);
                }
                throw e;
            } catch (ClassNotFoundException unused) {
                try {
                    Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                    C11669k.m56786d(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
                    if (newInstance3 != null) {
                        try {
                            aVar = (C11786a) newInstance3;
                        } catch (ClassCastException e2) {
                            ClassLoader classLoader3 = newInstance3.getClass().getClassLoader();
                            ClassLoader classLoader4 = cls.getClassLoader();
                            if (!C11669k.m56783a(classLoader3, classLoader4)) {
                                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e2);
                            }
                            throw e2;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassNotFoundException unused2) {
                }
            }
        }
        if (a >= 65543 || a < 65536) {
            try {
                newInstance = C11886a.class.newInstance();
                C11669k.m56786d(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
                if (newInstance != null) {
                    aVar = newInstance;
                    f44436a = aVar;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            } catch (ClassCastException e3) {
                ClassLoader classLoader5 = newInstance.getClass().getClassLoader();
                ClassLoader classLoader6 = cls.getClassLoader();
                if (!C11669k.m56783a(classLoader5, classLoader6)) {
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e3);
                }
                throw e3;
            } catch (ClassNotFoundException unused3) {
                try {
                    Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    C11669k.m56786d(newInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                    if (newInstance4 != null) {
                        try {
                            aVar = (C11786a) newInstance4;
                        } catch (ClassCastException e4) {
                            ClassLoader classLoader7 = newInstance4.getClass().getClassLoader();
                            ClassLoader classLoader8 = cls.getClassLoader();
                            if (!C11669k.m56783a(classLoader7, classLoader8)) {
                                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e4);
                            }
                            throw e4;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassNotFoundException unused4) {
                }
            }
        }
        aVar = new C11786a();
        f44436a = aVar;
    }

    /* renamed from: a */
    private static final int m57136a() {
        String property = System.getProperty("java.specification.version");
        if (property == null) {
            return 65542;
        }
        int y = C13011o.m61307y(property, '.', 0, false, 6, (Object) null);
        if (y < 0) {
            try {
                return Integer.parseInt(property) * 65536;
            } catch (NumberFormatException unused) {
                return 65542;
            }
        } else {
            int i = y + 1;
            int y2 = C13011o.m61307y(property, '.', i, false, 4, (Object) null);
            if (y2 < 0) {
                y2 = property.length();
            }
            String substring = property.substring(0, y);
            C11669k.m56786d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring2 = property.substring(i, y2);
            C11669k.m56786d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            try {
                return (Integer.parseInt(substring) * 65536) + Integer.parseInt(substring2);
            } catch (NumberFormatException unused2) {
                return 65542;
            }
        }
    }
}
