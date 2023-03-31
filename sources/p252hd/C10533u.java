package p252hd;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C11669k;

/* renamed from: hd.u */
/* compiled from: Maps.kt */
final class C10533u implements Map, Serializable {

    /* renamed from: a */
    public static final C10533u f41553a = new C10533u();

    private C10533u() {
    }

    /* renamed from: b */
    public boolean mo33693b(Void voidR) {
        C11669k.m56787e(voidR, "value");
        return false;
    }

    /* renamed from: c */
    public Void get(Object obj) {
        return null;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return false;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return mo33693b((Void) obj);
    }

    /* renamed from: d */
    public Set<Map.Entry> mo33698d() {
        return C10534v.f41554a;
    }

    /* renamed from: e */
    public Set<Object> mo33699e() {
        return C10534v.f41554a;
    }

    public final /* bridge */ Set<Map.Entry> entrySet() {
        return mo33698d();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    /* renamed from: f */
    public int mo33702f() {
        return 0;
    }

    /* renamed from: g */
    public Collection mo33703g() {
        return C10532t.f41552a;
    }

    /* renamed from: h */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public final /* bridge */ Set<Object> keySet() {
        return mo33699e();
    }

    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo33702f();
    }

    public String toString() {
        return "{}";
    }

    public final /* bridge */ Collection values() {
        return mo33703g();
    }
}
