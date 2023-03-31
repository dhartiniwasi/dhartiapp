package kotlin.jvm.internal;

import com.unity3d.ads.metadata.MediationMetaData;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p243gd.C10330c;
import p243gd.C10340l;
import p243gd.C10346p;
import p335qd.C12224a;
import p344rd.C12428a;
import p344rd.C12429b;
import p344rd.C12430c;
import p344rd.C12431d;
import p344rd.C12432e;
import p344rd.C12433f;
import p344rd.C12434g;
import p344rd.C12435h;
import p344rd.C12436i;
import p344rd.C12437j;
import p344rd.C12438k;
import p344rd.C12439l;
import p344rd.C12440m;
import p344rd.C12441n;
import p344rd.C12442o;
import p344rd.C12443p;
import p344rd.C12444q;
import p344rd.C12445r;
import p344rd.C12446s;
import p344rd.C12447t;
import p344rd.C12448u;
import p344rd.C12449v;
import p344rd.C12450w;
import p382vd.C12890c;

/* renamed from: kotlin.jvm.internal.e */
/* compiled from: ClassReference.kt */
public final class C11662e implements C12890c<Object>, C11661d {

    /* renamed from: b */
    public static final C11663a f44230b = new C11663a((C11665g) null);

    /* renamed from: c */
    private static final Map<Class<? extends C10330c<?>>, Integer> f44231c;

    /* renamed from: d */
    private static final HashMap<String, String> f44232d;

    /* renamed from: e */
    private static final HashMap<String, String> f44233e;

    /* renamed from: f */
    private static final HashMap<String, String> f44234f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final Map<String, String> f44235g;

    /* renamed from: a */
    private final Class<?> f44236a;

    /* renamed from: kotlin.jvm.internal.e$a */
    /* compiled from: ClassReference.kt */
    public static final class C11663a {
        private C11663a() {
        }

        public /* synthetic */ C11663a(C11665g gVar) {
            this();
        }

        /* renamed from: a */
        public final String mo35842a(Class<?> cls) {
            String str;
            C11669k.m56787e(cls, "jClass");
            String str2 = null;
            if (!cls.isAnonymousClass()) {
                if (cls.isLocalClass()) {
                    String simpleName = cls.getSimpleName();
                    Method enclosingMethod = cls.getEnclosingMethod();
                    if (enclosingMethod != null) {
                        C11669k.m56786d(simpleName, MediationMetaData.KEY_NAME);
                        String c0 = C13011o.m61289c0(simpleName, enclosingMethod.getName() + '$', (String) null, 2, (Object) null);
                        if (c0 != null) {
                            return c0;
                        }
                    }
                    Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                    if (enclosingConstructor != null) {
                        C11669k.m56786d(simpleName, MediationMetaData.KEY_NAME);
                        return C13011o.m61289c0(simpleName, enclosingConstructor.getName() + '$', (String) null, 2, (Object) null);
                    }
                    C11669k.m56786d(simpleName, MediationMetaData.KEY_NAME);
                    return C13011o.m61288b0(simpleName, '$', (String) null, 2, (Object) null);
                } else if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    if (componentType.isPrimitive() && (str = (String) C11662e.f44235g.get(componentType.getName())) != null) {
                        str2 = str + "Array";
                    }
                    if (str2 == null) {
                        return "Array";
                    }
                } else {
                    String str3 = (String) C11662e.f44235g.get(cls.getName());
                    return str3 == null ? cls.getSimpleName() : str3;
                }
            }
            return str2;
        }
    }

    static {
        int i = 0;
        List f = C10522j.m52970f(C12428a.class, C12439l.class, C12443p.class, C12444q.class, C12445r.class, C12446s.class, C12447t.class, C12448u.class, C12449v.class, C12450w.class, C12429b.class, C12430c.class, C12431d.class, C12432e.class, C12433f.class, C12434g.class, C12435h.class, C12436i.class, C12437j.class, C12438k.class, C12440m.class, C12441n.class, C12442o.class);
        ArrayList arrayList = new ArrayList(C10523k.m52973i(f, 10));
        for (Object next : f) {
            int i2 = i + 1;
            if (i < 0) {
                C10522j.m52972h();
            }
            arrayList.add(C10346p.m52247a((Class) next, Integer.valueOf(i)));
            i = i2;
        }
        f44231c = C10508b0.m52919k(arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f44232d = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f44233e = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        C11669k.m56786d(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            C11669k.m56786d(str, "kotlinName");
            sb.append(C13011o.m61291e0(str, '.', (String) null, 2, (Object) null));
            sb.append("CompanionObject");
            String sb2 = sb.toString();
            C10340l a = C10346p.m52247a(sb2, str + ".Companion");
            hashMap3.put(a.mo33175c(), a.mo33176d());
        }
        for (Map.Entry next2 : f44231c.entrySet()) {
            int intValue = ((Number) next2.getValue()).intValue();
            String name = ((Class) next2.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        f44234f = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C10506a0.m52901b(hashMap3.size()));
        for (Map.Entry entry : hashMap3.entrySet()) {
            linkedHashMap.put(entry.getKey(), C13011o.m61291e0((String) entry.getValue(), '.', (String) null, 2, (Object) null));
        }
        f44235g = linkedHashMap;
    }

    public C11662e(Class<?> cls) {
        C11669k.m56787e(cls, "jClass");
        this.f44236a = cls;
    }

    /* renamed from: a */
    public String mo35838a() {
        return f44230b.mo35842a(mo35837b());
    }

    /* renamed from: b */
    public Class<?> mo35837b() {
        return this.f44236a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C11662e) && C11669k.m56783a(C12224a.m58666b(this), C12224a.m58666b((C12890c) obj));
    }

    public int hashCode() {
        return C12224a.m58666b(this).hashCode();
    }

    public String toString() {
        return mo35837b().toString() + " (Kotlin reflection is not available)";
    }
}
