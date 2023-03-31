package p170y0;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* renamed from: y0.c */
/* compiled from: ContentUriTriggers */
public final class C6085c {

    /* renamed from: a */
    private final Set<C6086a> f29471a = new HashSet();

    /* renamed from: y0.c$a */
    /* compiled from: ContentUriTriggers */
    public static final class C6086a {

        /* renamed from: a */
        private final Uri f29472a;

        /* renamed from: b */
        private final boolean f29473b;

        C6086a(Uri uri, boolean z) {
            this.f29472a = uri;
            this.f29473b = z;
        }

        /* renamed from: a */
        public Uri mo20908a() {
            return this.f29472a;
        }

        /* renamed from: b */
        public boolean mo20909b() {
            return this.f29473b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C6086a.class != obj.getClass()) {
                return false;
            }
            C6086a aVar = (C6086a) obj;
            if (this.f29473b != aVar.f29473b || !this.f29472a.equals(aVar.f29472a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f29472a.hashCode() * 31) + (this.f29473b ? 1 : 0);
        }
    }

    /* renamed from: a */
    public void mo20903a(Uri uri, boolean z) {
        this.f29471a.add(new C6086a(uri, z));
    }

    /* renamed from: b */
    public Set<C6086a> mo20904b() {
        return this.f29471a;
    }

    /* renamed from: c */
    public int mo20905c() {
        return this.f29471a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6085c.class != obj.getClass()) {
            return false;
        }
        return this.f29471a.equals(((C6085c) obj).f29471a);
    }

    public int hashCode() {
        return this.f29471a.hashCode();
    }
}
