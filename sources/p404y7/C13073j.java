package p404y7;

/* renamed from: y7.j */
/* compiled from: User */
public final class C13073j {

    /* renamed from: b */
    public static final C13073j f47326b = new C13073j((String) null);

    /* renamed from: a */
    private final String f47327a;

    public C13073j(String str) {
        this.f47327a = str;
    }

    /* renamed from: a */
    public String mo38098a() {
        return this.f47327a;
    }

    /* renamed from: b */
    public boolean mo38099b() {
        return this.f47327a != null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13073j.class != obj.getClass()) {
            return false;
        }
        String str = this.f47327a;
        String str2 = ((C13073j) obj).f47327a;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f47327a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "User(uid:" + this.f47327a + ")";
    }
}
