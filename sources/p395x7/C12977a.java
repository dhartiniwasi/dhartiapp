package p395x7;

import p302n7.C11941e0;

/* renamed from: x7.a */
/* compiled from: Event */
public class C12977a<T> {

    /* renamed from: a */
    private final Class<T> f47236a;

    /* renamed from: b */
    private final T f47237b;

    public C12977a(Class<T> cls, T t) {
        this.f47236a = (Class) C11941e0.m57671b(cls);
        this.f47237b = C11941e0.m57671b(t);
    }

    /* renamed from: a */
    public T mo38038a() {
        return this.f47237b;
    }

    /* renamed from: b */
    public Class<T> mo38039b() {
        return this.f47236a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", new Object[]{this.f47236a, this.f47237b});
    }
}
